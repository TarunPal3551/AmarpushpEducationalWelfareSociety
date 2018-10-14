package org.amarpushp.android.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import java.util.List;

import org.amarpushp.android.model.Key_Project_Item;
import org.amarpushp.android.model.News_Item;

/**
 * Created by hp on 05-Apr-18.
 */

public class KeyProject_GridViewAdapter extends BaseAdapter{
    private static final String TAG = "KEY_PROJECT_RECYLERVIEW";
    private  final String [] projectNames;
    private final int[] projectImages;
    Context mContext;
    View view;
    LayoutInflater layoutInflater;

    public KeyProject_GridViewAdapter(String[] projectNames, int[] projectImages, Context mContext) {
        this.projectNames = projectNames;
        this.projectImages = projectImages;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return projectImages.length;
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
            view=layoutInflater.inflate(R.layout.key_project_item,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.keyprojectimageview);
            TextView textView=(TextView)view.findViewById(R.id.keyprojecttextview);
            imageView.setImageResource(Key_Project_Item.imagepath[i]);
            textView.setText(Key_Project_Item.projectText[i]);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (i==0){
                        Toast.makeText(mContext, Key_Project_Item.projectText[0],Toast.LENGTH_SHORT).show();
                    }
                    else if(i==1){
                        Toast.makeText(mContext, Key_Project_Item.projectText[1],Toast.LENGTH_SHORT).show();


                    }
                    else if(i==2){
                        Toast.makeText(mContext, Key_Project_Item.projectText[2],Toast.LENGTH_SHORT).show();


                    }
                    else if(i==3){
                        Toast.makeText(mContext, Key_Project_Item.projectText[3],Toast.LENGTH_SHORT).show();


                    }
                    else if(i==4){
                        Toast.makeText(mContext, Key_Project_Item.projectText[4],Toast.LENGTH_SHORT).show();


                    }

                    else if(i==5){
                        Toast.makeText(mContext, Key_Project_Item.projectText[5],Toast.LENGTH_SHORT).show();


                    }

                    else if(i==6){
                        Toast.makeText(mContext, Key_Project_Item.projectText[6],Toast.LENGTH_SHORT).show();


                    }



                    else if(i==7){
                        Toast.makeText(mContext, Key_Project_Item.projectText[7],Toast.LENGTH_SHORT).show();


                    }




                    else if(i==8){
                        Toast.makeText(mContext, Key_Project_Item.projectText[8],Toast.LENGTH_SHORT).show();


                    }



                    else if(i==9){
                        Toast.makeText(mContext, Key_Project_Item.projectText[9],Toast.LENGTH_SHORT).show();


                    }









                }
            });


        }
        return view;
    }
}
