package com.epam.workflow;

import com.epam.workflow.task.CloseState;
import com.epam.workflow.task.Task;
import com.epam.workflow.task.OpenState;

public class StatePattern {
    public static void main(String[] args) {
        Task task = new Task();

        OpenState startState = new OpenState();
        startState.doAction(task);
        startState.doAction(task);

        CloseState stopState = new CloseState();
        stopState.doAction(task);
        stopState.doAction(task);

    }
}