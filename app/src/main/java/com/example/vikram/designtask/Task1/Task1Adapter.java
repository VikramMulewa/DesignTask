package com.example.vikram.designtask.Task1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vikram.designtask.R;

import org.w3c.dom.Text;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Vikram on 09-May-17.
 */

public class Task1Adapter extends RecyclerView.Adapter<Task1Adapter.CustomViewHolder> {

    private List<Model1> models;
    private Context context;
    Typeface font1;

    public Task1Adapter(List<Model1> models, Context context) {
        this.models = models;
        this.context = context;
    }
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.task1_row,viewGroup, false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        String img;

        Model1 model = models.get(i);
        customViewHolder.like.setText(String.valueOf(model.getLike()));
        customViewHolder.name.setText(model.getName());
        customViewHolder.description.setText(model.getDescription());
        customViewHolder.time.setText(model.getTime());
        customViewHolder.location.setText(model.getLocation());
        customViewHolder.propic.setImageDrawable(context.getDrawable(model.getProfileid()));
        Log.d("logggg", "onBindViewHolder: "+model.getProfileid());
        customViewHolder.img.setImageDrawable(context.getDrawable(model.getImageid()));
    }
    @Override
    public int getItemCount() {
        return models.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        public TextView name,like,description,time,location;
        public CircleImageView propic;
        public ImageView img;
        public CustomViewHolder(View itemView) {
            super(itemView);
            font1 = Typeface.createFromAsset(context.getAssets(),"fonts/roboto.regular.ttf");
            like=(TextView) itemView.findViewById(R.id.like);
            name = (TextView)itemView.findViewById(R.id.name);
            name.setTypeface(font1);
            description=(TextView)itemView.findViewById(R.id.description);
            time = (TextView)itemView.findViewById(R.id.time);
            location = (TextView)itemView.findViewById(R.id.location);
            propic = (CircleImageView) itemView.findViewById(R.id.profile_image);
            img = (ImageView)itemView.findViewById(R.id.img);
        }

    }
}
