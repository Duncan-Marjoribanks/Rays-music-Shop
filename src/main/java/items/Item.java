package items;

import behaviours.Isell;

public abstract class Item implements Isell{

    private String make;
    private double purchasePrice;
    private double sellPrice;

    protected Item(String make, double purchasePrice, double sellPrice){
        this.make = make;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getMake(){
        return this.make;
    }

    public double getPurchasePrice(){
        return this.purchasePrice;
    }

    public double getSellPrice(){
        return this.sellPrice;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.purchasePrice;
    }

}
