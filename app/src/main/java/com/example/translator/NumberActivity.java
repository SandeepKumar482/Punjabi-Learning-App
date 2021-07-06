package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ArrayList<Word> numbers= new ArrayList<Word>();
        numbers.add(new Word("zero","sifar",R.drawable.color_white,-1,-1));
        numbers.add(new Word("One","Ik",R.drawable.number_one,-1,-1));
        numbers.add(new Word("Two","do",R.drawable.number_two,-1,-1));
        numbers.add(new Word("Three","Tinn",R.drawable.number_three,-1,-1));
        numbers.add(new Word("Four","char",R.drawable.number_four,-1,-1));
        numbers.add(new Word("Five","panj",R.drawable.number_five,-1,-1));
        numbers.add(new Word("Six","chhe",R.drawable.number_six,-1,-1));
        numbers.add(new Word("Seven","satt",R.drawable.number_seven,-1,-1));
        numbers.add(new Word("Eight","athth",R.drawable.number_eight,-1,-1));
        numbers.add(new Word("Nine","nau",R.drawable.number_nine,-1,-1));
        numbers.add(new Word("Ten","das",R.drawable.number_ten,-1,-1));
        WordAddapter itemsAdapter = new WordAddapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);





    }
}