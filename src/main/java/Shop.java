import behaviours.ISell;
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<ISell>();
    }

    public void addStock(ISell stock){
        this.stock.add(stock);
    }

    public void sellStock(ISell stock){
        this.stock.remove(stock);
    }

    public int getStockCount(){
        return this.stock.size();
    }
}
