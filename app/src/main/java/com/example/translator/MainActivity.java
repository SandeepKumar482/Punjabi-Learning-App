package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nmber= (TextView)findViewById(R.id.number);
        nmber.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "opening The list of Numbers",Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity.this,NumberActivity.class);
                startActivity(i);
            }
        });
        TextView family= (TextView)findViewById(R.id.family_members);
        family.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "opening The list of Numbers",Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity.this,familiyMembers.class);
                startActivity(i);
            }
        });
        TextView color= (TextView)findViewById(R.id.colors);
        color.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "opening The list of Numbers",Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity.this,Colors.class);
                startActivity(i);
            }
        });
        TextView song= (TextView)findViewById(R.id.songs);
        song.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "opening The list of Numbers",Toast.LENGTH_SHORT).show();
                Intent i= new Intent(MainActivity.this,Songs.class);
                startActivity(i);
            }
        });




    }

}