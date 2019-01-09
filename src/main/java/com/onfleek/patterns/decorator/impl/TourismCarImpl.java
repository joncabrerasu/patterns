package com.onfleek.patterns.decorator.impl;

import com.onfleek.patterns.decorator.Car;

public class TourismCarImpl implements Car {
    @Override
    public String decorate() {
        return "This is a tourism car";
    }
}
