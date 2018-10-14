package org.amarpushp.android.activities;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import org.amarpushp.android.adapter.SplashViewPagerAdapter;
import org.amarpushp.android.adapter.ViewPagerAdapter;
import org.amarpushp.android.client.Home.HomePageActivity;
import org.amarpushp.android.client.login.Amarpushp_Login_Activity;

import java.util.Timer;
import java.util.TimerTask;

public class Splash_Screen extends AppCompatActivity {
    ViewPager splashviewPager;
    LinearLayout splashsliderDots;
    private int splashdotscount;
    private ImageView[] splashdots;
    private Button login,browse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        splashviewPager=(ViewPager)findViewById(R.id.sliderimageviewpager);
       splashsliderDots = (LinearLayout) findViewById(R.id.splashsliderDots);
       login=(Button)findViewById(R.id.loginbutton);
       browse=(Button)findViewById(R.id.browsebutton);
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
             Intent intent_login=new Intent(Splash_Screen.this, Amarpushp_Login_Activity.class);
             startActivity(intent_login);
           }
       });
       browse.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            Intent intent_browse=new Intent(Splash_Screen.this,HomePageActivity.class);
              startActivity(intent_browse);
           }
       });
        setViewPager(splashviewPager);
    }



    private void setViewPager(ViewPager viewPager) {
        SplashViewPagerAdapter splashViewPagerAdapter = new SplashViewPagerAdapter(this);
        viewPager.setAdapter(splashViewPagerAdapter);
        splashdotscount =splashViewPagerAdapter.getCount();
        splashdots= new ImageView[splashdotscount];
        for (int i = 0; i < splashdotscount; i++) {
            splashdots[i] = new ImageView(this);
            splashdots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive_dots));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            splashsliderDots.addView(splashdots[i], params);


        }
       splashdots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.splashscreen_active_dots));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < splashdotscount; i++) {

                    splashdots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive_dots));


                }
                splashdots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.splashscreen_active_dots));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
    public class MyTimerTask extends TimerTask {
        int position = splashviewPager.getCurrentItem();


        @Override
        public void run() {
            Splash_Screen.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (position == 0) {
                        position++;

                        splashviewPager.setCurrentItem(position);
                    } else if (position == 1) {
                        position++;
                       splashviewPager.setCurrentItem(position);
                    } else if (position == 2) {

                        position++;
                        splashviewPager.setCurrentItem(position);

                    } else if (position == 3) {

                        position++;
                       splashviewPager.setCurrentItem(position);
                    } else if (position == 4) {

                        position++;
                        splashviewPager.setCurrentItem(position);
                    } else if (position == 5) {

                        position = 0;
                       splashviewPager.setCurrentItem(position);
                    }

                }
            });
        }
    }
}
