package com.example.zadanie2.repo;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ttomaka on 16.03.2017.
 */
@Repository
public class ForeignMovieFinder implements MovieFinder {


    public List<String> findAll() {
        List<String> movieTitles = new ArrayList<String>();
        movieTitles.add("Matrix");
        movieTitles.add("Star Wars");
        movieTitles.add("Spiderman");
        movieTitles.add("Titanic");
        return movieTitles;
    }

}
