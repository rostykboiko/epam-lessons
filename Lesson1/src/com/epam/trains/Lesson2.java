package com.epam.trains;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Lesson2 {
    private Date time = new Date();
    private Random random = new Random();
    private ArrayList<Train> trainsArray;
    private ArrayList<Station> stationArrayList;
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        InitData initData = new InitData();
        trainsArray = initData.initTrains();

        selection();

    }

    private void selection() {
        System.out.println("Select option: \n" +
                "1. Search train by stations.\n" +//done
                "2. Search trains after.\n" +
                "3. Search by availability\n");

        int index = scanner.nextInt();
        if (index == 1) {
            System.out.print("Enter departure station title: ");
            String stationDepartureTitle = scanner.next();
            if (isStation(stationDepartureTitle)) {
                System.out.println("Station exist");
            } else {
                System.out.println("Station doesn`t exist");
            }
            System.out.print("Enter destination station title: ");

            String stationDestinationTitle = scanner.next();
            if (isStation(stationDestinationTitle)) {
                System.out.println("Station exist");
            } else {
                System.out.println("Station doesn`t exist");
            }

            printTrainsList(getTrainsByStation(stationDepartureTitle, stationDestinationTitle));
            selection();

        } else if (index == 2) {
            System.out.println("Enter station: ");
            String stationTitle = scanner.next();
            if (isStation(stationTitle)) {
                System.out.println("Station exist");
            } else {
                System.out.println("Station doesn`t exist");
            }
            printTrainsList(getTrainsAfter(time, stationTitle));
            selection();

        } else if (index == 3) {
            printTrainsList(getAvailableTrains());

            selection();

        } else if (index == 0) {
            System.exit(0);

        }
    }

    private ArrayList<Train> getTrainsAfter(Date time, String currentStation) {
        ArrayList<Train> newTrainsArray = new ArrayList<>();
        trainsArray.forEach(train ->
                train.getStationArrayList().forEach(station -> {
                    if (station.getTimeDeparture().after(time) && station.getTitle().equals(currentStation))
                        newTrainsArray.add(train);
                }));

        return newTrainsArray;
    }

    private ArrayList<Train> getAvailableTrains() {
        ArrayList<Train> availableTrains = new ArrayList<>();

        trainsArray.forEach(train -> {
            if (train.getAvailableSeats() > 0) {
                availableTrains.add(train);
            }
        });

        return availableTrains;
    }

    private ArrayList<Train> getTrainsByStation(String stationDepartureTitle, String stationDestinationTitle) {
        Station fromStation, toStation;
        ArrayList<Station> stationsList = getStationArrayList();
        fromStation = stationsList.stream().filter(station ->
                station.getTitle().contains(stationDepartureTitle)).findFirst().orElse(null);
        toStation = stationsList.stream().filter(station ->
                station.getTitle().contains(stationDestinationTitle)).findFirst().orElse(null);

        ArrayList<Train> searchedTrainsList = new ArrayList<>();
        if (fromStation != null || toStation != null || trainsArray != null) {
            trainsArray.forEach(train -> {
                if (train.getStationArrayList().indexOf(fromStation) < train.getStationArrayList().indexOf(toStation)) {
                    searchedTrainsList.add(train);
                }
            });
        }
        return searchedTrainsList;
    }

    private void printTrainsList(ArrayList<Train> trains) {
        trains.forEach(train ->
                System.out.println("Train num: " + train.getTrainNum()));
    }

    private ArrayList<Station> getStationArrayList() {
        ArrayList<Station> allStation = new ArrayList<>();

        trainsArray.forEach(train ->
                train.getStationArrayList().forEach(station -> {
                    if (!allStation.contains(station)) {
                        allStation.add(station);
                    }
                }));
        return allStation;
    }

    private boolean isStation(String title) {
        return getStationArrayList().stream().anyMatch(station ->
                station.getTitle().contains(title));
    }

    private void newOrder() {
        System.out.println("Enter number of tickets you want to order: ");
        int numberOfTickets = scanner.nextInt();
        Station fromStation = new Station("Lviv");
        Station toStation = new Station("Kiev");
        int index = 1;

        Ticket[] ticketsArray = new Ticket[numberOfTickets];
        for (Ticket ticket : ticketsArray) {
            ticket = new Ticket();
            ticket.setTicketNumber(random.nextInt(1000));
            System.out.println("Enter number of train: ");
            ticket.setTrain(scanner.nextInt());
            System.out.println("Enter number of carriage: ");
            ticket.setCarriage(scanner.nextInt());
            System.out.println("Enter number of seat: ");
            ticket.setSeat(scanner.nextInt());
            System.out.println("Enter departing station: ");
            ticket.setFromStation(fromStation);
            System.out.println("Enter number of carriage : ");
            ticket.setToStation(toStation);
            index++;
        }
    }
}
