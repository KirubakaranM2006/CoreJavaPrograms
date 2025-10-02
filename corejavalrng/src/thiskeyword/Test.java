package thiskeyword;
//Without this (but using different variable names):
//see it at last
class Student {
    int id;
    String name;

    void setValues(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setValues(101, "Amit");
        s.display();
    }
}