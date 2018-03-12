package info.hobocore.gdprcountdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Date;

import info.hobocore.gdprcountdown.entities.LaunchDate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setLaunchDate() {
        Date launchTimestamp = new Date(1527206400);
        LaunchDate launchDate = new LaunchDate(launchTimestamp);
    }
}
