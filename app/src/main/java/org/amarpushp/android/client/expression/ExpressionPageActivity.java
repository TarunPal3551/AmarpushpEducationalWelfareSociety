package org.amarpushp.android.client.expression;

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
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import org.amarpushp.android.adapter.ExpressionViewPagerAdapter;
import org.amarpushp.android.adapter.Expression_DrawingCompetitions_GridViewAdapter;
import org.amarpushp.android.adapter.Expression_News_RecyclerView_Adapter;
import org.amarpushp.android.adapter.Expression_Upcoming_Event_RecyclerView;
import org.amarpushp.android.adapter.ViewPagerAdapter;
import org.amarpushp.android.model.Drawing_Competition_Item;
import org.amarpushp.android.model.Expression_News;
import org.amarpushp.android.model.Expression_Upcoming_Event;

import java.util.Timer;
import java.util.TimerTask;

public class ExpressionPageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ViewPager viewPager;
    LinearLayout sliderDots;
    private int dotscount;
    private ImageView[] dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expressionpage_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.expression_toolbar);
        setSupportActionBar(toolbar);
        viewPager = (ViewPager) findViewById(R.id.expressionimageviewpager);
        sliderDots = (LinearLayout) findViewById(R.id.expressionSliderDots);
        NavigationView navigationView = (NavigationView) findViewById(R.id.expression_nav_view);
        GridView drawing_competitions_grid_view = (GridView) findViewById(R.id.gridviewDrawingCompetitions);
        RecyclerView up_Coming_Event_Recyler_View=(RecyclerView)findViewById(R.id.expression_up_coming_event_recyler_view);
        RecyclerView news_ExpressionPage=(RecyclerView)findViewById(R.id.newsExpressionsPage);
        setUpNavigationDrawer(navigationView, toolbar);
        setViewPager(viewPager);
        setUpGridView(drawing_competitions_grid_view);
        setUpUpcomingEventRecylerView(up_Coming_Event_Recyler_View);
        setUpnewsRecylerView(news_ExpressionPage);


    }

    //------------------------------------DrawingCompetitions Item GridView-------------------------------------------------
    private void setUpGridView(GridView gridView) {
        Expression_DrawingCompetitions_GridViewAdapter adapter=new Expression_DrawingCompetitions_GridViewAdapter(Drawing_Competition_Item.projectText, Drawing_Competition_Item.projectText1, Drawing_Competition_Item.imagepath, Drawing_Competition_Item.competitionDescription,this);
        gridView.setAdapter(adapter);


    }
    ////////-----------------------------Upcomig_Event_ITEM_RECYLER _VIEW--------------------------------------------

    private void setUpUpcomingEventRecylerView(RecyclerView eventrecylerView) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        eventrecylerView.setLayoutManager(layoutManager);
        Expression_Upcoming_Event upcoming_event_item = new Expression_Upcoming_Event();
        Expression_Upcoming_Event_RecyclerView recylerViewAdapter = new Expression_Upcoming_Event_RecyclerView(upcoming_event_item, ExpressionPageActivity.this);
        eventrecylerView.setAdapter(recylerViewAdapter);


    }
    ///-----------------------------News_Recyler_View-----------------------------------------------------------
    private void setUpnewsRecylerView(RecyclerView newsrecylerView){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        newsrecylerView.setLayoutManager(layoutManager);
        Expression_News news_item = new Expression_News();
        Expression_News_RecyclerView_Adapter news_recylerView_adapter = new Expression_News_RecyclerView_Adapter(news_item, ExpressionPageActivity.this);
        newsrecylerView.setAdapter(news_recylerView_adapter);

    }


    //////-----------------------   NAVIGATION VIEW---------------------------------------------------------------
    private void setUpNavigationDrawer(NavigationView navigationView, Toolbar toolbar) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.expression_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.expression_drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.expression_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.expression_action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Expression_About_Us) {
            Intent intent = new Intent(getApplicationContext(), ExpressionAboutUsActivity.class);
            startActivity(intent);

        } else if (id == R.id.Expression_Creative_Members) {
            Intent intent = new Intent(getApplicationContext(), Expression_Creative_Member_MainActvity.class);
            startActivity(intent);

        } else if (id == R.id.Expression_National_Drawing_Competition) {
            Intent intent = new Intent(getApplicationContext(), Expression_National_Drawing_Competition.class);
            startActivity(intent);

        } else if (id == R.id.Expression_National_Artist_Competition) {
            Intent intent = new Intent(getApplicationContext(), Expression_National_Artist_Competition.class);
            startActivity(intent);

        } else if (id == R.id.Expression_Sponsors) {
            Intent intent = new Intent(getApplicationContext(), Expression_Sponsors.class);
            startActivity(intent);

        } else if (id == R.id.Expression_Partners) {
            Intent intent = new Intent(getApplicationContext(), Expression_Partners.class);
            startActivity(intent);

        } else if (id == R.id.Expression_Contact) {

        } else if (id == R.id.Expression_Photo_Gallery) {
            Intent intent = new Intent(getApplicationContext(), Expression_Photos_Activity.class);
            startActivity(intent);

        } else if (id == R.id.Expression_Videos) {
            Intent intent = new Intent(getApplicationContext(), Expression_Videos_Activity.class);
            startActivity(intent);

        } else if (id == R.id.Expression_Donate) {
            Intent intent = new Intent(getApplicationContext(), Expression_Donate_Us.class);
            startActivity(intent);

        } else if (id == R.id.Expression_Notification) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.expression_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //------------------------------ImageSlider--------------------------------------------
    private void setViewPager(ViewPager viewPager) {
        ExpressionViewPagerAdapter viewPagerAdapter = new ExpressionViewPagerAdapter(this);
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
            ExpressionPageActivity.this.runOnUiThread(new Runnable() {
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
