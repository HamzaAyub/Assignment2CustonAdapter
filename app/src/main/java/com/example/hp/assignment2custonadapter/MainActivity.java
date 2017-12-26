package com.example.hp.assignment2custonadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.assignment2custonadapter.adapter.CustomAdapter;
import com.example.hp.assignment2custonadapter.model.MyContacts;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.mlist);
        ArrayList<MyContacts> arrayList = new ArrayList<>();
        arrayList.add(new MyContacts("N1", "P1", true));
        for (int i = 2; i < 1000; i++) {
            arrayList.add(new MyContacts("N" + i, "P" + i, true));
        }
        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        list.setAdapter(customAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView listText = (TextView) findViewById(R.id.txt_phone);
                String showContact =  " Pick : " + String.valueOf(adapterView.getItemAtPosition(i));
             //   String text = list.getTex
                Toast.makeText(MainActivity.this , showContact , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
