<!DOCTYPE html>
<html lang="uk">
<head>
    <meta charset="UTF-8">
    <title>Анкета</title>
</head>
<body>
<h1>Human Form</h1>
<form action="formServ" method="post">
    <label for="name">SNP: </label>
    <input type="text" id="name" name="name" required><br><br>
    <label for="phone">Phone: </label>
    <input type="text" id="phone" name="phone" required><br><br>
    <label for="email">Email: </label>
    <input type="email" id="email" name="email" required><br><br>
    <label for="age">Age: </label>
    <input type="number" id="age" name="age" required><br><br>
    <input type="submit" value="Sent">
</form>
</body>
</html>
