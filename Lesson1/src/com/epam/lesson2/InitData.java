package com.epam.lesson2;

import java.util.ArrayList;
import java.util.Date;

public class InitData {
    public ArrayList<Train> initTrains() {
        ArrayList<Train> trainsArray = new ArrayList<>();
        ArrayList<Station> stationArrayList = new ArrayList<>();
        stationArrayList.add(new Station("Lviv",
                new Date(2018, 3, 5, 12, 0),
                new Date(2018, 3, 5, 12, 15)));
        stationArrayList.add(new Station("Kiev",
                new Date(2018, 3, 5, 13, 0),
                new Date(2018, 3, 5, 13, 15)));
        stationArrayList.add(new Station("Odessa",
                new Date(2018, 3, 5, 15, 0),
                new Date(2018, 3, 5, 15, 15)));
        stationArrayList.add(new Station("London",
                new Date(2018, 3, 5, 18, 0),
                new Date(2018, 3, 5, 18, 15)));
        stationArrayList.add(new Station("Linz",
                new Date(2018, 3, 5, 19, 0),
                new Date(2018, 3, 5, 19, 15)));
        stationArrayList.add(new Station("Vien",
                new Date(2018, 3, 5, 20, 0),
                new Date(2018, 3, 5, 20, 15)));
        Train train = new Train(1, 0, 99, stationArrayList);
        trainsArray.add(train);

        stationArrayList = new ArrayList<>();
        stationArrayList.add(new Station("Linz",
                new Date(2018, 3, 5, 21, 0),
                new Date(2018, 3, 5, 21, 15)));
        stationArrayList.add(new Station("Vien",
                new Date(2018, 3, 5, 20, 0),
                new Date(2018, 3, 5, 20, 15)));
        stationArrayList.add(new Station("London",
                new Date(2018, 3, 5, 18, 0),
                new Date(2018, 3, 5, 18, 15)));
        stationArrayList.add(new Station("Odessa",
                new Date(2018, 3, 5, 17, 0),
                new Date(2018, 3, 5, 17, 15)));
        stationArrayList.add(new Station("Kiev",
                new Date(2018, 3, 5, 16, 0),
                new Date(2018, 3, 5, 16, 15)));
        stationArrayList.add(new Station("Lviv",
                new Date(2018, 3, 5, 13, 0),
                new Date(2018, 3, 5, 13, 15)));

        train = new Train(2, 11, 99, stationArrayList);
        trainsArray.add(train);

        stationArrayList = new ArrayList<>();
        stationArrayList.add(new Station("Linz",
                new Date(2018, 3, 5, 10, 0),
                new Date(2018, 3, 5, 10, 15)));
        stationArrayList.add(new Station("Vien",
                new Date(2018, 3, 5, 12, 0),
                new Date(2018, 3, 5, 12, 15)));
        stationArrayList.add(new Station("London",
                new Date(2018, 3, 5, 14, 0),
                new Date(2018, 3, 5, 14, 15)));
        stationArrayList.add(new Station("Odessa",
                new Date(2018, 3, 5, 15, 0),
                new Date(2018, 3, 5, 15, 30)));
        stationArrayList.add(new Station("Kiev",
                new Date(2018, 3, 5, 17, 0),
                new Date(2018, 3, 5, 17, 10)));
        stationArrayList.add(new Station("Gorodok",
                new Date(2018, 3, 5, 19, 0),
                new Date(2018, 3, 5, 19, 15)));
        train = new Train(3, 99, 99, stationArrayList);
        trainsArray.add(train);

        stationArrayList = new ArrayList<>();
        stationArrayList.add(new Station("Linz",
                new Date(2010, 3, 5, 15, 0),
                new Date(2010, 3, 5, 15, 15)));
        stationArrayList.add(new Station("Vien",
                new Date(2010, 3, 5, 17, 0),
                new Date(2010, 3, 5, 17, 15)));
        stationArrayList.add(new Station("London",
                new Date(2010, 3, 5, 19, 0),
                new Date(2010, 3, 5, 19, 30)));
        stationArrayList.add(new Station("Odessa",
                new Date(2010, 3, 5, 21, 0),
                new Date(2010, 3, 5, 21, 15)));
        stationArrayList.add(new Station("Kiev",
                new Date(2010, 3, 5, 23, 0),
                new Date(2010, 3, 5, 23, 15)));
        stationArrayList.add(new Station("Gorodok",
                new Date(2010, 3, 5, 24, 0),
                new Date(2010, 3, 5, 0, 15)));

        train = new Train(4, 1, 99, stationArrayList);
        trainsArray.add(train);

        return trainsArray;
    }

}
