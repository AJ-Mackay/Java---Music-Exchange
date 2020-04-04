package instruments;
import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int numberOfValves;
    private boolean spareMouthpiece;
    private boolean hasMute;

    public Trumpet(String type, String material, String colour, double buyingPrice, double sellingPrice, int numberOfValves, boolean spareMouthpiece, boolean hasMute){
        super(type, material, colour, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
        this.spareMouthpiece = spareMouthpiece;
        this.hasMute = hasMute;
    }

    public int getNumberOfValves(){
        return numberOfValves;
    }

    public boolean hasASpareMouthpiece(){
        return spareMouthpiece;
    }

    public boolean hasAMute(){
        return hasMute;
    }

    public String play(String sound){
        return "The trumpet goes " + sound;
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice) {
        return sellingPrice - buyingPrice;
    }
}
