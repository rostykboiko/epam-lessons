package com.epam.trains;

public class Tickets {
    private int ticketNumber;
    private int train;
    private int carriage;
    private int seat;

    public Tickets(int ticketNumber, int train, int carriage, int seat) {
        this.ticketNumber = ticketNumber;
        this.train = train;
        this.carriage = carriage;
        this.seat = seat;
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
}
