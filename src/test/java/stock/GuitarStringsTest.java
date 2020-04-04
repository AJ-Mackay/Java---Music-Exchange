package stock;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp(){
        guitarStrings = new GuitarStrings("Fender", "Original Bullet", "Electric", 6, 4.25, 8.50);
    }

    @Test
    public void hasABrand(){
        assertEquals("Fender", guitarStrings.getBrand());
    }

    @Test
    public void hasAModel(){
        assertEquals("Original Bullet", guitarStrings.getModel());
    }

    @Test
    public void typeOfGuitarTheStringsAreFor(){
        assertEquals("Electric", guitarStrings.getGuitarType());
    }

    @Test
    public void hasANumberOfStringsInAPack(){
        assertEquals(6, guitarStrings.getNumberInPack());
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(4.25, guitarStrings.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(8.50, guitarStrings.getSellingPrice(), 0.0);
    }

    @Test
    public void canGetProfit(){
        assertEquals(4.25, guitarStrings.calculateMarkup(8.50, 4.25), 0.0);
    }
}
