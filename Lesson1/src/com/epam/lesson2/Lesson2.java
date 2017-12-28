package com.epam.lesson2;

import java.util.ArrayList;
import java.util.Date;

public class Lesson2 {
    private Date time = new Date();
    private ArrayList<Train> trainsArray;
    private ArrayList<Station> stationArrayList;

    public void run() {
        Train train = new Train();
        getTrainCurrentStation(trainsArray);
        getTrainsNextStation(train);
        getTrainsForStation();

        getTrainsAfter(time);
    }
//    private void initTrains(){
//        stationArrayList = new ArrayList<>();
//        stationArrayList.add(new Station("Lviv", "15:45", "16:00"));
//        stationArrayList.add(new Station("Kiev", "15:45", "16:00"));
//        stationArrayList.add(new Station("Odessa", "15:45", "16:00"));
//        stationArrayList.add(new Station("London", "15:45", "16:00"));
//        stationArrayList.add(new Station("Linz", "15:45", "16:00"));
//        stationArrayList.add(new Station("Vien", "15:45", "16:00"));
//
//        Train train = new Train("0001", stationArrayList);
//        trainsArray.add(train);
//
//        train = new Train("0002", stationArrayList);
//        stationArrayList = new ArrayList<>();
//        stationArrayList.add(new Station("Linz", "15:45", "16:00"));
//        stationArrayList.add(new Station("Vien", "15:45", "16:00"));
//        stationArrayList.add(new Station("London", "15:45", "16:00"));
//        stationArrayList.add(new Station("Odessa", "15:45", "16:00"));
//        stationArrayList.add(new Station("Kiev", "15:45", "16:00"));
//        stationArrayList.add(new Station("Lviv", "15:45", "16:00"));
//
//        trainsArray.add(train);
//    }

    private Station getTrainCurrentStation(ArrayList<Train> trainsArray) {
        return trainsArray.get(0).getCurrentStation(time);
    }

    private Station getTrainsNextStation(Train train) {
        Station station = train.getCurrentStation(time);
        int index = train.getStationArrayList().indexOf(station);
        return train.getStationArrayList().get(index + 1);
    }

    private ArrayList<Train> getTrainsAfter(Date time) {
        ArrayList<Train> newTrainsArray = new ArrayList<>();
        if (trainsArray.get(0).getStationArrayList().get(0).getTimeDepature().before(time)) {
            newTrainsArray.add(trainsArray.get(0));
        }
        return newTrainsArray;
    }

    private ArrayList<Train> getTrainsForStation() {
        Station station = new Station();
        ArrayList<Train> newTrainList = new ArrayList<>();
        int index = trainsArray.get(0).getStationArrayList().indexOf(station);
        newTrainList.add(trainsArray.get(index));

        return newTrainList;
    }
}
