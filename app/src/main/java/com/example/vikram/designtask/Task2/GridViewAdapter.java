package com.example.vikram.designtask.Task2;

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
import java.util.Random;

/**
 * Created by Vikram on 10-May-17.
 */

public class GridViewAdapter extends RecyclerView.Adapter<GridViewAdapter.CustomViewHolders> {
    Typeface font1;

    private List<Model2> itemList;
    private Context context;


    public GridViewAdapter(Context context, List<Model2> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public CustomViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.task2_row, null);
        CustomViewHolders rcv = new CustomViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(CustomViewHolders holder, int position) {
        Model2 model = itemList.get(position);

//        holder.cardview2.getLayoutParams().height = getRandomInteger(500,250);



        holder.name2.setText(model.getName());
        holder.description2.setText(model.getDescription());
        holder.time2.setText(model.getTime());
        holder.like2.setText(""+model.getLike());
        holder.comment2.setText(""+model.getComment());
        holder.propic2.setImageResource(model.getDp());
        holder.img2.getLayoutParams().height = model.getHeight();
        holder.img2.setImageResource(model.getMp());
    }
    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public class CustomViewHolders extends RecyclerView.ViewHolder {

        public TextView name2,description2,time2,like2,comment2;
        public ImageView propic2,img2;

        public CustomViewHolders(View itemView) {
            super(itemView);
            font1 = Typeface.createFromAsset(context.getAssets(),"fonts/roboto.regular.ttf");

            name2 = (TextView) itemView.findViewById(R.id.name2);
            name2.setTypeface(font1);
            description2 = (TextView)itemView.findViewById(R.id.description2);
            description2.setTypeface(font1);
            time2 = (TextView)itemView.findViewById(R.id.time2);
            time2.setTypeface(font1);
            like2 = (TextView)itemView.findViewById(R.id.like2);
            like2.setTypeface(font1);
            comment2 = (TextView)itemView.findViewById(R.id.comment2);
            comment2.setTypeface(font1);
            propic2 = (ImageView) itemView.findViewById(R.id.dp2);
            img2 = (ImageView)itemView.findViewById(R.id.img2);
        }
    }
}

