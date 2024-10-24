class Bank{
    // instance variable
    double amount;  

    // parameterised constructor
    public Bank(double amount){  
        this.amount = amount;
    }

    // Method to withdraw
    public void withdrawAmount(int n){
        String msg = (amount-n)>=2000 ? "Withdraw Successful" : "Insufficient Balance";
        if(amount-n >= 2000){
            amount -= n;
        }
        System.out.println(msg);
    }

    // Method to deposit
    public void depositAmount(int n){
        amount += n;
        System.out.println("Deposited Successfully");
    }

    // Method to display balance
    public void display(){
        System.out.println("Total Balance : "+amount);
    }
}
public class Ques1{
    public static void main(String args[]){
        Bank obj = new Bank(10000);
        obj.withdrawAmount(4000);
        obj.depositAmount(1000);
        obj.display();
    }
}