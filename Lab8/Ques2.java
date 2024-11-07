import java.util.Map;
import java.util.TreeMap;

public class Ques2 {
    public static void main(String[] args) { 
        TreeMap<String, Integer> treeMap = new TreeMap<>(); 
        treeMap.put("One", 1); 
        treeMap.put("Two", 2); 
        treeMap.put("Three", 3); 
        // Using different methods to navigate the TreeMap 
        navigateUsingEntrySet(treeMap); 
        navigateUsingKeySet(treeMap); 
        navigateUsingValues(treeMap); 
        navigateUsingIterator(treeMap); 
    } 
    public static void navigateUsingEntrySet(TreeMap<String, Integer> map) { 
        System.out.println("Navigating using entrySet:"); 
        for (Map.Entry<String, Integer> entry : map.entrySet()) { 
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()); 
        } 
    } 
    public static void navigateUsingKeySet(TreeMap<String, Integer> map) { 
        System.out.println("\nNavigating using keySet:"); 
        for (String key : map.keySet()) { 
            System.out.println("Key: " + key + ", Value: " + map.get(key)); 
        } 
    } 
    public static void navigateUsingValues(TreeMap<String, Integer> map) { 
        System.out.println("\nNavigating using values:"); 
        for (Integer value : map.values()) { 
            System.out.println("Value: " + value); 
        } 
    } 
    public static void navigateUsingIterator(TreeMap<String, Integer> map) { 
        System.out.println("\nNavigating using iterator:"); 
        var iterator = map.entrySet().iterator(); 
        while (iterator.hasNext()) { 
            Map.Entry<String, Integer> entry = iterator.next(); 
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()); 
        } 
    }
}
