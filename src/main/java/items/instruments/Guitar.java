package items.instruments;

import enums.InstrumentType;

public class Guitar extends Instrument {

    public Guitar(String make, double purchasePrice, double sellPrice, String model, String sound, String colour, InstrumentType
            type){
        super(make, purchasePrice, sellPrice, model, sound, colour, type);
    }


}
