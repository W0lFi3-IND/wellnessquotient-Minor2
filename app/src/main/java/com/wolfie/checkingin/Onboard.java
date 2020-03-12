package com.wolfie.checkingin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Onboard extends AppCompatActivity {
ImageView water,period,calorie,mood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        water = findViewById(R.id.waterReminder);
        period = findViewById(R.id.period);
        calorie = findViewById(R.id.calorie);
        mood = findViewById(R.id.mood);

        findViewById(R.id.waterReminder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
