<!DOCTYPE html>
<html>
    <meta name="viewport" content="width=device-width, initial-scale=1">
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="/resource/login.css">
    <style>
        
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form method="post" action="/loginProcess">
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required >
            </div>
          

            <p style="color: red;">${Msg}</p>
            <button type="submit" class="btn">Login</button>
        </form>
        <div class="options">
            <p>Don't have an account? <a href="#">Sign up</a></p>
            <p><a href="#">Forgot your password?</a></p>
        </div>
    </div>
</body>
</html>