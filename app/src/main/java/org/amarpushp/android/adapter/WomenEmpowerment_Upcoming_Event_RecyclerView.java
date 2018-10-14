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
import org.amarpushp.android.model.VastraDhan_Upcoming_Event;
import org.amarpushp.android.model.WomenEmpowerment_Upcoming_Event;

import java.util.List;


public class WomenEmpowerment_Upcoming_Event_RecyclerView extends RecyclerView.Adapter<WomenEmpowerment_Upcoming_Event_RecyclerView.ViewHolder> {
    private static final String TAG = "Upcoming_Event_Recyler";
    private List<WomenEmpowerment_Upcoming_Event> women_empowerment_upcoming_event_items;
    Context mContext;

    public WomenEmpowerment_Upcoming_Event_RecyclerView(WomenEmpowerment_Upcoming_Event women_empowerment_upcoming_event_item, Context mContext) {
        this.women_empowerment_upcoming_event_items = women_empowerment_upcoming_event_items;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.women_empowerment_upcoming_event_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.eventImage.setImageResource(WomenEmpowerment_Upcoming_Event.women_empowerment_upcoming_event_images[position]);
        holder.event_venue.setText(WomenEmpowerment_Upcoming_Event.women_empowerment_event_venue[position]);
        holder.event_name.setText(WomenEmpowerment_Upcoming_Event.women_empowerment_event_name[position]);
        holder.event_time.setText(WomenEmpowerment_Upcoming_Event.women_empowerment_event_time[position]);
        holder.event_uploaded_date.setText(WomenEmpowerment_Upcoming_Event.women_empowerment_event_uploading_timing[position]);
        holder.event_description.setText(WomenEmpowerment_Upcoming_Event.women_empowerment_event_description[position]);
        holder.eventImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, WomenEmpowerment_Upcoming_Event.women_empowerment_event_name[position],Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return WomenEmpowerment_Upcoming_Event.women_empowerment_event_name.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView eventImage;
        TextView event_name,event_description,event_time,event_venue,event_uploaded_date;

        public ViewHolder(View itemView) {
            super(itemView);
            eventImage=(ImageView)itemView.findViewById(R.id.women_empowerment_eventImage);
            event_description=(TextView)itemView.findViewById(R.id.women_empowerment_event_Description);
            event_uploaded_date=(TextView)itemView.findViewById(R.id.uploaded_time_of_women_empowerment_event);
            event_name=(TextView)itemView.findViewById(R.id.women_empowerment_eventname);
            event_time=(TextView)itemView.findViewById(R.id.timing_of_women_empowerment_event);
            event_venue=(TextView)itemView.findViewById(R.id.women_empowerment_eventVenue);

        }
    }
}
