import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repo.HelloWorld;
import service.MovieLister;

import java.util.List;

/**
 * Created by ttomaka on 16.03.2017.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
        helloWorld.printHello();

        MovieLister lister = (MovieLister) context.getBean("service.MovieLister");
        List<String> movieList = lister.getMovieList();

        System.out.println("\n\nList of movies:");

        for (String movieTitle: movieList){
            System.out.println(movieTitle);
        }
    }
}
