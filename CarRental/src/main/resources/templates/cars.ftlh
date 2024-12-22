<!DOCTYPE html>
<html>
<head>
    <title>CAR_RENTAL</title>
</head>
<body>
<H1>Car rental</H1>
<hr>
<h4>Cars of any category </h4>
<#list cars as car>
    <div><p>
            <b>${car.title}</b>
            ${car.description}
            ${car.category}
            ${car.year}
            ${car.price}
<#--            ${car.year}-->
            ${car.price}
            <a href="/car_info/${car.id}">Подробнее</a>
        </p></div>
    <hr>
    <h3>
        Add my car for rental
    </h3>
    <form action="/car/create" method="post">
        Марка машины
        <input type="text" name="title"> <br>
        Описание объявление
        <input type="text" name="desc"> <br>
        Цена
        <input type="number" name="price"> <br>
        Вид аренды
        <input type="text" name="typeRental"> <br>
        Расход топлива
        <input type="number" name="title"> <br>
        <input type="submit" value="add car"/>
    </form>
</#list>
</body>
</html>