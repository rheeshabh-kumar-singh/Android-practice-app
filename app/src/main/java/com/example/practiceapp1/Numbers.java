package com.example.practiceapp1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Numbers extends AppCompatActivity {
    Integer[] numbers;
    ListView list;
    ArrayAdapter<Integer> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        list=(ListView) findViewById(R.id.list);
        numbers= new Integer[100];
        for(int i=0;i<100;i++)
        {
            numbers[i]=i+1;
        }
        arrayAdapter= new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1,numbers);
        list.setAdapter(arrayAdapter);
    }
}