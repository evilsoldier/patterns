package abstractfactory.bases;

import abstractfactory.Base;

/**
 * @author Georgi Trendafilov
 */
public class Gin implements Base {

    @Override
    public void setBase() {
        System.out.println("Base Gin");
    }
}
