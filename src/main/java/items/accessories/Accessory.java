package items.accessories;

import items.Item;

public abstract class Accessory extends Item{

    private String accessoryName;

    public Accessory(String accessoryName, String make, double purchasePrice, double sellPrice){
        super(make, purchasePrice, sellPrice);
        this.accessoryName = accessoryName;
    }

    public String getAccessoryName(){
        return this.accessoryName;
    }


}
