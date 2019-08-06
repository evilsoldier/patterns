package abstractfactory;

import abstractfactory.additions.Tonik;
import abstractfactory.bases.Gin;

/**
 * @author Georgi Trendafilov
 */
public class GinWithTonikFactory implements CocktailFactory {

    @Override
    public Base getBase() {
        return new Gin();
    }

    @Override
    public Addition addAddition() {
        return new Tonik();
    }
}
