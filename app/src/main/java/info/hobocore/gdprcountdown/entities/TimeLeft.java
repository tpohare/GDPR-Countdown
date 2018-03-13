package info.hobocore.gdprcountdown.entities;

import android.annotation.SuppressLint;

@SuppressLint("DefaultLocale")
public class TimeLeft {
    public static String getDaysLeft(long timestamp) {
        long daysNumber = timestamp / 86400;

        return String.format("%02d", daysNumber);
    }

    public static String getHoursLeft(long timestamp) {
        long hoursNumber = timestamp % 86400 / 3600;

        return String.format("%02d", hoursNumber);
    }

    public static String getMinutesLeft(long timestamp) {
        long minutesNumber = timestamp % 3600 / 60;

        return String.format("%02d", minutesNumber);
    }

    public static String getSecondsLeft(long timestamp) {
        long secondsNumber = timestamp % 60;

        return String.format("%02d", secondsNumber);
    }
}
