package com.epam.threadsLesson.state;

import com.epam.threadsLesson.Car;

// Намилення
public class Foamed extends CarState {

    Foamed(Car car) {
        super(car);
    }

    @Override
    public CarState getState() {
        return this;
    }

    @Override
    public String getStateLabel() {
        return "Foamed CarState";
    }

    @Override
    public int getStateDuration() {
        return 600;
    }

    @Override
    public CarState nextState() {
        return new Rinsing();
    }
}
