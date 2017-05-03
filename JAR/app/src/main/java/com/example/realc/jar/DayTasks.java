package com.example.realc.jar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.id.message;

public class DayTasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_tasks);
    }

    public void SpecTask1(View view) {
        Intent intent = new Intent(this, SpecificDailyTasks.class);
        startActivity(intent);
    }

    public void SpecTask2(View view) {
        Intent intent = new Intent(this, SpecificDailyTasks2.class);
        startActivity(intent);
    }

    public void SpecTask3(View view) {
        Intent intent = new Intent(this, SpecificDailyTasks3.class);
        startActivity(intent);
    }

    public void SpecTask4(View view) {
        Intent intent = new Intent(this, SpecificDailyTasks4.class);
        startActivity(intent);
    }

    public void SpecTask5(View view) {
        Intent intent = new Intent(this, SpecificDailyTasks5.class);
        startActivity(intent);
    }
}
