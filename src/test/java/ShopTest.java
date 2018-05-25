import enums.InstrumentType;
import items.Item;
import items.accessories.GuitarTuner;
import items.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item guitar;
    Item guitarTuner;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Fender", 75.00, 150.00, "Stratocaster", "Thrummm", "Blue", InstrumentType.STRING);
        guitarTuner = new GuitarTuner("Tuner", "Gibson", 1.50, 5.00);
    }

    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addToStock(guitar);
        shop.addToStock(guitarTuner);
        assertEquals(2, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canGetTotalMarkup(){
        shop.addToStock(guitar);
        shop.addToStock(guitarTuner);
        shop.getTotalpotentialProfit();
        assertEquals(78.50, shop.checkTotalMarkup(), 0.01);
    }

}
