package com.example.translator;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAddapter extends ArrayAdapter<Word> {

    public WordAddapter(Activity context, ArrayList<Word> words) {
        super(context, 0,words);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View list_item_view=convertView;
       if(list_item_view==null){
           list_item_view= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }
       Word currword=getItem(position);
        TextView defaultView=(TextView)list_item_view.findViewById(R.id.list_item);
        defaultView.setText(currword.getWord());

        TextView translateView=(TextView)list_item_view.findViewById(R.id.list_item2);
        translateView.setText(currword.getTranslate());
        ImageView imageView=(ImageView) list_item_view.findViewById(R.id.image);
        ImageView imageViewa=(ImageView) list_item_view.findViewById(R.id.sing);

        if(currword.check()){
            imageView.setImageResource(currword.getmImage());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        if(currword.check2()){
            imageViewa.setImageResource(currword.getmImage2());
            imageViewa.setVisibility(View.VISIBLE);
        }
        else {
            imageViewa.setVisibility(View.GONE);
        }


        return list_item_view;
    }
}
