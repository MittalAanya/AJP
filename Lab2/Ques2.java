import java.util.*;
public class Ques2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Taking the year
        System.out.println("Enter the year");
        int y = sc.nextInt();

        int f = 0;

        // Conditions for leap year
        if(y%4 == 0){
            if(y%100 == 0){
                if(y%400 == 0){
                    f=1;
                }
                else f=0;
            }
            else{
                f=1;
            }
        }
        else{
            f=0;
        }

        if(f==1){
            System.out.println(y+ " is a leap year");
        }
        else
            System.out.println(y+ " is not a leap year");
    }
}
