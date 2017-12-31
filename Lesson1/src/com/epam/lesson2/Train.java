package com.epam.lesson2;

import java.util.ArrayList;
import java.util.Date;

class Train {
    private int trainNum;
    private int availableSeats;
    private int amountOfSeats;
    private ArrayList<Station> stationArrayList;

    Train(int trainNum, int availableSeats, int amountOfSeats, ArrayList<Station> stationArrayList) {
        this.trainNum = trainNum;
        this.availableSeats = availableSeats;
        this.amountOfSeats = amountOfSeats;
        this.stationArrayList = stationArrayList;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public int getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(int trainNum) {
        this.trainNum = trainNum;
    }

    public ArrayList<Station> getStationArrayList() {
        return stationArrayList;
    }

    public void setStationArrayList(ArrayList<Station> stationArrayList) {
        this.stationArrayList = stationArrayList;
    }

    public Station getCurrentStation(Date time) {
        for (Station station : stationArrayList) {
            if (station.getTimeComes().after(time) && station.getTimeDeparture().before(time)) {
                return station;
            }
        }
        return null;
    }


}
