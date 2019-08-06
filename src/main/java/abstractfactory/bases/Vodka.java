package abstractfactory.bases;

import abstractfactory.Base;

/**
 * @author Georgi Trendafilov
 */
public class Vodka implements Base {

    @Override
    public void setBase() {
        System.out.println("Base Vodka");
    }
}
