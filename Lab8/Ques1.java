import java.util.TreeMap;

public class Ques1{
    public static void main(String[] args) { 
        // Creating a TreeMap with some initial values 
        TreeMap<String, Integer> treeMap = new TreeMap<>(); 
        treeMap.put("One", 1); 
        treeMap.put("Three", 3); 
        treeMap.put("Two", 2); 
        // Display initial TreeMap 
        System.out.println("Initial TreeMap: " + treeMap); 
        // Remove the entry with the key "Two" 
        Integer removedValue = treeMap.remove("Two"); 
        System.out.println("Removed value = " + removedValue); 
        // Check if the entry with key "Three" still exists 
        boolean isThreeRemoved = !treeMap.containsKey("Three"); 
        System.out.println("Is the entry {Three=3} removed? " + isThreeRemoved); 
        // Display updated TreeMap 
        System.out.println("Updated TreeMap: " + treeMap); 
    } 
}