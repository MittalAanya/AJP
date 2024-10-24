import java.util.*;
public class Ques2 {
    public static void main(String[] args) {

        // Creating an arraylist of integers
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        int ans = 0;
        // Using enhanced for loop.
        for(int n: nums){
            // Checking the condition if number if even or not
            if(n%2 == 0){
                ans += n;
            }
        }
        // Printing the output sum
        System.out.println("Sum of even numbers : "+ans);
    }
    
}
