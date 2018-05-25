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
}
