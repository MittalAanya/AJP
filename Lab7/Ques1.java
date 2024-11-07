import java.util.*;

public class Ques1{
    public static void main(String[] args){

        // Creating a hash map having string keys and integer values
        HashMap<String, Integer> mp = new HashMap<>();

        // Adding key-value pairs to the hashmap
        mp.put("Aanya",25);
        mp.put("Doraemon",30);
        mp.put("Nobita",35);

        // Display the original hashmap
        System.out.println("Initial hashmap: "+mp);

        // Associate a new value with the existing key
        mp.put("Doraemon",32);

        // Display the updated hashmap
        System.out.println("Updated hashmap: "+mp);
    }
}