package com.minaryanshofa.costumlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //List of type hero for holding list items
    List<hero> heroList;
    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);
        //adding some values to our list
        heroList.add(new hero(R.drawable.spiderman, "Spiderman",
                "Avengers"));
        heroList.add(new hero(R.drawable.joker, "Joker", "Injustice Gang"));

        heroList.add(new hero(R.drawable.ironman, "Iron Man",
                "Avengers"));
        heroList.add(new hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        heroList.add(new hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        heroList.add(new hero(R.drawable.batman, "Batman", "Justice League"));
        //creating the adapter
        MyListAdapter adapter = new MyListAdapter(this,
                R.layout.my_custom_list, heroList);
        //attaching adapter to the listview
        listView.setAdapter(adapter);
    }
}