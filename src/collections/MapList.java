package collections;

import myantra.store.model.ClothingItem;
import myantra.store.model.ClothingSize;

import java.util.*;

public class MapList {
    public static void main(String[] arg) {
        ClothingItem item1 = new ClothingItem(ClothingItem.SHIRT, ClothingSize.L, 10, 6);
        ClothingItem item2 = new ClothingItem(ClothingItem.HAT, ClothingSize.L, 20, 15);
        ClothingItem item3 = new ClothingItem(ClothingItem.PANT, ClothingSize.L, 30, 6);

//        List<ClothingItem> dresses = new ArrayList<>();
        Map<String, ClothingItem> dressCollection = new HashMap<>();

        dressCollection.put("shirt", item1);
        dressCollection.put("hat", item2);
        dressCollection.put("pant", item3);
//        System.out.println(dressCollection.get("hat").getType());
//        System.out.println(dressCollection.get("shirt").getType());
//        System.out.println(dressCollection.get("pant").getType());
//        System.out.println(dressCollection.keySet());
        var keys = dressCollection.keySet();

        for(String key: keys) {
            System.out.println(dressCollection.get(key).getType());
        }




    }
}
