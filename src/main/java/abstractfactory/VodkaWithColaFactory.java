package abstractfactory;

import abstractfactory.additions.CocaCola;
import abstractfactory.bases.Vodka;

/**
 * @author Georgi Trendafilov
 */
public class VodkaWithColaFactory implements CocktailFactory {

    @Override
    public Base getBase() {
        return new Vodka();
    }

    @Override
    public Addition addAddition() {
        return new CocaCola();
    }
}
