package com.onfleek.patterns.decorator;

import com.onfleek.patterns.decorator.decorator.BigWheelsCar;
import com.onfleek.patterns.decorator.decorator.RedPaintedCar;
import com.onfleek.patterns.decorator.impl.SUVCarImpl;
import com.onfleek.patterns.decorator.impl.TourismCarImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarDecoratorTest {

    @Test
    public void decorateTourismAsRedCar() {
        Car tourismCar = new TourismCarImpl();
        Car redPaintedCar = new RedPaintedCar(tourismCar);
        assertEquals("This is a tourism car with red paint", redPaintedCar.decorate());
    }

    @Test
    public void decorateSUVCarWithBigWheels() {
        Car suvCar = new SUVCarImpl();
        BigWheelsCar bigWheelsCar = new BigWheelsCar(suvCar);
        assertEquals("This is a SUV car with big wheels", bigWheelsCar.decorate());
    }

    @Test
    public void decorateTourismCarWithBigWheelsAndRedPaint() {
        Car tourismCar = new TourismCarImpl();
        BigWheelsCar bigWheelsCar = new BigWheelsCar(tourismCar);
        Car bigWheelsRedPaintedCar = new RedPaintedCar(bigWheelsCar);
        assertEquals("This is a tourism car with big wheels with red paint", bigWheelsRedPaintedCar.decorate());
    }
}