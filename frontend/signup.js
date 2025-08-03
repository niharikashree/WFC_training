document.getElementById('signupForm').addEventListener('submit', async function(e) {
  e.preventDefault();
  const name = document.getElementById('name').value.trim();
  const email = document.getElementById('email').value.trim();
  const password = document.getElementById('password').value.trim();

  // Basic password validation: at least 6 chars with a number
  if (!/^(?=.*\d).{6,}$/.test(password)) {
    alert("Password must be at least 6 characters and include a number.");
    return;
  }

  const res = await fetch('http://localhost:3000/signup', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ name, email, password })
  });
  const data = await res.json();
  if (res.status === 200) {
    alert("Signup successful! Please login.");
    window.location.href = 'login.html';
  } else {
    alert(data.message || "Signup failed.");
  }
});
