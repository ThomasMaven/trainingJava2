package repo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ttomaka on 16.03.2017.
 */
public class PolishMovieFinder implements MovieFinder {

    public List<String> findAll() {
        List<String> movieTitles = new ArrayList<String>();
        movieTitles.add("Killer");
        movieTitles.add("Kariera Nikodema Dyzmy");
        movieTitles.add("Dzień świra");
        return movieTitles;
    }
}
