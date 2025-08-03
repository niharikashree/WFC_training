document.getElementById('signupForm').addEventListener('submit', async function(e) {
  e.preventDefault();

  const name = document.getElementById('name').value.trim();
  const email = document.getElementById('email').value.trim();
  const password = document.getElementById('password').value.trim();

  // Password policy: at least 6 chars, at least one number
  if (!/^(?=.*\d).{6,}$/.test(password)) {
    alert("Password must be at least 6 characters and contain at least one number!");
    return;
  }

  const res = await fetch('http://localhost:3000/signup', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ name, email, password })
  });
  const data = await res.json();
  if (res.status === 200) {
    alert('Signup successful! You can login now.');
    window.location.href = 'login.html';
  } else {
    alert(data.message || 'Signup failed');
  }
});
