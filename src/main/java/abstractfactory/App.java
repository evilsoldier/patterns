package abstractfactory;

/**
 * @author Georgi Trendafilov
 */
public class App {

    /**
     * The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
     */
    public static void main(String[] args) {
        GinWithTonikFactory ginWithTonikFactory = new GinWithTonikFactory();
        RakiaWithWaterFactory rakiaWithWaterFactory = new RakiaWithWaterFactory();
        VodkaWithColaFactory vodkaWithColaFactory = new VodkaWithColaFactory();

        System.out.println(ginWithTonikFactory.getBase() + " " + ginWithTonikFactory.addAddition());
        System.out.println(rakiaWithWaterFactory.getBase() + " " + rakiaWithWaterFactory.addAddition());
        System.out.println(vodkaWithColaFactory.getBase() + " " + vodkaWithColaFactory.addAddition());

    }
}
