package abstractfactory;

import abstractfactory.additions.Water;
import abstractfactory.bases.Rakia;

/**
 * @author Georgi Trendafilov
 */
public class RakiaWithWaterFactory implements CocktailFactory {

    @Override
    public Base getBase() {
        return new Rakia();
    }

    @Override
    public Addition addAddition() {
        return new Water();
    }
}
