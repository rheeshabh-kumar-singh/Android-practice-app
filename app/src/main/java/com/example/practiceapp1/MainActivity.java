package com.example.practiceapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView family, phrases, number, colour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        family = (TextView) findViewById(R.id.family);
        phrases = (TextView) findViewById(R.id.phrases);
        number = (TextView) findViewById(R.id.numbers);
        colour = (TextView) findViewById(R.id.color);

        family.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          openFamilyList();

                                      }
                                  }
        );

        phrases.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           openPhrasesList();

                                       }
                                   }
        );


        number.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          openNumberList();

                                      }
                                  }
        );


        colour.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          openColourList();

                                      }
                                  }
        );


    }

    public void openFamilyList() {
        Intent intent = new Intent(this, FamilyMamber.class);
        startActivity(intent);
        Toast.makeText(this, "This is family relationship list",Toast.LENGTH_LONG).show();

    }

    public void openPhrasesList() {
        Intent intent = new Intent(this, Phrases.class);
        startActivity(intent);
        Toast.makeText(this, "This is phrase list",Toast.LENGTH_LONG).show();
    }

    public void openNumberList() {
        Intent intent = new Intent(this, Numbers.class);
        startActivity(intent);
        Toast.makeText(this, "This is Number list",Toast.LENGTH_LONG).show();
    }

    public void openColourList() {
        Intent intent = new Intent(this, Colours.class);
        startActivity(intent);
        Toast.makeText(this, "This is Colour list",Toast.LENGTH_LONG).show();

    }
}