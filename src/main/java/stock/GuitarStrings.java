package stock;
import behaviours.ISell;

public class GuitarStrings extends Stock implements ISell {

    private String guitarType;
    private int numberInPack;

    public GuitarStrings(String brand, String model, String guitarType, int numberInPack, double buyingPrice, double sellingPrice) {
        super(brand, model, buyingPrice, sellingPrice);
        this.guitarType = guitarType;
        this.numberInPack = numberInPack;
    }

    public String getGuitarType(){
        return guitarType;
    }

    public int getNumberInPack(){
        return numberInPack;
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice){
        return this.sellingPrice - this.buyingPrice;
    }
}