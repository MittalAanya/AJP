public class Ques2 {
    public static void main(String [] args){
        // Made an array
        int [] arr = {1,2,3,4,5};
        // kept in try catch block to handle the exception that may arise
        try{
            // When i=arr.length i.e when i=5 here at that iteration exception will be thrown
            for(int i=0; i<=arr.length; i++){
                System.out.println("Element at index "+i+": "+arr[i]);
            }
        }
        // Throwing ArrayIndexOutOfBoundsException while accessing elements out of index in array
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bounds");
        }
    }
}
