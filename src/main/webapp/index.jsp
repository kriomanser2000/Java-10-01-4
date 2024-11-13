<!DOCTYPE html>
<html lang="uk">
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
<h1>User Form</h1>
<form action="formServ" method="post">
    <label for="name">SNP: </label>
    <input type="text" id="name" name="name" required><br><br>
    <label for="phone">Phone: </label>
    <input type="text" id="phone" name="phone" required><br><br>
    <label for="email">Email: </label>
    <input type="email" id="email" name="email" required><br><br>
    <label for="age">Age: </label>
    <input type="number" id="age" name="age" required><br><br>
    <label>Gender: </label>
    <input type="radio" id="male" name="gender" value="Male" required>
    <label for="male">Male</label>
    <input type="radio" id="female" name="gender" value="Female">
    <label for="female">Female</label>
    <input type="radio" id="other" name="gender" value="Other">
    <label for="other">Other</label><br><br>
    <label for="newsletter">Would you like to subscribe to our newsletter?</label>
    <input type="checkbox" id="newsletter" name="newsletter"><br><br>
    <input type="submit" value="Sent">
</form>
</body>
</html>
