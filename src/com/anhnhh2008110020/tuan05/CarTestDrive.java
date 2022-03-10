package com.anhnhh2008110020.tuan05;

import oo.Car;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("Xanh");
        car.setCarPrice(0);
        System.out.println("CarColor : "+car.getCarColor());
        System.out.println("CarPricce: "+car.getCarPrice());

    }
    
}
