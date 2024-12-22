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
<form action="/car/delete/${car.id }" method="post">
        <input type="submit" value="Добавить автомобиль">
</form>
</body>
</html>
