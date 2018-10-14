package org.amarpushp.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import org.amarpushp.android.model.SportsItem;

public class SportsItemAdapter extends BaseAdapter {
    Context mContext;
    private static final String TAG = "SportsItemAdapter";
    private int sportsImages[];
    private String sportsName[];
    View view;
    LayoutInflater layoutInflater;

    public SportsItemAdapter(Context mContext, int[] sportsImages, String[] sportsName) {
        this.mContext = mContext;
        this.sportsImages = sportsImages;
        this.sportsName = sportsName;
    }

    @Override
    public int getCount() {
        return sportsImages.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        layoutInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertview==null){


            view=new View(mContext);
            view=layoutInflater.inflate(R.layout.sportsgridviewitems,null);
            ImageView sportsimageView=(ImageView)view.findViewById(R.id.sportsImage);
            TextView sportsText=(TextView)view.findViewById(R.id.sportsName);
            sportsimageView.setImageResource(SportsItem.sportsImage[i]);
            sportsText.setText(SportsItem.sportName[i]);
        }
        return view;
    }
}
