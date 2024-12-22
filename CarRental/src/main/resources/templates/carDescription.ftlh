<!DOCTYPE html>
<html>
<head>
    <title>CAR_RENTAL</title>
</head>
<body>
<h1>Car Rental</h1>
<hr>
<h4>Car description</h4>
<div>
    <p>
        <b>Марка:</b> ${car.title}<br>
        <b>Описание:</b> ${car.description}<br>
        <b>Категория:</b> ${car.category}<br>
        <b>Год:</b> ${car.year}<br>
        <b>Цена:</b> ${car.price}<br>
        <a href="/car_info/${car.id}">Подробнее</a>
    </p>
</div>
<hr>
<h3>Добавить автомобиль в аренду</h3>
<form action="/car/create" method="post">
    <p>
        <b>Марка машины:</b><br>
        <input type="text" name="title"><br><br>

        <b>Описание объявления:</b><br>
        <input type="text" name="desc"><br><br>

        <b>Цена:</b><br>
        <input type="number" name="price"><br><br>

        <b>Вид аренды:</b><br>
        <input type="text" name="typeRental"><br><br>

        <b>Расход топлива:</b><br>
        <input type="number" name="consumption"><br><br>

        <input type="submit" value="Добавить автомобиль">
    </p>
</form>
</body>
</html>
