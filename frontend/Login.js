// Login form handler
document.getElementById('loginForm').addEventListener('submit', async function(e) {
  e.preventDefault();
  const email = document.getElementById('email').value.trim();
  const password = document.getElementById('password').value.trim();

  const res = await fetch('http://localhost:3000/login', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ email, password })
  });
  const data = await res.json();
  if (res.status === 200) {
    alert("Login successful!");
    // Redirect to home (not included), or add code here
  } else {
    alert(data.message || "Login failed.");
  }
});

// Forgot Password popup
document.getElementById('forgotBtn').addEventListener('click', function(e) {
  e.preventDefault();
  const email = prompt("Enter your email to reset password:");
  if (!email) return;
  const newPassword = prompt("Enter your new password:");
  if (!newPassword) return;

  fetch('http://localhost:3000/forgot', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ email, newPassword })
  })
    .then(res => res.json())
    .then(data => alert(data.message))
    .catch(err => alert('Error: ' + err));
});
