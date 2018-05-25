import behaviours.Isell;
import items.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList <Item> stock;
    private double totalMarkup;

    public Shop() {
        this.stock = new ArrayList <>();
        this.totalMarkup = 0.00;
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addToStock(Item item) {
        this.stock.add(item);
    }

    public void removeFromStock(Item item) {
        this.stock.remove(item);
    }

    public void getTotalpotentialProfit() {
        for (Isell item : stock) {
            totalMarkup += item.calculateMarkup();
        }
    }

    public double checkTotalMarkup(){
        return this.totalMarkup;
    }

}
