import java.util.*;
public class Ques1{

    // static method can only call static methods only directly and main is static that's why
    static int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Taking the number
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int r,s=0,temp;
        temp = num;

        // Repeat these steps till the number is greater than 0
        while(num>0){
            r=num%10;
            // Calling the fact method to find its factorial
            int f = fact(r);
            s += f;
            num /= 10;
        }
        if(s==temp) 
            System.out.println(temp+ " is a strong number");
        else 
            System.out.println(temp+ " is not a strong number");

    }
}