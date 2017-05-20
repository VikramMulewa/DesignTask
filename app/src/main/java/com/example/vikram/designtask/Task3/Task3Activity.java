package com.example.vikram.designtask.Task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vikram.designtask.R;

import java.util.ArrayList;
import java.util.List;

public class Task3Activity extends AppCompatActivity {
    RecyclerView recycler;
    List<Model3> list3;
    Task3Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        recycler = (RecyclerView)findViewById(R.id.recycler3);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        list3 = new ArrayList<>();
        Model3 t1 = new Model3();
        t1.setName("Suresh");
        t1.setLocation("Panjim");
        t1.setLike(67);
        t1.setTime("2 min ago");
        t1.setPic(R.drawable.ss);
        t1.setPropic(R.drawable.face);
        list3.add(t1);

        Model3 t2 = new Model3();
        t2.setName("Dinesh");
        t2.setLocation("Verna Goa");
        t2.setLike(54);
        t2.setTime("1 hour ago");
        t2.setPic(R.drawable.ss1);
        t2.setPropic(R.drawable.face1);
        list3.add(t2);

        Model3 t3 = new Model3();
        t3.setName("Mahesh");
        t3.setLocation("Mapusa");
        t3.setLike(1);
        t3.setTime("half hour ago");
        t3.setPic(R.drawable.ss2);
        t3.setPropic(R.drawable.face2);
        list3.add(t3);

        Model3 t4 = new Model3();
        t4.setName("Deepesh");
        t4.setLocation("Porvorim");
        t4.setLike(23);
        t4.setTime("2 days ago");
        t4.setPic(R.drawable.square);
        t4.setPropic(R.drawable.face3);
        list3.add(t4);

        Model3 t5 = new Model3();
        t5.setName("Naresh");
        t5.setLocation("Sanguem");
        t5.setLike(4);
        t5.setTime("30 min ago");
        t5.setPic(R.drawable.ss4);
        t5.setPropic(R.drawable.face);
        list3.add(t5);

        Model3 t6 = new Model3();
        t6.setName("Viresh");
        t6.setLocation("Cancon");
        t6.setLike(5);
        t6.setTime("7 days ago");
        t6.setPic(R.drawable.ss);
        t6.setPropic(R.drawable.face1);
        list3.add(t6);

        Model3 t7 = new Model3();
        t7.setName("Himesh");
        t7.setLocation("Quepem");
        t7.setLike(9);
        t7.setTime("2 days ago");
        t7.setPic(R.drawable.square);
        t7.setPropic(R.drawable.face2);
        list3.add(t7);

        Model3 t8 = new Model3();
        t8.setName("Vimesh");
        t8.setLocation("Home");
        t8.setLike(67);
        t8.setTime("5 days ago");
        t8.setPic(R.drawable.ss2);
        t8.setPropic(R.drawable.face3);
        list3.add(t8);
        adapter3 = new Task3Adapter(list3, Task3Activity.this);

        recycler.setAdapter(adapter3);


    }
}
