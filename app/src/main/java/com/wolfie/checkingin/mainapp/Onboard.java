package com.wolfie.checkingin.mainapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.wolfie.checkingin.R;
import com.wolfie.checkingin.waterReminderMain;

import java.util.HashMap;

import androidx.appcompat.app.AppCompatActivity;

public class Onboard extends AppCompatActivity {
ImageView water,period,calorie,mood;
DatabaseReference mDatabaseReference;
FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        period = findViewById(R.id.period);
        calorie = findViewById(R.id.calorie);
        mood = findViewById(R.id.mood);
        mAuth = FirebaseAuth.getInstance();

        FirebaseUser user = mAuth.getCurrentUser();
        String uid = user.getUid();
        mDatabaseReference= FirebaseDatabase.getInstance().getReference().child("Users").child(uid);
        SharedPreferences data =getSharedPreferences("Basic_Info",0);
        SharedPreferences sharedPreferences = getSharedPreferences("Name_info",0);
        String Name = sharedPreferences.getString("Name","null");
        String Gender = data.getString("Gender","null");
        Float Weight = Float.valueOf(data.getInt("Weight",0));
        Float Height = Float.valueOf(data.getInt("Height",0));
        Float Age =  data.getFloat("Age",0);
        HashMap<String,String> usermap = new HashMap<>();
        usermap.put("Name",Name);
        usermap.put("Gender",Gender);
        usermap.put("Age",Age.toString());
        usermap.put("Weight",Weight.toString());
        usermap.put("Height",Height.toString());

        mDatabaseReference.setValue(usermap);
        findViewById(R.id.waterReminder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
startActivity(new Intent(getApplicationContext(),waterReminderMain.class));
            }
        });
    }
}
