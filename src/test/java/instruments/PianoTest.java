package instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Baby Grand", "Wood", "Black", 275.00, 510.00, 3);
    }

    @Test
    public void hasAType(){
        assertEquals("Baby Grand", piano.getType());
    }

    @Test
    public void hasAMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasAColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(275.00, piano.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(510.00, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void hasANumberOfPedals(){
        assertEquals(3, piano.getNumberOfPedals());
    }

    @Test
    public void canBePlayed(){
        assertEquals("The piano goes plink", piano.play("plink"));
    }

    @Test
    public void canGetProfit(){
        assertEquals(235.00, piano.calculateMarkup(275.00, 510.00), 0.0);
    }
}
