package com.example.recyclerviewonclicklistener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<DataList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RecyclerView;
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList = new ArrayList<DataList>();

        DataList dataList = new DataList("Sumon","Java Programmer");
        arrayList.add(dataList);
        dataList = new DataList("Khair","Android Developer");
        arrayList.add(dataList);
        dataList = new DataList("Sujit","Pyton Programmer");
        arrayList.add(dataList);


        DataAdapter dataAdapter = new DataAdapter(new Myclick() {
            @Override
            public void onMyClick(View view, int Possition) {

                String name = arrayList.get(Possition).getName();
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("name",name);
                startActivity(i);

            }
        },getApplicationContext(),arrayList);


        recyclerView.setAdapter(dataAdapter);


    }
}
