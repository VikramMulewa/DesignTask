package com.example.vikram.designtask.Task3;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vikram.designtask.R;


import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Vikram on 10-May-17.
 */

public class Task3Adapter extends RecyclerView.Adapter<Task3Adapter.CustomViewHolder> {
    Typeface font1;


    private List<Model3> models;
    private Context context;

    public Task3Adapter(List<Model3> models, Context context) {
        this.models = models;
        this.context = context;
    }
    @Override
    public Task3Adapter.CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.task3_row,viewGroup, false);
        Task3Adapter.CustomViewHolder viewHolder = new Task3Adapter.CustomViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(Task3Adapter.CustomViewHolder customViewHolder, int i) {
        Model3 model = models.get(i);
        customViewHolder.name.setText(model.getName());
        customViewHolder.location.setText(model.getLocation());
        customViewHolder.like.setText(String.valueOf(""+model.getLike()));
        customViewHolder.time.setText(""+model.getTime());
        customViewHolder.propic.setImageDrawable(context.getDrawable(model.getPropic()));
        customViewHolder.pic.setImageDrawable(context.getDrawable(model.getPic()));
    }
    @Override
    public int getItemCount() {
        return models.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        private TextView name,location,like,time;
        private CircleImageView propic;
        private ImageView pic;
        private CustomViewHolder(View itemView) {
            super(itemView);
            like=(TextView) itemView.findViewById(R.id.t3like);
            font1 = Typeface.createFromAsset(context.getAssets(),"fonts/roboto.regular.ttf");
            name = (TextView)itemView.findViewById(R.id.name);
            name.setTypeface(font1);

            location=(TextView)itemView.findViewById(R.id.location3);
            location.setTypeface(font1);

            time = (TextView)itemView.findViewById(R.id.tme);
            time.setTypeface(font1);

            propic = (CircleImageView) itemView.findViewById(R.id.profile_image3);
            pic = (ImageView) itemView.findViewById(R.id.srcimg);

            propic.bringToFront();
        }

    }
}
