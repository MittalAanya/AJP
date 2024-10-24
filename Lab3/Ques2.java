// Super class
class Animal{
    public void makeSound(){
        System.out.println("The animal makes a sound");
    }
}

// child class
class Cat extends Animal{
    // overridden the parent class method
    @Override
    public void makeSound(){
        System.out.println("The cat meows");
    }
}

// child class
class Dog extends Animal{
    // overridden the parent class method
    @Override
    public void makeSound(){
        System.out.println("The dog barks");
    }
}
public class Ques2 {
    public static void main(String args[]){
        // making the objects of the classes
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        
        // calling the methods using the objects
        animal.makeSound();
        cat.makeSound();
        dog.makeSound();

    }
}
