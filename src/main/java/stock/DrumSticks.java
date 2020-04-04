package stock;
import behaviours.ISell;

public class DrumSticks extends Stock implements ISell {

    public DrumSticks(String brand, String model, double buyingPrice, double sellingPrice){
        super(brand, model, buyingPrice, sellingPrice);
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice){
        return this.sellingPrice - this.buyingPrice;
    }
}
