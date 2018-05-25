import items.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> stock;

    public Shop(){
        this.stock = new ArrayList <>();
    }

    public int countStock(){
        return this.stock.size();
    }

    public void addToStock(Item item){
        this.stock.add(item);
    }

    public void removeFromStock(Item item){
        this.stock.remove(item);
    }
}
