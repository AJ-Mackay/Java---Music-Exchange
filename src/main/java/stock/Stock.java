package stock;

public abstract class Stock {

    private String brand;
    private String model;
    protected double buyingPrice;
    protected double sellingPrice;

    public Stock(String brand, String model, double buyingPrice, double sellingPrice){
        this.brand = brand;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public double getBuyingPrice(){
        return buyingPrice;
    }

    public double getSellingPrice(){
        return sellingPrice;
    }
}
