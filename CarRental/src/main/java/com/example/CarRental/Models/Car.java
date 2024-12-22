package com.example.CarRental.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data

public class Car {
    //товаров может быть бесчисленное множество из-за этого тип данных long
    private long ID;
    private String title;
    private String desc;
    private int price;
    private double consumption;
    private String typeRental;
}