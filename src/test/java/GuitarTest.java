import enums.InstrumentType;
import items.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", 75.00, 150.00, "Stratocaster", "Thrummm", "Blue", InstrumentType.STRING);
    }

    @Test
    public void canCheckMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canCheckPurchasePrice(){
        assertEquals(75.00, guitar.getPurchasePrice(), 0.01);
    }

    @Test
    public void canCheckSellPrice(){
        assertEquals(150.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canCheckModel(){
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void canMakeSound(){
        assertEquals("Thrummm", guitar.makeSound());
    }

    @Test
    public void canCheckColour(){
        assertEquals("Blue", guitar.getColour());
    }

    @Test
    public void canCheckType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canCheckMarkup(){
        assertEquals(75.00, guitar.calculateMarkup(), 0.01);
    }

}
