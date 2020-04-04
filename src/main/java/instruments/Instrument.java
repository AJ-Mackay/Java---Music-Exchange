package instruments;

public abstract class Instrument {

    protected String type;
    private String material;
    private String colour;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(String type, String material, String colour, double buyingPrice, double sellingPrice){
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType(){
        return type;
    }

    public String getMaterial(){
        return material;
    }

    public String getColour(){
        return colour;
    }

    public double getBuyingPrice(){
        return buyingPrice;
    }

    public double getSellingPrice(){
        return sellingPrice;
    }
}
