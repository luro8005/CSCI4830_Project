package com.example.realc.jar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WeeklyTasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_tasks);
    }

    public void DayTasks(View view) {
        Intent intent = new Intent(this, DayTasks.class);
        startActivity(intent);
    }

    public void WeeklyTask (View view) {
        Intent intent = new Intent(this, SpecificWeeklyTasks.class);
        startActivity(intent);
    }

    public void Calendar(View view) {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }
}
