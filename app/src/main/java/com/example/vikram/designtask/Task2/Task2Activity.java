package com.example.vikram.designtask.Task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.vikram.designtask.R;

import java.util.ArrayList;
import java.util.List;

public class Task2Activity extends AppCompatActivity {
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler2);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<Model2> gaggeredList = getListItemData();

        GridViewAdapter rcAdapter = new GridViewAdapter(Task2Activity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }

    private List<Model2> getListItemData() {

        List<Model2> listViewItems = new ArrayList<Model2>();
        listViewItems.add(new Model2("Alkane","2m",R.drawable.face,R.drawable.square,"i am here",12, 4, 400));
        listViewItems.add(new Model2("Ethane","5h", R.drawable.face1,R.drawable.ss1,"nice to see you",4,3, 200));
        listViewItems.add(new Model2("Alkyne","54m", R.drawable.face2,R.drawable.ss2,"Android Material Design Floating Action Button",2,65, 100));
        listViewItems.add(new Model2("Benzene","4m", R.drawable.face3,R.drawable.ss3,"Android Material Design Floating Action Button",478,0, 250));
        listViewItems.add(new Model2("Amide","6h", R.drawable.face,R.drawable.ss4,"Android Material Design Floating Labels for EditText",88,9, 300));
        listViewItems.add(new Model2("Amino Acid","56m", R.drawable.face1,R.drawable.square,"Android Glide Image Library – Building Image Gallery App",0,2,250));
        listViewItems.add(new Model2("Phenol","5m", R.drawable.face2,R.drawable.ss1,"sample text",46,43, 400));
        listViewItems.add(new Model2("Carbonxylic","5m", R.drawable.face3,R.drawable.ss2,"sample text here too",99,67, 150));
        listViewItems.add(new Model2("Nitril","5m", R.drawable.face2,R.drawable.square,"more sample text",4,4,300));
        return listViewItems;
    }
}
