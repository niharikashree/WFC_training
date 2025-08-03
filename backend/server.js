const express = require('express');
const mysql = require('mysql');
const cors = require('cors');
const bodyParser = require('body-parser');
const bcrypt = require('bcryptjs');

const app = express();
const port = 3000;

app.use(cors());
app.use(bodyParser.json());

// MySQL connection configuration
const db = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '', // <-- your MySQL password here
  database: 'Login_system'
});

// Connect to MySQL
db.connect((err) => {
  if (err) {
    console.error('MySQL connection error:', err);
    process.exit(1); // Exit if no DB connection
  }
  console.log('Connected to MySQL database');
});

// --- Signup Route ---
app.post('/signup', (req, res) => {
  const { name, email, password } = req.body;

  if (!name || !email || !password) {
    return res.status(400).json({ message: 'Name, email, and password are required.' });
  }

  // Hash the password before storing
  const hashedPassword = bcrypt.hashSync(password, 10);

  const sql = 'INSERT INTO users (name, email, password) VALUES (?, ?, ?)';
  db.query(sql, [name, email, hashedPassword], (err, result) => {
    if (err) {
      if (err.code === 'ER_DUP_ENTRY') {
        return res.status(400).json({ message: 'Email already registered.' });
      }
      console.error('DB insert error:', err);
      return res.status(500).json({ message: 'Database error during signup.' });
    }
    res.status(200).json({ message: 'Signup successful!' });
  });
});

// --- Login Route ---
app.post('/login', (req, res) => {
  const { email, password } = req.body;

  if (!email || !password) {
    return res.status(400).json({ message: 'Email and password are required.' });
  }

  const sql = 'SELECT * FROM users WHERE email = ?';
  db.query(sql, [email], (err, results) => {
    if (err) {
      console.error('DB query error:', err);
      return res.status(500).json({ message: 'Database error during login.' });
    }

    if (results.length === 0) {
      return res.status(401).json({ message: 'Invalid email or password.' });
    }

    const user = results[0];
    // Compare password with hashed password
    const passwordMatch = bcrypt.compareSync(password, user.password);
    if (!passwordMatch) {
      return res.status(401).json({ message: 'Invalid email or password.' });
    }

    // Login successful
    return res.status(200).json({ message: 'Login successful!' });
  });
});

// --- Forgot Password Route ---
app.post('/forgot', (req, res) => {
  const { email, newPassword } = req.body;

  if (!email || !newPassword) {
    return res.status(400).json({ message: 'Email and new password are required.' });
  }

  const hashedPassword = bcrypt.hashSync(newPassword, 10);

  // Verify user exists first
  const checkSql = 'SELECT * FROM users WHERE email = ?';
  db.query(checkSql, [email], (err, results) => {
    if (err) {
      console.error('DB query error:', err);
      return res.status(500).json({ message: 'Database error during password reset.' });
    }

    if (results.length === 0) {
      return res.status(404).json({ message: 'User with this email does not exist.' });
    }

    // Update password
    const updateSql = 'UPDATE users SET password = ? WHERE email = ?';
    db.query(updateSql, [hashedPassword, email], (err2, result2) => {
      if (err2) {
        console.error('DB update error:', err2);
        return res.status(500).json({ message: 'Database error during password update.' });
      }

      return res.status(200).json({ message: 'Password updated successfully!' });
    });
  });
});

// Default Route (optional)
app.get('/', (req, res) => {
  res.send('Welcome to the Login System backend!');
});

// Start the server
app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});
