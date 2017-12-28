package com.epam.lesson2;

import java.util.Date;

public class Station {
    private String title;
    private Date timeComes;
    private Date timeDepature;

    public Station(){}

    public Station(String title, Date timeComes, Date timeDepature) {
        this.title = title;
        this.timeComes = timeComes;
        this.timeDepature = timeDepature;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getTimeComes() {
        return timeComes;
    }

    public void setTimeComes(Date timeComes) {
        this.timeComes = timeComes;
    }

    public Date getTimeDepature() {
        return timeDepature;
    }

    public void setTimeDepature(Date timeDepature) {
        this.timeDepature = timeDepature;
    }
}
