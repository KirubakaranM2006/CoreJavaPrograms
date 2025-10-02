 //Compiletimepolymorphism(Methodoverloading)Same method name, but different parameters

package polymorphism;
class Calculator {
    // Method to add two integers
    void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    // Overloaded method to add three integers
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(10, 20);         // calls 2-argument method
        calc.add(5, 15, 25);      // calls 3-argument method
    }
}

