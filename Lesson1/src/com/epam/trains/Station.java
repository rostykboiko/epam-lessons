package com.epam.trains;

import java.util.Date;

public class Station {
    private String title;
    private Date timeComes;
    private Date timeDeparture;

    public Station(String title) {
        this.title = title;
    }

    Station(String title, Date timeComes, Date timeDeparture) {
        this.title = title;
        this.timeComes = timeComes;
        this.timeDeparture = timeDeparture;
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

    public Date getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(Date timeDeparture) {
        this.timeDeparture = timeDeparture;
    }
}
