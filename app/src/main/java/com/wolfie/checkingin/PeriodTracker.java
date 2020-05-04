package com.wolfie.checkingin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PeriodTracker extends AppCompatActivity {
    private String m_Text = "";
    private String p_Text = "";
    SharedPreferences sharedPreferences;
    private String cycledays = "";
    private String ovulation_days = "";
    private String periodlength = "";
    private String save_day = "";
    private String save_month = "";
    private String save_year = "";
    private String ovulation_date = "";
    private String next_period_date = "";
    private String chance_of_getting_pregnant = "";
    Button b;
    TextView tv, tv2, tv3, tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period_tracker);
    }
}
