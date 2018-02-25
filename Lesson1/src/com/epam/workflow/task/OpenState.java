package com.epam.workflow.task;

public class OpenState implements State {

    public String toString(){
        return "Open State";
    }

    @Override
    public void doAction(Task task) {
        if (task.getState() == null) {
            System.out.println("Task is open");
            task.setState(this);
        } else if (task.getState().toString().equals("Open State")) {
            System.out.println("Task is reopened");
            task.setState(this);
        } else {
            System.out.println("Task already opened");
        }

    }
}