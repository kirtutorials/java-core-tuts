package myantra.store.model;

public class ElectronicItem implements Product {
    private String type;
    private double price;
    private int quantity;

    public ElectronicItem(String type, double price, int quantity) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        double gst =  (9/100);
        return price + (price * gst);
    }

    public double getDiscount() {
        return 0;
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
}
