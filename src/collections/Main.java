package collections;

import myantra.store.model.ClothingItem;
import myantra.store.model.ClothingSize;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * "Govt Org" -> "Flyover bridge as interface" -> "contract to engineering services"
 * Java allows many ways to collect the data - Collections
 *          1. Ordered - List, LinkedList,
 *          2. UnOrdered
 */


public class Main {
    public static void main(String[] args) {

        System.out.println("Array with primitives!");
        int[] intValues = {1, 2, 3}; // fixed

        // interface is a contract for the implementation
        List<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("YELLOW");
        colors.add("YELLOW");
        colors.add("MAGENTA");
        System.out.println(colors);
//        colors.remove("YELLOW");
        System.out.println(colors.remove("YELLOW"));

//        Collection<String> uniqueColors = new HashSet<>(colors);
//
//        System.out.println(uniqueColors);

        colors.remove("RED");
        System.out.println(colors);
        System.out.println(colors.indexOf("YELLOW"));
        System.out.println(colors.get(3));

        // Items in a list shouldnt be primitive value  List<int> - not allowed

//        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//
//        List<ClothingItem> clothingItems = new ArrayList<>();
//        clothingItems.add(new ClothingItem(ClothingItem.SHIRT, ClothingSize.L, 39.2, 5));



    }
}

/**
 *  add(object), addAll, remove, removeAll, clear()
 *
 *      list.removeAll("A", "B","C")
 *
 *   .contain("Z") -> false
 *   .containAll("A",  "B", "C")
 *   isEmpty, size()
 */

