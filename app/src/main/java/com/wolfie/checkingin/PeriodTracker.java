package com.wolfie.checkingin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
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
        sharedPreferences = this.getSharedPreferences("com.example.periodtracker", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        cycledays = sharedPreferences.getString("cycledays", "");
        periodlength = sharedPreferences.getString("periodlength", "");
        Log.i("cycledays", cycledays);
        Log.i("periodlength", periodlength);

        b = findViewById(R.id.PTbutton);
        tv = findViewById(R.id.PTtextview);
        tv2 = findViewById(R.id.PTtextView2);
        tv3 = findViewById(R.id.PTtextView3);
        tv4 = findViewById(R.id.PTtextView4);

        if (cycledays.isEmpty()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Enter the cycle length");

// Set up the input
            final EditText input = new EditText(this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
            input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
            builder.setView(input);
    }
}
