package instruments;
import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;

    public Guitar(String type, String material, String colour, double buyingPrice, double sellingPrice, int numberOfStrings){
        super(type, material, colour, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public String play(String sound){
        return "The guitar goes " + sound;
    }

    public String description() {
        return "This is an example of an " + type + " guitar";
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice){
        return sellingPrice - buyingPrice;
    }
}
