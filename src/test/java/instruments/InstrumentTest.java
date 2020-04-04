package instruments;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Test
    public void pianoAsAnInstrument(){
        instrument = new Piano("Baby Grand", "Wood", "Black", 275.00, 510, 3);
        assertEquals("Baby Grand", instrument.getType());
    }

    @Test
    public void trumpetAsAnInstrument(){
        instrument = new Trumpet("King B-Flat", "Metal", "Yellow", 75.75, 129.98, 3,true, false);
        assertEquals("Metal", instrument.getMaterial());
    }

    @Test
    public void canChangeTypeOfInstrument(){
        instrument = new Trumpet("King B-Flat", "Metal", "Yellow", 75.75, 129.98, 3,true, false);
        instrument = new Guitar("Acoustic","Wood", "Sunburst", 25.75, 44.99, 6);
        assertEquals("Acoustic", instrument.getType());
    }
}
