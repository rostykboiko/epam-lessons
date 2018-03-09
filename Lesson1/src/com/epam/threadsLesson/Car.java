package com.epam.threadsLesson;

import com.epam.threadsLesson.state.CarState;
import com.epam.threadsLesson.state.StartingState;

public class Car {
    public CarState state;
    Car(){
        this.state = new StartingState(this);
    }

    public CarState getState() {
        return state;
    }

    public void nextState(CarState state) {
        this.state = state;
    }
}
