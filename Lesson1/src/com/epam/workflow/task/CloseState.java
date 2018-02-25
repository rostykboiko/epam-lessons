package com.epam.workflow.task;

public class CloseState implements State {

    public String toString() {
        return "Closed State";
    }

    @Override
    public void doAction(Task task) {
        if (task.getState().toString().equals("Open State")){
            System.out.println("Task is close");
            task.setState(this);
        }   else {
            System.out.println("Task can`t be closed");
        }
    }
}
