//java supports multiple inheritance with interfaces, so you can achieve hybrid inheritance like this:
package hybridinheritance;

interface A {
    void methodA();//abstract class becoz generally under interface it is taken as abstract
}//if you want not a abstract use default keyword(default void methodA)

interface B {
    void methodB();//abstract class becoz generally under interface it is taken as abstract
}//if you want not a abstract use default keyword(default void methodA)

class C implements A, B {//Yes, class C is overriding the abstract methods from interface A and B
    public void methodA() {//override methodA
        System.out.println("Method A");
    }

    public void methodB() {//override method
        System.out.println("Method B");
    }

    void methodC() {//defualt method
        System.out.println("Class C");
    }
}

class D extends C {
    void methodD() {
        System.out.println("Class D");
    }
}

public class Test {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();  // from A
        obj.methodB();  // from B
        obj.methodC();  // from C
        obj.methodD();  // from D
    }
}
