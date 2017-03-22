package com.example.realc.jar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MainTasks(View view) {
        Intent intent = new Intent(this, DayTasks.class);
        startActivity(intent);
    }

    public void weeklyTask(View view) {
        Intent intent = new Intent(this, WeeklyTasks.class);
        startActivity(intent);
    }

    public void Settings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void History(View view) {
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }

    public void Narrative(View view) {
        Intent intent = new Intent(this, Narrative.class);
        startActivity(intent);
    }

}
