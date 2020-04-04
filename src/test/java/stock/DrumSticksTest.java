package stock;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks("Vic Firth", "American Classic 5A",5.20, 9.75);
    }

    @Test
    public void hasABrand(){
        assertEquals("Vic Firth", drumSticks.getBrand());
    }

    @Test
    public void hasAModel(){
        assertEquals("American Classic 5A", drumSticks.getModel());
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(5.20, drumSticks.getBuyingPrice(),0.0);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(9.75, drumSticks.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetProfit(){
        assertEquals(4.55, drumSticks.calculateMarkup(5.20, 9.75), 0.0);
    }
}
