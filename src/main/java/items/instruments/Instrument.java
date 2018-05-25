package items.instruments;

import enums.InstrumentType;
import items.Item;

public abstract class Instrument extends Item {


    private String model;
    private String sound;
    private String colour;
    private InstrumentType type;

    protected Instrument(String make, double purchasePrice, double sellPrice, String model, String sound, String colour, InstrumentType type){
        super(make, purchasePrice, sellPrice);
        this.model = model;
        this.sound = sound;
        this.colour = colour;
        this.type = type;
    }

    public String getModel(){
        return this.model;
    }

    public String makeSound(){
        return this.sound;
    }

    public String getColour(){
        return this.colour;
    }

    public InstrumentType getType() {
        return type;
    }

}
