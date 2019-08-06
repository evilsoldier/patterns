package abstractfactory.additions;

import abstractfactory.Addition;

/**
 * @author Georgi Trendafilov
 */
public class CocaCola implements Addition {

    @Override
    public void addAddition() {
        System.out.println("Addition CocaCola");
    }
}
