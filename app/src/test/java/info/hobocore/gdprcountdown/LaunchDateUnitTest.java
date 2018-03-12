package info.hobocore.gdprcountdown;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import info.hobocore.gdprcountdown.entities.LaunchDate;

import static org.junit.Assert.*;

public class LaunchDateUnitTest {
    private LaunchDate launchDate;
    private long launchTimestamp = 1527206400;

    @Before
    public void setUp() {
        Date launchDateObj = new Date(launchTimestamp);
        launchDate = new LaunchDate(launchDateObj);
    }

    @Test
    public void testCreation() {
        assertEquals(launchTimestamp, launchDate.getDate());
    }

    @Test
    public void testTimeLeft() {
        long now = new Date().getTime() / 1000;
        long difference = launchTimestamp - now;

        assertEquals(difference, launchDate.getTimeLeft());
    }

    @Test
    public void testStringFormat() {
        long now = new Date().getTime() / 1000;
        long difference = launchTimestamp - now;
        String testFormat = launchDate.asString(difference);

        assertEquals(testFormat, launchDate.asString(launchDate.getTimeLeft()));
    }
}
