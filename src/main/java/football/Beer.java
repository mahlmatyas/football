package football;

public class Beer {

    //property
    private String brand;
    private int qty;

    //getter (brand)
    public String getBrand() {
        return brand;
    }
    //getter (qty)
    public int getQty() {
        return qty;
    }

    //constructor
    public Beer(int qty, String brand){
        this.qty=qty;
        this.brand=brand;

    }

}
