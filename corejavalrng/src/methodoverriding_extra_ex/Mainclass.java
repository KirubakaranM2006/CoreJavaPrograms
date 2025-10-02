package methodoverriding_extra_ex;

class BaseAnimal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends BaseAnimal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Mainclass {
    public static void main(String[] args) {
        BaseAnimal a = new Cat();  // Reference of parent, object of child
        a.sound();             // Calls Cat's sound() at runtime
    }
}
// At compile time, the compiler only knows:
//a is an Animal
//But at runtime, it sees:
//a is actually a Cat object → so it calls Cat's version of sound()
// So, method selection happens at run time, hence called run-time polymorphism.