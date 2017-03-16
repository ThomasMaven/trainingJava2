/**
 * Created by ttomaka on 16.03.2017.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring : Hello ! " + name);
    }
}
