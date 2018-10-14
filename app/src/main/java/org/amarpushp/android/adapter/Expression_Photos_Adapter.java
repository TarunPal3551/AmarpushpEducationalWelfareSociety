package org.amarpushp.android.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.amarpushpeducationalwelfaresocietyblue.R;

import org.amarpushp.android.model.Expression_Photos;

import java.util.List;

public class Expression_Photos_Adapter extends
        RecyclerView.Adapter<Expression_Photos_Adapter.Expression_Photos_ViewHolder>    {

    private Context context;
    private List<Expression_Photos> expression_photos_list;



    public Expression_Photos_Adapter(Context context, List<Expression_Photos> expression_photos_list) {
        this.context = context;
        this.expression_photos_list = expression_photos_list;
    }


    @NonNull
    @Override
    public Expression_Photos_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.expression_photos_recycler_view,parent,false);
        Expression_Photos_ViewHolder expression_photos_viewHolder =
                new Expression_Photos_ViewHolder(view);



        return expression_photos_viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull Expression_Photos_ViewHolder holder, int position) {


        Expression_Photos expression_photos = expression_photos_list.get(position);


        holder.drawingCompetitionName.setText(expression_photos.getCompetition_name());
        holder.drawingCompetitionYear.setText(expression_photos.getCompetition_year());
        holder.drawingCompetitionDescription.setText(expression_photos.getCompetition_description());
        holder.drawingCompetitionImage.setImageDrawable(context.getResources().getDrawable(expression_photos.getImage()));

    }

    @Override
    public int getItemCount() {
        return expression_photos_list.size();
    }

    class Expression_Photos_ViewHolder extends RecyclerView.ViewHolder    {

        ImageView drawingCompetitionImage;
        TextView drawingCompetitionName, drawingCompetitionYear, drawingCompetitionDescription;



        public Expression_Photos_ViewHolder(View itemView) {
            super(itemView);
            drawingCompetitionImage = itemView.findViewById(R.id.drawingCompetitionImage);
            drawingCompetitionName = itemView.findViewById(R.id.drawingCompetitionName);
            drawingCompetitionYear = itemView.findViewById(R.id.drawingCompetitionYear);
            drawingCompetitionDescription = itemView.findViewById(R.id.drawingCompetitionDescription);

        }
    }

}
