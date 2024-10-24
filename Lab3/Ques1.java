// superclass
class Hillstations{
    void location(){
        System.out.println("Location is");
    }
    void famousfor(){
        System.out.println("Famous for");
    }
}

// sub class
class Manali extends Hillstations{
    // overridden the methods of parent class
    void location(){
        System.out.println("Manali is in Himachal Pradesh");
    }
    void famousfor(){
        System.out.println("It is famous for adventure sports");
    }
}

// sub class
class Mussoorie extends Hillstations{
    // overridden the methods of parent class
    void location(){
        System.out.println("Mussoorie is in Uttarakhand");
    }
    void famousfor(){
        System.out.println("It is famous for educational institutions");
    }
}

// sub class
class Gulmarg extends Hillstations{
    // overridden the methods of parent class
    void location(){
        System.out.println("Gulmarg is in J&K");
    }
    void famousfor(){
        System.out.println("It is famous for skiing");
    }
}
public class Ques1{
    public static void main(String args[]){

        // Creating the objects of the classes
        Hillstations A = new Hillstations();
        Hillstations M = new Manali();
        Hillstations Mu = new Mussoorie();
        Hillstations G = new Gulmarg();

        // Calling the methods using objects
        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();

    }
}