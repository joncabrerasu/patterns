package com.onfleek.patterns.decorator.decorator;

import com.onfleek.patterns.decorator.Car;
import com.onfleek.patterns.decorator.CarDecorator;

public class BigWheelsCar extends CarDecorator {
    public BigWheelsCar(Car car) {
        super(car);
    }

    public String decorate() {
        return super.decorate() + decorateWithBigWheels();
    }

    private String decorateWithBigWheels() {
        return " with big wheels";
    }
}
