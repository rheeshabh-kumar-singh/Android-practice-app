package com.example.practiceapp1;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Numbers extends AppCompatActivity {
    Integer[] numbers;
    String[] num;
    ListView list;
    ArrayList<NumberTrans> values;
    NumberAdapter nA;


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

        num= new String[100];

        for(int i=0;i<100;i++)
        {
            num[i]=String.valueOf(i+1);
        }

        values = new ArrayList<NumberTrans>();
        for(int i=0;i<100;i++)
        {
            values.add(new NumberTrans(numbers[i], num[i]));
        }


        nA = new NumberAdapter(this, values);
        list.setAdapter(nA);
    }
}