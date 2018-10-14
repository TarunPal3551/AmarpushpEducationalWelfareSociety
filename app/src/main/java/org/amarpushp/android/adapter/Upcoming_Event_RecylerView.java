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

import org.amarpushp.android.client.Home.HomePageActivity;
import org.amarpushp.android.model.News_Item;
import org.amarpushp.android.model.Upcoming_Event_item;

/**
 * Created by hp on 06-Apr-18.
 */

public class Upcoming_Event_RecylerView extends RecyclerView.Adapter<Upcoming_Event_RecylerView.ViewHolder> {
    private static final String TAG = "Upcoming_Event_Recyler";
    private List<Upcoming_Event_item>upcoming_event_items;
    Context mContext;

    public Upcoming_Event_RecylerView(Upcoming_Event_item upcoming_event_item, Context mContext) {
        this.upcoming_event_items = upcoming_event_items;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.upcoming_event_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
      holder.eventImage.setImageResource(Upcoming_Event_item.upcoming_event_images[position]);
      holder.event_venue.setText(Upcoming_Event_item.event_venue[position]);
      holder.event_name.setText(Upcoming_Event_item.event_name[position]);
      holder.event_time.setText(Upcoming_Event_item.event_time[position]);
      holder.event_uploaded_date.setText(Upcoming_Event_item.event_uploading_timing[position]);
      holder.event_description.setText(Upcoming_Event_item.event_description[position]);
      holder.eventImage.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(mContext, Upcoming_Event_item.event_name[position],Toast.LENGTH_SHORT).show();
          }
      });
    }

    @Override
    public int getItemCount() {
        return Upcoming_Event_item.event_name.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView eventImage;
        TextView event_name,event_description,event_time,event_venue,event_uploaded_date;

        public ViewHolder(View itemView) {
            super(itemView);
            eventImage=(ImageView)itemView.findViewById(R.id.eventImage);
            event_description=(TextView)itemView.findViewById(R.id.event_Description);
            event_uploaded_date=(TextView)itemView.findViewById(R.id.uploaded_time_of_event);
            event_name=(TextView)itemView.findViewById(R.id.eventname);
            event_time=(TextView)itemView.findViewById(R.id.timing_of_event);
            event_venue=(TextView)itemView.findViewById(R.id.eventVenue);

        }
    }
}
