package collections;
import java.util.*;

import myantra.store.model.ClothingItem;
import myantra.store.model.ClothingSize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class IteratingObject {
    public static void main(String[] arg) {
        ClothingItem item1 = new ClothingItem(ClothingItem.SHIRT, ClothingSize.L, 20.3, 3);
        ClothingItem item2 = new ClothingItem(ClothingItem.HAT, ClothingSize.L, 24.3, 6);
        ClothingItem item3 = new ClothingItem(ClothingItem.PANT, ClothingSize.L, 25.3, 9);
        ClothingItem item4 = new ClothingItem(ClothingItem.TROUSER, ClothingSize.L, 23.3, 12);

        List<ClothingItem> cloths = new ArrayList<>();
        cloths.add(item1);
        cloths.add(item2);
        cloths.add(item3);
        cloths.add(item4);

        // looping through the elementsusing foreach
        System.out.println("---------Looping------------");
        for(ClothingItem item: cloths) {
            System.out.println(item.getType());
        }

        // looping through the  iterator interface
        System.out.println("---------Iterator------------");
//        Iterator<ClothingItem> items = cloths.iterator();
//        System.out.println(items.next().getType());
//        while(items.hasNext()) {
//            ClothingItem item = items.next();
//            System.out.println(item.getType());
//        }

        // Modification during iterating the collection using for each loop
        System.out.println("---------Modification during iterating the collection------------");
//        for(ClothingItem item: cloths) {
//            if (item.getQuantity() > 9) {
//                cloths.remove(item);
//            }
//            System.out.println(item.getType());
//        }

        // Modification during iterating the collection using iterator interface
        System.out.println("---------Modification during iterating the collection------------");
//        Iterator<ClothingItem> itemIterator = cloths.iterator();
//        while(itemIterator.hasNext()) {
//            ClothingItem item = itemIterator.next();
//            //cloths.remove(itemIterator.next()); // modification
//            if (item.getQuantity() > 9) {
//                itemIterator.remove();
//            }
//            System.out.println(item.getType());
//        }

//        System.out.println(cloth);

        cloths.stream().filter(item -> (item.getQuantity() < 9)).forEach(item -> System.out.println(item.getType()));

    }
}
