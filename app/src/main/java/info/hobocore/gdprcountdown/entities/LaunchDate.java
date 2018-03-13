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
        String days = TimeLeft.getDaysLeft(timestamp);
        String hours = TimeLeft.getHoursLeft(timestamp);
        String minutes = TimeLeft.getMinutesLeft(timestamp);
        String seconds = TimeLeft.getSecondsLeft(timestamp);

        return days + ":" + hours + ":" + minutes + ":" + seconds;
    }
}
