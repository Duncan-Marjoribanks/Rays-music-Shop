package items;

public abstract class Item {

    private String name;
    private String make;
    private double purchasePrice;
    private double sellPrice;

    private Item(String name, String make, double purchasePrice, double sellPrice){
        this.name = name;
        this.make = make;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getName(){
        return this.name;
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

}
