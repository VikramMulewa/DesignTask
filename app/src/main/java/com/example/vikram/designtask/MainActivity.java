package com.example.vikram.designtask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.vikram.designtask.Task1.Task1Activity;
import com.example.vikram.designtask.Task2.Task2Activity;
import com.example.vikram.designtask.Task3.Task3Activity;

public class MainActivity extends AppCompatActivity {
    Button b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b3 = (Button)findViewById(R.id.b3);

//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Still pending", Toast.LENGTH_SHORT).show();
//            }
//        });
    }


    public void task1(View v){
        Intent i = new Intent(MainActivity.this,Task1Activity.class);
        startActivity(i);
    }

    public void task2(View v){
        Intent i = new Intent(MainActivity.this,Task2Activity.class);
        startActivity(i);
    }

    public void task3(View v){
        Intent i = new Intent(MainActivity.this,Task3Activity.class);
        startActivity(i);
    }

}
