package com.epam.threadsLesson.state;

import com.epam.threadsLesson.Car;

public abstract class CarState {
    public Car car;

    CarState(Car car){
        this.car = car;

    }

    abstract public CarState getState();

    abstract public String getStateLabel();

    abstract public int getStateDuration();

    abstract public CarState nextState();
}
