package Praktikum.pert9.animal;

//super class
class animal {
    String name;

    //constructor
    public animal(String name){
        this.name = name;
    }

    //methode
    public void speak(){
        System.out.println("Animal Speak");
    }
}

//subsclass
class Dog extends animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(name + " whoooof");
    }
}

public class animaltester {
    public static void main(String[] args) {
        Dog dog = new Dog("Doggy");
        dog.speak();
    }
}