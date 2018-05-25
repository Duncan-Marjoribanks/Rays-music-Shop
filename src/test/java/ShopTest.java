import enums.InstrumentType;
import items.Item;
import items.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item guitar;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Fender", 75.00, 150.00, "Stratocaster", "Thrummm", "Blue", InstrumentType.STRING);
    }

    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addToStock(guitar);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.countStock());
    }

}
