package myantra.store.model;

public class ClothingItem implements Product{
    public static final String SHIRT = "Shirt";
    public static final String PANT = "Pant";
    public static final String TROUSER = "Trouser";
    public static final String HAT = "Hat";
    // properties or data or model or fileds
    private String type;
    private ClothingSize size;
    private double price;
    private int quantity;

    // Constructor

    public ClothingItem() {

    }

    public ClothingItem(String type, ClothingSize size, double price, int quantity) {
        this.type = type;
        this.size = size;
        this.price = price;
        this.quantity = quantity;
    }


    // behvaiours or methods or fucntion or  logic or controller

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public double getPrice() {
        double gst =  (18/100);
        return price + (price * gst);
    }

    public double getDiscount() {
        return 5;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void totalStockPrice() {
        System.out.println(this.quantity * this.price);
    }
//
//    public String toString() {
//
//    }
}
