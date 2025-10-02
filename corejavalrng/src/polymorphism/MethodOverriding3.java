package polymorphism;

class AAnimal {
    void sound(String name) {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends AAnimal {
    @Override
    void sound(String name) {
        System.out.println(name + " barks");
    }
}

public class MethodOverriding3 {
    public static void main(String[] args) {
        AAnimal a = new Dog();  // Parent reference, child object
        a.sound("Tommy");      // Which method? → Decided at runtime
    }
}
//Why is this Run-Time Polymorphism?
//Same method name: sound
//Same parameter type: String
//Different class: One in Animal, one in Dog/
//The method call is resolved at runtime, depending on the object type.

