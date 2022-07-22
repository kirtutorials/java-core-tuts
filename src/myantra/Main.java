package myantra;

import myantra.store.model.ClothingItem;
import myantra.store.model.ClothingSize;
import myantra.store.model.ElectronicItem;
import myantra.store.model.Hat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Inheritance
 *  - defines the relationship between classes
 *  - super class / sub-class
 *  - Java Supports Single Inheritence
 *  - Extends
 *  - Multiple Inheritance can beachieved using interfaces
 */

public class Main {
    public static void main(String[] args) {

        ClothingItem item = new ClothingItem(ClothingItem.SHIRT, ClothingSize.M, 19.34, 3);
        ClothingItem myHat = new Hat(ClothingSize.L, 5.2,  10);
        ElectronicItem tv = new ElectronicItem("TV", 200.2, 5);

        Locale locale = new Locale("english", "US");
        var formatter = NumberFormat.getCurrencyInstance(locale);
        var result = String.format("Your %s of size %s order will cost %s", item.getType(), item.getSize() ,formatter.format(item.getPrice()));
        System.out.println(result);

        var hatItem = String.format("Your %s of size %s order will cost %s", myHat.getType(), myHat.getSize() ,formatter.format(myHat.getPrice()));
        System.out.println(hatItem);

        System.out.println(tv.getClass().getSimpleName() + " has a price of " + formatter.format(tv.getPrice()));

    }
}
