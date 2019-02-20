package com.example.irisnav;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class CollectActivity extends AppCompatActivity {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collect_activity_layout);

        // https://medium.com/@droidbyme/android-material-design-tabs-tab-layout-with-swipe-884085ae80ff
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new IristabFragment(), "Iris");
        adapter.addFragment(new FingertabFragment(), "Finger");
        adapter.addFragment(new FacetabFragment(), "Face");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
