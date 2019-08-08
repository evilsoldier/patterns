package template;

/**
 * @author Georgi Trendafilov
 */
public class App {

    /**
     * Template Method is a behavioral design pattern that allows you
     * to defines a skeleton of an algorithm in a base class and let
     * subclasses override the steps without changing the overall algorithm’s structure.
     */
    public static void main(String[] args) {
        Facebook facebook = new Facebook("Pesho", "passw0rd");
        facebook.post("Some message");
    }
}
