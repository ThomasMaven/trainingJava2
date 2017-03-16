package service;

import repo.MovieFinder;
import java.util.List;

/**
 * Created by ttomaka on 16.03.2017.
 */
public class MovieLister {
    private MovieFinder finder;

    public void setFinder(MovieFinder finder) {
        this.finder = finder;
    }

    public List<String> getMovieList() {
        return finder.findAll();
    }
}
