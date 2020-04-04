package instruments;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Acoustic","Wood", "Sunburst", 25.75, 44.99, 6);
    }

    @Test
    public void hasType(){
        assertEquals("Acoustic", guitar.getType());
    }

    @Test
    public void hasAMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasAColour(){
        assertEquals("Sunburst", guitar.getColour());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasABuyingPrice(){
        assertEquals(25.75, guitar.getBuyingPrice(), 0.0);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(44.99, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void hasADescription(){
        assertEquals("This is an example of an Acoustic guitar", guitar.description());
    }

    @Test
    public void canBePlayed(){
        assertEquals("The guitar goes twang", guitar.play("twang"));
    }

    @Test
    public void canGetProfit(){
        assertEquals(19.24, guitar.calculateMarkup(25.75, 44.99), 0.01);
    }
}
