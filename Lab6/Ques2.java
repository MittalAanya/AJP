import java.util.*;
public class Ques2 {
    public static void main(String[] args){
        // Creating the stack
        Stack<Integer> stack = new Stack<Integer>();

        // Adding 10 elements in it initially
        stack.push(23);
        stack.push(33);
        stack.push(43);
        stack.push(53);
        stack.push(33);
        stack.push(63);
        stack.push(73);
        stack.push(83);
        stack.push(93);
        stack.push(98);

        // Display the original stack
        System.out.println("---elements---");
        System.out.println(stack);

        // Removing 4 elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        // Displaying stack after removing 4 elements from it
        System.out.println("Elements after removal");
        System.out.println(stack);

    }
}
