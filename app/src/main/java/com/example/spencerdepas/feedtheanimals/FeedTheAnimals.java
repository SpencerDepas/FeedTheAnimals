package com.example.spencerdepas.feedtheanimals;

import java.util.Random;

/**
 * Created by SpencerDepas on 5/27/16.
 */
public class FeedTheAnimals {

    //MODEL 


    FeedTheAnimals(){

    }


    public String getTodaysAnimalFood(){


        Random rn = new Random();
        int answer = rn.nextInt(1000) + 1;


        String animalFood = "Food Extreem NmBR" + answer;


        return animalFood;

    }



}
