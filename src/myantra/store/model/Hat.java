package myantra.store.model;

public class Hat extends ClothingItem {
    public Hat(ClothingSize size, double price, int quantity) {
        super(ClothingItem.HAT, size, price, quantity);
    }

    public void totalStockPrice() {
        System.out.println("nothing!");
    }

    public void qualityMark() {
        System.out.println("its tested! Ok!");
    }
}
