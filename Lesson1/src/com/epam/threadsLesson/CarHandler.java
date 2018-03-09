package com.epam.threadsLesson;


import com.epam.threadsLesson.state.CarState;

import javax.security.auth.callback.Callback;

public class CarHandler {
    private Callback callback;
    private CarState carState;
    private Car car = new Car();

    private void main(){
        Thread cleanCar = new Thread(() -> {
            try {
                car.getState().nextState();
                Thread.sleep(car.getState().getStateDuration());
            } catch (Exception e){
                e.printStackTrace();
            } });
        cleanCar.start();
    }

    public void registerCallBack(Callback callback) {
        this.callback = callback;

    }

}


