import java.util.*;
public class Ques2 {
    public static void main(String[] args) {

        // Creating a new hashmap
        HashMap<String, Integer> mp = new HashMap<>();

        // Checking if it is empty using isEmpty method
        if(mp.isEmpty()){
            System.out.println("Hashmap is empty");
        }
        else{
            System.out.println("Hashmap is not empty");
        }

        // Add a key value pair, then check empty or not.
        mp.put("Aanya", 25);

        // Checking again to detect if after inserting the file it'll show that it is empty or not
        if(mp.isEmpty()){
            System.out.println("Hashmap is empty");
        }
        else{
            System.out.println("Hashmap is not empty");
        }
    }
}
