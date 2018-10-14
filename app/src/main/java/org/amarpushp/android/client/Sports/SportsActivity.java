package org.amarpushp.android.client.Sports;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import org.amarpushp.android.adapter.SportsItemAdapter;
import org.amarpushp.android.model.SportsItem;

public class SportsActivity extends AppCompatActivity {
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        mContext=SportsActivity.this;
        GridView sportsGridView=(GridView)findViewById(R.id.allsports);
        SportsItemAdapter adapter=new SportsItemAdapter(this, SportsItem.sportsImage,SportsItem.sportName);
        sportsGridView.setAdapter(adapter);
    }
}
