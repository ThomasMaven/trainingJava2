package com.example.zadanie2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.example.zadanie2.repo.MovieFinder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ttomaka on 16.03.2017.
 */
@Component
@Service("ListerOfMovies")
public class MovieLister {
    @Autowired
    @Qualifier("Finder")
    private MovieFinder finder;

    public List<String> getMovieList() {
        return finder.findAll();
    }
}