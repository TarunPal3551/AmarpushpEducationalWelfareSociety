package org.amarpushp.android.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import java.util.List;

import org.amarpushp.android.model.News_Item;
import org.amarpushp.android.model.Upcoming_Event_item;

/**
 * Created by hp on 06-Apr-18.
 */

public class News_RecylerView_Adapter extends RecyclerView.Adapter<News_RecylerView_Adapter.ViewHolder> {
    private static final String TAG = "News_RecylerView_Adapte";
    private List<News_Item>news_items;
    Context mContext;

    public News_RecylerView_Adapter(News_Item news_item, Context mContext) {
        this.news_items =news_items;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.news_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
       holder.news_Image.setImageResource(News_Item.news_imagepath[position]);
       holder.news_textView.setText(News_Item.news_project_Text[position]);
        holder.news_Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, News_Item.news_project_Text[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return News_Item.news_imagepath.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView news_Image;
        TextView news_textView;

        public ViewHolder(View itemView) {
            super(itemView);
           news_Image=(ImageView)itemView.findViewById(R.id.newsimageview);
           news_textView=(TextView) itemView.findViewById(R.id.newstextview);

        }
    }
}
