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

import org.amarpushp.android.model.Expression_News;

import java.util.List;


public class Expression_News_RecyclerView_Adapter extends RecyclerView.Adapter<Expression_News_RecyclerView_Adapter.ViewHolder> {
    private static final String TAG = "News_Recyler_View_Adapter";
    private List<Expression_News>news_items;
    Context mContext;

    public Expression_News_RecyclerView_Adapter(Expression_News news_item, Context mContext) {
        this.news_items =news_items;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.expression_news_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.news_Image.setImageResource(Expression_News.news_imagepath[position]);
        holder.news_textView.setText(Expression_News.news_project_Text[position]);
        holder.news_Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, Expression_News.news_project_Text[position],Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return Expression_News.news_imagepath.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView news_Image;
        TextView news_textView;

        public ViewHolder(View itemView) {
            super(itemView);
            news_Image=(ImageView)itemView.findViewById(R.id.expressionnewsimageview);
            news_textView=(TextView) itemView.findViewById(R.id.expressionnewstextview);

        }
    }
}
