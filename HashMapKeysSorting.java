import java.util.*;

public class HashMapKeysSorting {
    public static void main(String[] args) {
        Map<String, String> unsortedmap = new HashMap<>();
        unsortedmap.put("Dell", "Dell");
        unsortedmap.put("Apple", "Apple");
        unsortedmap.put("Google", "Google");
        unsortedmap.put("Oracle", "Oracle");
        unsortedmap.put("Yahoo", "Yahoo");
        for (Map.Entry<String, String> entry : unsortedmap.entrySet()) {
            System.out.println("Unsorted key values are: " + entry.getKey());
        }
        System.out.println("\n");
        Map<String, String> sortedmap = new TreeMap<>(unsortedmap); // This data structure sorts the map.
        for (Map.Entry<String, String> entry : sortedmap.entrySet()) {
            String key = entry.getKey();
            System.out.println("Sorted key values are: " + entry.getKey());
        }
    }
}
