package com.example.manikgupta.whatsappuiclone;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    AppBarLayout appBarLayout;
    TabLayout tabLayout;
    FloatingActionButton actionButton;

    boolean flag = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);// this method sets the toolbar as the app bar for an activity

        getSupportActionBar().setTitle(getResources().getString(R.string.app_name));
        getWindow().setNavigationBarColor(getResources().getColor(android.R.color.black));
        appBarLayout = findViewById(R.id.app_bar);


        ViewPager viewPager = findViewById(R.id.viewpager);
        SimpleFragmentPagerAdapter mAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mAdapter);

        viewPager.setCurrentItem(1, true);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if(position == 0){
                    translateUp();
                    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                            WindowManager.LayoutParams.FLAG_FULLSCREEN);
                  actionButton.setVisibility(View.GONE);
                }else if(flag) {
                    translateDown();
                    actionButton.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        // This part of code is adjusting size of camera tab part
        LinearLayout layout = ((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(0));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) layout.getLayoutParams();
        layoutParams.weight = 0.4f; // e.g. 0.5f
        layout.setLayoutParams(layoutParams);

        setUpTabIcons();
    }

    // Setting camera icon to first tab
    private void setUpTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.white_camera);
    }


    private void translateUp(){
        Animation up = new TranslateAnimation(0,0,0,-280);
        appBarLayout.setAnimation(up);
        up.setDuration(150);
        up.setFillAfter(true);
        up.start();
        flag = true;
    }

    private void translateDown(){
        Animation up = new TranslateAnimation(0,0,-280,0);
        appBarLayout.setAnimation(up);
        up.setDuration(150);
        up.setFillAfter(true);
        up.start();
        flag = false;
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
