package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class familiyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familiy_members);

        ArrayList<Word> numbers= new ArrayList<Word>();
        numbers.add(new Word("Father","papaji", R.drawable.family_father,-1,-1));
        numbers.add(new Word("Mother","mataji", R.drawable.family_mother,-1,-1));
        numbers.add(new Word("Son","putar", R.drawable.family_son,-1,-1));
        numbers.add(new Word("Daughter","dhee", R.drawable.family_daughter,-1,-1));
        numbers.add(new Word("Brother","veerji", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Sister","Bhenji", R.drawable.family_older_sister,-1,-1));
        numbers.add(new Word("GrandFather","dadaji", R.drawable.family_grandfather,-1,-1));
        numbers.add(new Word("GrandMother","dadiji", R.drawable.family_grandmother,-1,-1));
        numbers.add(new Word("maternal GrandFather","nanaji", R.drawable.family_grandfather,-1,-1));
        numbers.add(new Word("maternal GrandMother","naniji", R.drawable.family_grandmother,-1,-1));
        numbers.add(new Word("Father's elder Brother","taaya", R.drawable.family_father,-1,-1));
        numbers.add(new Word("Father's younger Brother","chacha", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Father's elder Brother's Wife","tayee", R.drawable.family_younger_sister,-1,-1));
        numbers.add(new Word("Father's younger Brother's Wife","chachi", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Father's sister","bhua", R.drawable.family_younger_sister,-1,-1));
        numbers.add(new Word("Father's Sister's Husband","phupher", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Mother's sister","masi", R.drawable.family_younger_sister,-1,-1));
        numbers.add(new Word("Mother's Sister's Husband","masar", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Daughter of son ","potri", R.drawable.family_daughter,-1,-1));
        numbers.add(new Word("Son of son","potra", R.drawable.family_son,-1,-1));
        numbers.add(new Word("Daughter of Daughter","dotri", R.drawable.family_daughter,-1,-1));
        numbers.add(new Word("Son of Daughter","dotra", R.drawable.family_son,-1,-1));
        numbers.add(new Word("Wife","woti", R.drawable.family_father,-1,-1));
        numbers.add(new Word("Husband","karwala", R.drawable.family_mother,-1,-1));
        numbers.add(new Word("Wife's Sister","saali", R.drawable.family_younger_sister,-1,-1));
        numbers.add(new Word("Wife's Sister's Husband","sandhu", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Wife's Brother","Saala", R.drawable.family_younger_brother,-1,-1));
        numbers.add(new Word("Wife's Brother's wife","salehar", R.drawable.family_younger_sister,-1,-1));
        numbers.add(new Word("Husband's Sister","nanaan", R.drawable.family_younger_sister,-1,-1));
        numbers.add(new Word("Husband's Sister's Husband","nanaan waya", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Husband's elder Brother","jeth", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Husnad's elder Brother's wife","jethani", R.drawable.family_older_sister,-1,-1));
        numbers.add(new Word("Husband's younger Brother","dewar", R.drawable.family_younger_brother,-1,-1));
        numbers.add(new Word("Husnad's younger Brother's wife","dewrani", R.drawable.family_younger_sister,-1,-1));
        numbers.add(new Word("Daughter-in-Law","noo", R.drawable.family_older_sister,-1,-1));
        numbers.add(new Word("Son-in-Law","jawai", R.drawable.family_older_brother,-1,-1));
        numbers.add(new Word("Mother-in-Law","saa", R.drawable.family_grandmother,-1,-1));
        numbers.add(new Word("Father-in-Law","sora", R.drawable.family_grandfather,-1,-1));

        WordAddapter itemsAdapter = new WordAddapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.flist);

        listView.setAdapter(itemsAdapter);
    }
}