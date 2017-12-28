package com.epam.lesson2;

import java.util.ArrayList;
import java.util.Date;

class Train {
    private String trainNum;
    private ArrayList<Station> stationArrayList;

    Train(){
    }

    Train(String trainNum, ArrayList stationArrayList) {
        this.trainNum = trainNum;
        this.stationArrayList = stationArrayList;
    }

    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
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
            if (station.getTimeComes().after(time) && station.getTimeDepature().before(time)) {
                return station;
            }
        }
        return null;
    }


}
