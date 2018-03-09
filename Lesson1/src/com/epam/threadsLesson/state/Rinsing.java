package com.epam.threadsLesson.state;

import com.epam.threadsLesson.Car;

// Полоскання
public class Rinsing extends CarState {
    Rinsing(Car car) {
        super(car);
    }

    @Override
    public CarState getState() {
        return this;
    }

    @Override
    public String getStateLabel() {
        return "Rinsing CarState";
    }

    @Override
    public int getStateDuration() {
        return 1000;
    }

    @Override
    public CarState nextState() {
        return new FinalState(car);
    }
}
