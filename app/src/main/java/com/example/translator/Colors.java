package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Word> numbers= new ArrayList<Word>();
        numbers.add(new Word("Black","kala", R.drawable.color_black,-1,-1));
        numbers.add(new Word("White","safed", R.drawable.color_white,-1,-1));
        numbers.add(new Word("Yellow","peela", R.drawable.color_mustard_yellow,-1,-1));
        numbers.add(new Word("Green","hara", R.drawable.color_green,-1,-1));
        numbers.add(new Word("Blue","neela",-1,-1,-1));
        numbers.add(new Word("Purple","baingani", -1,-1,-1));
        numbers.add(new Word("Brown","bhura", R.drawable.color_brown,-1,-1));
        numbers.add(new Word("Orange","narangi", -1,-1,-1));
        numbers.add(new Word("Pink","gulabi", -1,-1,-1));
        numbers.add(new Word("Red","lal", R.drawable.color_red,-1,-1));
        WordAddapter itemsAdapter = new WordAddapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.clist);

        listView.setAdapter(itemsAdapter);
    }
}