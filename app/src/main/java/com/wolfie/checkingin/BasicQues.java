package com.wolfie.checkingin;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;


public class BasicQues extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_ques);
        findViewById(R.id.maleB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.maleB).setBackgroundResource(R.drawable.femalebutton);
                findViewById(R.id.FemaleB).setBackgroundResource(R.drawable.round_button_grey);
            }
        });
        findViewById(R.id.FemaleB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.maleB).setBackgroundResource(R.drawable.round_button_grey);
                findViewById(R.id.FemaleB).setBackgroundResource(R.drawable.femalebutton);
            }
        });
        findViewById(R.id.Next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),register.class));
            }
        });
    }

}
