package com.wolfie.checkingin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

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
            // Set up the buttons
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Log.i("Hi","Hi");
                    m_Text = input.getText().toString();
                    Log.i("Hi", m_Text);
                    editor.putString("cycledays", m_Text);
                    editor.commit();
                    cycledays = sharedPreferences.getString("cycledays", "");
                }
            });

            builder.show();
        }

        if (periodlength.isEmpty()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Enter the period length");
            // Set up the input
            final EditText input = new EditText(this);
// Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
            input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_NORMAL);
            builder.setView(input);

// Set up the buttons
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Log.i("Hi","Hi");
                    p_Text = input.getText().toString();
                    Log.i("Hi", m_Text);
                    editor.putString("periodlength", p_Text);
                    editor.commit();
                    periodlength = sharedPreferences.getString("periodlength", "");
                }
            });

            builder.show();
        }

        save_day = sharedPreferences.getString("save_day", "");
        save_month = sharedPreferences.getString("save_month", "");
        save_year = sharedPreferences.getString("save_year", "");
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        Log.i("saveday", save_day);
    }
}
