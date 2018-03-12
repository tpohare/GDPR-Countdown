package info.hobocore.gdprcountdown.entities;

import android.annotation.SuppressLint;

import java.util.Date;

public class LaunchDate {
    private Date date;

    public LaunchDate(Date date) {
        this.date = date;
    }

    public long getDate() {
        return this.date.getTime();
    }

    public long getTimeLeft() {
        long now = new Date().getTime() / 1000;

        return this.getDate() - now;
    }

    @SuppressLint("DefaultLocale")
    public String asString(long timestamp) {
        long secondsNumber = timestamp % 60;
        long minutesNumber = timestamp % 3600 / 60;
        long hoursNumber = timestamp % 86400 / 3600;
        long daysNumber = timestamp / 86400;

        String days = String.valueOf(daysNumber);
        String hours = String.format("%02d", hoursNumber);
        String minutes = String.format("%02d", minutesNumber);
        String seconds = String.format("%02d", secondsNumber);

        return days + ":" + hours + ":" + minutes + ":" + seconds;
    }
}
