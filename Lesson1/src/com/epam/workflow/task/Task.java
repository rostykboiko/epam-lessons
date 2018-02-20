package com.epam.workflow.task;

public class Task {
    private State state;

    public Task(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}