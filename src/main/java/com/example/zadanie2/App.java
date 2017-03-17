package com.example.zadanie2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.zadanie2.repo.HelloWorld;
import com.example.zadanie2.service.MovieLister;

import java.util.List;

/**
 * Created by ttomaka on 16.03.2017.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld helloWorld =  context.getBean("HelloWorld", HelloWorld.class);
        helloWorld.printHello();

        MovieLister lister = context.getBean("ListerOfMovies", MovieLister.class);
        List<String> movieList = lister.getMovieList();

        System.out.println("\n\nList of movies:");

        for (String movieTitle: movieList){
            System.out.println(movieTitle);
        }

    }
}
