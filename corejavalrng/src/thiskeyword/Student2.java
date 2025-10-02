//without this keyword
//see student2 for understandds
package thiskeyword;

public class Student2 {
	String name;
	
	Student2(String name){
		this.name=name;//It does not compares parameter variable name=name(alice) but we to access instance variable and parameter 
		//this compares (instance variable) (this.name)=name(john)
		
		
	}
	

	public static void main(String[] args) {
		Student2 k1=new Student2("john");
		System.out.println(k1.name);

		

	}

}
//refer student 1 class for understanding

//Step 1: Declared instance variables-> (name) 
//Step 2: Created a constructor with parameters that have the same names as instance variables.
//Step 3: Used the this keyword to assign values to the instance variables.
//Step 4: Created a method display() to print the student's details.
//Step 5: Used System.out.println() to display the values of instance variables.
//Step 6: Created an object k1 using the constructor and passed values to initialize the object.
//Step 7: Called the display() method using the object k1 to print the details.
