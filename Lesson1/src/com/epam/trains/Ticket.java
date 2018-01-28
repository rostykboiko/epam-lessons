package com.epam.trains;

public class Ticket {
    private int ticketNumber;
    private int train;
    private int carriage;
    private int seat;
    private Station fromStation;
    private Station toStation;

    public Ticket(){}

    public Ticket(int ticketNumber, int train, int carriage, int seat, Station fromStation, Station toStation) {
        this.ticketNumber = ticketNumber;
        this.train = train;
        this.carriage = carriage;
        this.seat = seat;
        this.fromStation = fromStation;
        this.toStation = toStation;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTrain() {
        return train;
    }

    public void setTrain(int train) {
        this.train = train;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Station getFromStation() {
        return fromStation;
    }

    public void setFromStation(Station fromStation) {
        this.fromStation = fromStation;
    }

    public Station getToStation() {
        return toStation;
    }

    public void setToStation(Station toStation) {
        this.toStation = toStation;
    }
}
