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

import org.amarpushp.android.model.Expression_Upcoming_Event;
import org.amarpushp.android.model.Upcoming_Event_item;

import java.util.List;


public class Expression_Upcoming_Event_RecyclerView extends RecyclerView.Adapter<Expression_Upcoming_Event_RecyclerView.ViewHolder> {
    private static final String TAG = "Upcoming_Event_Recyler";
    private List<Upcoming_Event_item>expression_upcoming_event_items;
    Context mContext;

    public Expression_Upcoming_Event_RecyclerView(Expression_Upcoming_Event expression_upcoming_event_item, Context mContext) {
        this.expression_upcoming_event_items = expression_upcoming_event_items;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.expression_upcoming_event_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.eventImage.setImageResource(Expression_Upcoming_Event.expression_upcoming_event_images[position]);
        holder.event_venue.setText(Expression_Upcoming_Event.expression_event_venue[position]);
        holder.event_name.setText(Expression_Upcoming_Event.expression_event_name[position]);
        holder.event_time.setText(Expression_Upcoming_Event.expression_event_time[position]);
        holder.event_uploaded_date.setText(Expression_Upcoming_Event.expression_event_uploading_timing[position]);
        holder.event_description.setText(Expression_Upcoming_Event.expression_event_description[position]);
        holder.eventImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, Expression_Upcoming_Event.expression_event_name[position],Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return Expression_Upcoming_Event.expression_event_name.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView eventImage;
        TextView event_name,event_description,event_time,event_venue,event_uploaded_date;

        public ViewHolder(View itemView) {
            super(itemView);
            eventImage=(ImageView)itemView.findViewById(R.id.expressioneventImage);
            event_description=(TextView)itemView.findViewById(R.id.expression_event_Description);
            event_uploaded_date=(TextView)itemView.findViewById(R.id.uploaded_time_of_expression_event);
            event_name=(TextView)itemView.findViewById(R.id.expressioneventname);
            event_time=(TextView)itemView.findViewById(R.id.timing_of_expression_event);
            event_venue=(TextView)itemView.findViewById(R.id.expressioneventVenue);

        }
    }
}
