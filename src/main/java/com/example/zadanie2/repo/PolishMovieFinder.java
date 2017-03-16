package com.example.zadanie2.repo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ttomaka on 16.03.2017.
 */
@Repository
public class PolishMovieFinder implements MovieFinder {
//public class PolishMovieFinder {

    public List<String> findAll() {
        List<String> movieTitles = new ArrayList<String>();
        movieTitles.add("Killer");
        movieTitles.add("Kariera Nikodema Dyzmy");
        movieTitles.add("Dzień świra");
        return movieTitles;
    }
}
