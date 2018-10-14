package org.amarpushp.android.client.expression;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import org.amarpushp.android.adapter.Expression_Videos_Adapter;
import org.amarpushp.android.model.Expression_Videos;

import java.util.ArrayList;
import java.util.List;

public class Expression_Videos_Activity extends AppCompatActivity   {

    RecyclerView recyclerView;
    List<Expression_Videos> expression_videos_list;
    Expression_Videos_Adapter expression_videos_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expression_videos);

        expression_videos_list = new ArrayList<>();


        recyclerView = (RecyclerView) findViewById(R.id.expression_videos_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager = linearLayoutManager;
        recyclerView.setLayoutManager(rvLayoutManager);

        expression_videos_list.add(
                new Expression_Videos(
                        R.drawable.expression_gallery_2016_2,
                        "Drawing Competition",
                        "2016-17"));


        expression_videos_list.add(
                new Expression_Videos(
                        R.drawable.expression_gallery_2016_2,
                        "Drawing Competition",
                        "2017-18"));



        expression_videos_adapter =
                new Expression_Videos_Adapter(this,expression_videos_list);

        recyclerView.setAdapter(expression_videos_adapter);

    }





}
