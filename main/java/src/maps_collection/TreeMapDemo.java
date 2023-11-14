package maps_collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

  public static void main(String[] args) {
    TreeMap<Integer, String> tmap = new TreeMap<>();
    // TreeMap<Integer, String> tmap = new TreeMap<>(Comparator.reverseOrder());
    tmap.put(3, "a");
    tmap.put(1, "e");
    tmap.put(100, "r");
    tmap.put(4, "u");
    tmap.put(15, "b");
    tmap.put(2, "c");
    tmap.put(0xDEAF, "n");

    System.out.println(tmap);




    // Key cannot be null in TreeMap

  }
}
