package org.amarpushp.android.client.expression;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import org.amarpushp.android.adapter.Expression_Photos_Adapter;
import org.amarpushp.android.model.Expression_Photos;

import java.util.ArrayList;
import java.util.List;

public class Expression_Photos_Activity extends AppCompatActivity   {

    RecyclerView recyclerView;
    List<Expression_Photos> expression_photos_list;
    Expression_Photos_Adapter expression_photos_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expression_photos);

        expression_photos_list = new ArrayList<>();


        recyclerView = (RecyclerView) findViewById(R.id.expression_photos_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager = linearLayoutManager;
        recyclerView.setLayoutManager(rvLayoutManager);

        expression_photos_list.add(
                new Expression_Photos(
                        R.drawable.expression_gallery_2016_2,
                        "Drawing Competition",
                        "2016-17",
                        "Hand paint event at Arihant Arden Society, Greater Noida West, Uttar Pradesh."
                        ));


        expression_photos_list.add(
                new Expression_Photos(
                        R.drawable.expression_gallery_2016_2,
                        "Drawing Competition",
                        "2016-17",
                        "Drawing competition on 7-Apr-2017 at Aster Public School Noida Extension organized by Amarpushp Society. "
                        ));

        expression_photos_list.add(
                new Expression_Photos(
                        R.drawable.expression_gallery_2016_2,
                        "Drawing Competition",
                        "2016-17",
                        "8-Apr-2017 at Arihant Arden, Greater Noida West organized by Amarpushp Society."
                        ));

        expression_photos_list.add(
                new Expression_Photos(
                        R.drawable.expression_gallery_2016_2,
                        "Drawing Competition",
                        "2016-17",
                        "Drawing Competition on 12-Apr-2017 at Vishal International School Noida Extension organized by Amarpushp Society."
                        ));




        expression_photos_adapter =
                new Expression_Photos_Adapter(this,expression_photos_list);

        recyclerView.setAdapter(expression_photos_adapter);

    }





}
