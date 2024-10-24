import java.util.*;
public class Ques2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Taking the first number
        System.out.println("Enter the first number");
        int first = sc.nextInt();

        // Taking the second number
        System.out.println("Enter the second number");
        int sec = sc.nextInt();

        int res = first>sec ? first : sec;
        System.out.println("Greater number is : "+res);
    }
}