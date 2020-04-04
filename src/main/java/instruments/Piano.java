package instruments;
import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numberOfPedals;

    public Piano(String type, String material, String colour, double buyingPrice, double sellingPrice, int numberOfPedals){
        super(type, material, colour, buyingPrice, sellingPrice);
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfPedals(){
        return numberOfPedals;
    }

    public String play(String sound){
        return "The piano goes " + sound;
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice){
        return sellingPrice - buyingPrice;
    }
}
