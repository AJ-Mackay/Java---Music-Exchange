import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import stock.DrumSticks;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    DrumSticks drumSticks;

    @Before
    public void setUp(){
        shop = new Shop();
        guitar = new Guitar("Acoustic","Wood", "Sunburst", 25.75, 44.99, 6);
        drumSticks = new DrumSticks("Vic Firth", "American Classic 5A",5.20, 9.75);
        shop.addStock(guitar);
        shop.addStock(drumSticks);
    }

    @Test
    public void canAddStock(){
        shop.addStock(guitar);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canSellStock(){
        shop.sellStock(drumSticks);
        assertEquals(1, shop.getStockCount());
    }

}
