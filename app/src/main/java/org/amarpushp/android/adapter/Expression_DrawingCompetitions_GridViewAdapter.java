package org.amarpushp.android.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import org.amarpushp.android.model.Drawing_Competition_Item;

/**
 * Created by hp on 05-Apr-18.
 */

public class Expression_DrawingCompetitions_GridViewAdapter extends BaseAdapter{
    private static final String TAG = "DRAWING_COMPETITION_RECYLERVIEW";
    private  final String [] drawingCompettionNames;
    private final int[] drawingCompetitionImages;
    private final String [] drawingComeptitionDescriptions;
    private final String[] drawingCompetitionYear;
    Context mContext;
    View view;
    LayoutInflater layoutInflater;

    public Expression_DrawingCompetitions_GridViewAdapter(String[] competitionNames, String[] comeptitionYear, int[] competitionImages, String[] competitionDescription, Context mContext) {
        this.drawingCompettionNames = competitionNames;
        this.drawingCompetitionImages = competitionImages;
        this.drawingComeptitionDescriptions = competitionDescription;
        this.mContext = mContext;
        this.drawingCompetitionYear = comeptitionYear;
    }

    @Override
    public int getCount() {
        return drawingCompetitionImages.length;
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
    public View getView(final int i, View convertView, ViewGroup viewGroup) {
        layoutInflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){

            view=new View(mContext);
            view=layoutInflater.inflate(R.layout.drawing_competition,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.drawingcompettionimageview);
            TextView textView=(TextView)view.findViewById(R.id.drawingcompetitiontextview);
            TextView textView1 = (TextView)view.findViewById(R.id.drawingcompetitiondescription);
            TextView textView2 = (TextView)view.findViewById(R.id.drawingcompetitiontextview1);
            imageView.setImageResource(Drawing_Competition_Item.imagepath[i]);
            textView.setText(Drawing_Competition_Item.projectText[i]);
            textView1.setText(Drawing_Competition_Item.competitionDescription[i]);
            textView2.setText(Drawing_Competition_Item.projectText1[i]);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (i==0){
                        Toast.makeText(mContext, Drawing_Competition_Item.projectText[0],Toast.LENGTH_SHORT).show();
                    }
                    else if(i==1){
                        Toast.makeText(mContext, Drawing_Competition_Item.projectText[1],Toast.LENGTH_SHORT).show();


                    }
                    else if(i==2){
                        Toast.makeText(mContext, Drawing_Competition_Item.projectText[2],Toast.LENGTH_SHORT).show();


                    }
                    else if(i==3){
                        Toast.makeText(mContext, Drawing_Competition_Item.projectText[3],Toast.LENGTH_SHORT).show();


                    }
                    else if(i==4){
                        Toast.makeText(mContext, Drawing_Competition_Item.projectText[4],Toast.LENGTH_SHORT).show();


                    }

                    else if(i==5){
                        Toast.makeText(mContext, Drawing_Competition_Item.projectText[5],Toast.LENGTH_SHORT).show();


                    }

                    else if(i==6){
                        Toast.makeText(mContext, Drawing_Competition_Item.projectText[6],Toast.LENGTH_SHORT).show();


                    }


                }
            });


        }
        return view;
    }
}
