package com.epam.lesson2;

import java.util.ArrayList;
import java.util.Date;

public class InitData {
    public ArrayList<Train> initTrains() {
        ArrayList<Train> trainsArray = new ArrayList<>();
        ArrayList<Station> stationArrayList = new ArrayList<>();
        stationArrayList.add(new Station("Lviv",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Kiev",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Odessa",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("London",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Linz",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Vien",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        Train train = new Train(1, 0, 99, stationArrayList);
        trainsArray.add(train);

        stationArrayList = new ArrayList<>();
        stationArrayList.add(new Station("Linz",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Vien",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("London",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Odessa",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Kiev",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Lviv",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));

        train = new Train(2, 11, 99, stationArrayList);
        trainsArray.add(train);

        stationArrayList = new ArrayList<>();
        stationArrayList.add(new Station("Linz",
                new Date(2018, 3, 5, 17, 0),
                new Date(2018, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Vien",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("London",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Odessa",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Kiev",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Gorodok",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        train = new Train(3, 99, 99, stationArrayList);
        trainsArray.add(train);

        stationArrayList = new ArrayList<>();
        stationArrayList.add(new Station("Linz",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Vien",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("London",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Odessa",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Kiev",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Gorodok",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));

        train = new Train(4, 1, 99, stationArrayList);
        trainsArray.add(train);

        return trainsArray;
    }

}
