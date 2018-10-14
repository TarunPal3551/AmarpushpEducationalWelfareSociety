package org.amarpushp.android.client.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import java.util.Timer;
import java.util.TimerTask;

import org.amarpushp.android.activities.About_us_Activity;
import org.amarpushp.android.activities.Contact_Us;
import org.amarpushp.android.activities.Donate_Us;
import org.amarpushp.android.activities.Partners_Activity;
import org.amarpushp.android.activities.Sponser_Activity;
import org.amarpushp.android.adapter.KeyProject_GridViewAdapter;
import org.amarpushp.android.adapter.News_RecylerView_Adapter;
import org.amarpushp.android.adapter.Upcoming_Event_RecylerView;
import org.amarpushp.android.adapter.ViewPagerAdapter;
import org.amarpushp.android.client.Sports.SportsActivity;
import org.amarpushp.android.client.WomenEmpowerment.WomenEmpowerment_MainActivity;
import org.amarpushp.android.client.expression.ExpressionPageActivity;
import org.amarpushp.android.client.vastradhan.VastraDhan_MainActivity;
import org.amarpushp.android.model.Key_Project_Item;
import org.amarpushp.android.model.News_Item;
import org.amarpushp.android.model.Upcoming_Event_item;

public class HomePageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ViewPager viewPager;
    LinearLayout sliderDots;
    private int dotscount;
    private ImageView[] dots;
    ImageView shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPager = (ViewPager) findViewById(R.id.imageviewpager);
        sliderDots = (LinearLayout) findViewById(R.id.sliderDots);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        GridView key_project_grid_view = (GridView) findViewById(R.id.gridviewkeyproject);
        RecyclerView up_Coming_Event_Recyler_View = (RecyclerView) findViewById(R.id.up_coming_event_recyler_view);
        RecyclerView news_Homepage = (RecyclerView) findViewById(R.id.newshomepage);
        setUpNavigationDrawer(navigationView, toolbar);
        setViewPager(viewPager);
        setUpGridView(key_project_grid_view);
        setUpUpcomingEventRecylerView(up_Coming_Event_Recyler_View);
        setUpnewsRecylerView(news_Homepage);
        shareButton=(ImageView)findViewById(R.id.sharebutton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"Download AmarPushp Educational and Welfare Society App :Get  Latest Events and News   ----   https://play.google.com/store/apps/details?id=org.amarpushp.android");
                startActivity(Intent.createChooser(intent,"Share Via"));
            }
        });


    }

    //------------------------------------KeyProject Item GridView-------------------------------------------------
    private void setUpGridView(GridView gridView) {
        KeyProject_GridViewAdapter adapter = new KeyProject_GridViewAdapter(Key_Project_Item.projectText, Key_Project_Item.imagepath, this);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(),ExpressionPageActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
//                        Intent intent=new Intent(getApplicationContext(), Expression_Page_Activity.class);
//                        startActivity(intent);
                        break;
                    case 2:
//                        Intent intent=new Intent(getApplicationContext(), Expression_Page_Activity.class);
//                        startActivity(intent);
                      break;
                    case 3:
                            Intent vastraintent=new Intent(getApplicationContext(), VastraDhan_MainActivity.class);
                            startActivity(vastraintent);
                        break;
                    case 4:
 //                       Intent intent=new Intent(getApplicationContext(), Expression_Page_Activity.class);
//                        startActivity(intent);
                           break;
                    case 5:
//                        Intent intent=new Intent(getApplicationContext(), Expression_Page_Activity.class);
//                        startActivity(intent);
                        break;
                    case 7:
                        Intent sportsintent=new Intent(getApplicationContext(), SportsActivity.class);
                        startActivity(sportsintent);
                       break;

                    case 8:
                        Intent womenintent=new Intent(getApplicationContext(), WomenEmpowerment_MainActivity.class);
                        startActivity(womenintent);
                        break;

                }
            }
        });


    }
    ////////-----------------------------Upcomig_Event_ITEM_RECYLER _VIEW--------------------------------------------

    private void setUpUpcomingEventRecylerView(RecyclerView eventrecylerView) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        eventrecylerView.setLayoutManager(layoutManager);
        Upcoming_Event_item upcoming_event_item = new Upcoming_Event_item();
        Upcoming_Event_RecylerView recylerViewAdapter = new Upcoming_Event_RecylerView(upcoming_event_item, HomePageActivity.this);
        eventrecylerView.setAdapter(recylerViewAdapter);


    }

    ///-----------------------------News_Recyler_View-----------------------------------------------------------
    private void setUpnewsRecylerView(RecyclerView newsrecylerView) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        newsrecylerView.setLayoutManager(layoutManager);
        News_Item news_item = new News_Item();
        News_RecylerView_Adapter news_recylerView_adapter = new News_RecylerView_Adapter(news_item, HomePageActivity.this);
        newsrecylerView.setAdapter(news_recylerView_adapter);


    }


    //////-----------------------   NAVIGATION VIEW---------------------------------------------------------------
    private void setUpNavigationDrawer(NavigationView navigationView, Toolbar toolbar) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.About_Us) {

           Intent about=new Intent(getApplicationContext(), About_us_Activity.class);
           startActivity(about);
        } else if (id == R.id.Projects) {

        } else if (id == R.id.career) {

        } else if (id == R.id.Media) {

        } else if (id == R.id.Sponsors) {
            Intent sponsers=new Intent(getApplicationContext(), Sponser_Activity.class);
            startActivity(sponsers);

        } else if (id == R.id.Partners) {
            Intent partners=new Intent(getApplicationContext(), Partners_Activity.class);
            startActivity(partners);

        } else if (id == R.id.Contact) {
            Intent contact_us=new Intent(getApplicationContext(), Contact_Us.class);
            startActivity(contact_us);

        } else if (id == R.id.Photo_Gallery) {

        } else if (id == R.id.Videos) {

        } else if (id == R.id.Donate) {
            Intent donate=new Intent(getApplicationContext(), Donate_Us.class);
            startActivity(donate);

        } else if (id == R.id.Notification) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //------------------------------ImageSlider--------------------------------------------
    private void setViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];
        for (int i = 0; i < dotscount; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive_dots));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            sliderDots.addView(dots[i], params);


        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dots));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotscount; i++) {

                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.inactive_dots));


                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dots));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);


    }

    public class MyTimerTask extends TimerTask {
        int position = viewPager.getCurrentItem();


        @Override
        public void run() {
            HomePageActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (position == 0) {
                        position++;

                        viewPager.setCurrentItem(position);
                    } else if (position == 1) {
                        position++;
                        viewPager.setCurrentItem(position);
                    } else if (position == 2) {

                        position++;
                        viewPager.setCurrentItem(position);

                    } else if (position == 3) {

                        position++;
                        viewPager.setCurrentItem(position);
                    } else if (position == 4) {

                        position++;
                        viewPager.setCurrentItem(position);
                    } else if (position == 5) {

                        position = 0;
                        viewPager.setCurrentItem(position);
                    }

                }
            });
        }
    }

}
