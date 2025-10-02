
// Why this is Encapsulation?
//You hide data using private.
//You control access using public methods.
//Outside classes cannot access age or name directly.
//This ensures safety, control, and clean design
package encapsulation;
public class Student1 {
    //Step 1: Private data members
    private int age;
    private String name;

    //Step 2: Public setter for age
    public void setAge(int a) {
        age = a;
    }

    //Step 3: Public getter for age
    public int getAge() {
        return age;
    }

    //Step 4: Public setter for name
    public void setName(String n) {
        name = n;
    }

    //Step 5: Public getter for name
    public String getName() {
        return name;
    }

    //Step 6: Main method to test
    public static void main(String[] args) {
        Student1 s = new Student1();

        s.setAge(18);
        s.setName("Kumar");

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
//private-> hides the data from direct access.
//public-> getter/setter gives controlled access.
//This is the core idea of encapsulation in Java.

