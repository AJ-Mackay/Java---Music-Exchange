package instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp(){
        trumpet = new Trumpet("King B-Flat", "Metal", "Yellow", 75.75, 129.98, 3,true, false);
    }

    @Test
    public void hasType(){
        assertEquals("King B-Flat", trumpet.getType());
    }

    @Test
    public void hasAMaterial(){
        assertEquals("Metal", trumpet.getMaterial());
    }

    @Test
    public void hasAColour(){
        assertEquals("Yellow", trumpet.getColour());
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(75.75, trumpet.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(129.98, trumpet.getSellingPrice(), 0.0);
    }

    @Test
    public void hasANumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void comesWithASpareMouthpiece(){
        assertTrue(trumpet.hasASpareMouthpiece());
    }

    @Test
    public void comesWithAMute(){
        assertFalse(trumpet.hasAMute());
    }

    @Test
    public void canBePlayed(){
        assertEquals("The trumpet goes pah-pa-ra!", trumpet.play("pah-pa-ra!"));
    }

    @Test
    public void canGetProfit(){
        assertEquals(54.23, trumpet.calculateMarkup(75.75, 129.98), 0.01);
    }
}
