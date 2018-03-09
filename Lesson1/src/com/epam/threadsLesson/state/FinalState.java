package com.epam.threadsLesson.state;

import com.epam.threadsLesson.Car;

public class FinalState extends CarState {

    FinalState(Car car) {
        super(car);
    }

    @Override
    public CarState getState() {
        return this;
    }

    @Override
    public String getStateLabel() {
        return "Final CarState";
    }

    @Override
    public int getStateDuration() {
        return 500;
    }

    @Override
    public CarState nextState() {
        return null;
    }
}
