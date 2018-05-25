import items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;

    @Before
    public void before(){
        shop = new Shop();
        item = new Item();
    }

    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addToStock(item);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addToStock(item);
        shop.removeFromStock(item);
        assertEquals(0, shop.countStock());
    }


}
