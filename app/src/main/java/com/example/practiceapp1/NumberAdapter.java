package com.example.practiceapp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NumberAdapter extends ArrayAdapter<NumberTrans> {



    public NumberAdapter(@NonNull Context context, ArrayList<NumberTrans> values) {
        super(context, 0, values);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.numview,parent,false);
        }

        NumberTrans current=getItem(position);

        TextView num, hindiWord;
        num= (TextView) listItemView.findViewById(R.id.num);
        hindiWord=(TextView) listItemView.findViewById(R.id.hindiWord);
        num.setText(current.getNum().toString());
        hindiWord.setText(current.getWord());

        return listItemView;
    }
}
