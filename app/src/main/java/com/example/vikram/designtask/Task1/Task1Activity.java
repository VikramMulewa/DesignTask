package com.example.vikram.designtask.Task1;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.vikram.designtask.MainActivity;
import com.example.vikram.designtask.R;

import java.util.ArrayList;
import java.util.List;

public class Task1Activity extends AppCompatActivity {
    RecyclerView recycler;
    List<Model1> list;
    Task1Adapter adapter;
    int r1 = R.drawable.face;
    int r2 = R.drawable.face1;
    int r3 = R.drawable.face2;
    int r4 = R.drawable.face3;

    int src1 = R.drawable.ss;
    int src2 = R.drawable.ss1;
    int src3 = R.drawable.ss2;
    int src4 = R.drawable.ss4;

    //Typeface font1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        recycler =(RecyclerView)findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();


        //font1 = Typeface.createFromAsset(getAssets(),"fonts/roboto.regular.ttf");

//        TextView t;
//        t.setTypeface(font1);

        Model1 m1= new Model1();
        m1.setName("Alexandra Jones");
        m1.setDescription("I assure you I was quite of the squire's way of thinking, and hated the captain deeply");
        m1.setLike(45);
        m1.setProfileid(r1);
        m1.setImageid(src1);
        m1.setLocation("Verna");
        m1.setTime("2:18 pm");
        list.add(m1);

        Model1 m2= new Model1();
        m2.setName("Deepesh");
        m2.setDescription("I assure you I was quite of the squire's way of thinking, and hated the captain deeply");
        m2.setLike(45);
        m2.setProfileid(r2);
        m2.setImageid(src2);
        m2.setLocation("Margao");
        m2.setTime("3:18 pm");
        list.add(m2);

        Model1 m3= new Model1();
        m3.setName("Jay");
        m3.setDescription("I assure you I was quite of the squire's way of thinking, and hated the captain deeply");
        m3.setLike(45);
        m3.setProfileid(r3);
        m3.setImageid(src3);
        m3.setLocation("Mapusa");
        m3.setTime("4:18 pm");
        list.add(m3);

        Model1 m4= new Model1();
        m4.setName("Desmond");
        m4.setDescription("I assure you I was quite of the squire's way of thinking, and hated the captain deeply");
        m4.setLike(45);
        m4.setProfileid(r4);
        m4.setImageid(src4);
        m4.setLocation("Panjim");
        m4.setTime("5:18 pm");
        list.add(m4);



        adapter = new Task1Adapter(list, Task1Activity.this);

        recycler.setAdapter(adapter);


    }
}
