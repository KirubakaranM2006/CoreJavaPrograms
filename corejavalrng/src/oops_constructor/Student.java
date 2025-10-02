//basic constructor program for understanding
//before reading this constructor see the concept of function
package oops_constructor;

public class Student {
	int marks;//constructor defualt value as 0 assgn value to marks
	String name;//constructor assign (null) value to name
	Student(){//everytime it is called when obj is created *Even it is not called it automatically display when obj is created
		System.out.println("Welcome:");
	}
	

	public static void main(String[] args) {
		Student k1=new Student();//defualtly when the object is created the constructor is called
		Student k2=new Student();//defualtly when the object is created the constructor is called
		System.out.println(k1.marks);//marks=0 since we didnt initilize any value to marks so constructor defaulty assign 0		
		System.out.println(k2.marks);//marks=0 since we didnt initilize any value to marks so constructor defaulty assign 0	
		System.out.println(k1.name);//here name=null is o/p-> because we didnt initilize any value to name constructor automatically assign null value
 
	}

}
