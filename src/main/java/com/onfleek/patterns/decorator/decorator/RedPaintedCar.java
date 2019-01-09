package com.onfleek.patterns.decorator.decorator;

import com.onfleek.patterns.decorator.Car;
import com.onfleek.patterns.decorator.CarDecorator;

public class RedPaintedCar extends CarDecorator {

    public RedPaintedCar(Car car) {
        super(car);
    }

    public String decorate() {
        return super.decorate() + decorateWithRedPaint();
    }

    private String decorateWithRedPaint() {
        return " with red paint";
    }
}
