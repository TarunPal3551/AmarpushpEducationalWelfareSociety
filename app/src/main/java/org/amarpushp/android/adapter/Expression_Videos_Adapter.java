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

import org.amarpushp.android.model.Expression_Videos;

import java.util.ArrayList;
import java.util.List;

public class Expression_Videos_Adapter extends
        RecyclerView.Adapter<Expression_Videos_Adapter.Expression_Videos_ViewHolder>    {

    private Context context;
    private List<Expression_Videos> expression_videos_list;



    public Expression_Videos_Adapter(Context context, List<Expression_Videos> expression_videos_list) {
        this.context = context;
        this.expression_videos_list = expression_videos_list;
    }


    @NonNull
    @Override
    public Expression_Videos_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.expression_videos_recycler_view,parent,false);
        Expression_Videos_ViewHolder expression_videos_viewHolder =
                new Expression_Videos_ViewHolder(view,context);



        return expression_videos_viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull Expression_Videos_ViewHolder holder, int position) {


        Expression_Videos expression_videos = expression_videos_list.get(position);


        holder.drawingCompetitionVideoName.setText(expression_videos.getCompetition_name());
        holder.drawingCompetitionVideoYear.setText(expression_videos.getCompetition_year());
        holder.drawingCompetitionVideoImage.setImageDrawable(context.getResources().getDrawable(expression_videos.getImage()));


    }

    @Override
    public int getItemCount() {
        return expression_videos_list.size();
    }

    class Expression_Videos_ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView drawingCompetitionVideoImage;
        TextView drawingCompetitionVideoName, drawingCompetitionVideoYear;
        Context context;

        public Expression_Videos_ViewHolder(View itemView, Context context) {
            super(itemView);
            this.context = context;
            itemView.setOnClickListener(this);
            drawingCompetitionVideoImage = itemView.findViewById(R.id.drawingCompetitionVideoImage);
            drawingCompetitionVideoName = itemView.findViewById(R.id.drawingCompetitionVideoName);
            drawingCompetitionVideoYear = itemView.findViewById(R.id.drawingCompetitionVideoYear);


        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Toast.makeText(context, "Clicked" +position+"!", Toast.LENGTH_LONG);
        }
    }

}
