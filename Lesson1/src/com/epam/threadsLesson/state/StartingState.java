package com.epam.threadsLesson.state;

import com.epam.threadsLesson.Car;

public class StartingState extends CarState {

    public StartingState(Car car) {
        super(car);
    }

    @Override
    public CarState getState() {
        return this;
    }

    @Override
    public String getStateLabel() {
        return "Starting CarState";
    }

    @Override
    public int getStateDuration() {
        return 200;
    }

    @Override
    public CarState nextState() {
        return new Foamed(car);
    }
}
