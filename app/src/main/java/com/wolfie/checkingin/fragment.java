package com.wolfie.checkingin;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

public class fragment extends AppCompatActivity {
    private ViewPager mPager;
    private static final int NUM_PAGES = 4;
    private PagerAdapter pagerAdapter;
    private TabLayout tablayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        mPager = findViewById(R.id.vp);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(pagerAdapter);

        tablayout = findViewById(R.id.maintab);
        tablayout.setupWithViewPager(mPager);

    }

}
