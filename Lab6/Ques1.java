import java.util.HashSet;
public class Ques1{
    public static void main(String [] args){
        // Creating the hashset
        HashSet<String> hashset = new HashSet<>();

        // Adding the initial elements
        hashset.add("apple");
        hashset.add("banana");
        hashset.add("cherry");

        // Display the original hashset 
        System.out.println("Original hashset: "+hashset);

        // Element to be appended
        String element = "orange";

        // Appending the element to the hashset
        hashset.add(element);

        // Display the updated hashset
        System.out.println("Updated hashset: "+hashset);
    }
}