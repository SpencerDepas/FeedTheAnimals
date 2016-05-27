package com.example.spencerdepas.feedtheanimals;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //model object



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FeedTheAnimals feedTheAnimals = new FeedTheAnimals();
                feedTheAnimals.getTodaysAnimalFood();
                Snackbar.make(view, "Feeding the animals with " + feedTheAnimals.getTodaysAnimalFood(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


}
