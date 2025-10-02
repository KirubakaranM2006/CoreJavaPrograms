//constructor overloading or parameterized constructor
//same name but different parameters are called constructor overloading or parameterized constructor
//similar to function and functiion overloading
package oops_constructor;

public class Student1 {
	int marks;
	String name;
	Student1(){
		System.out.println("Empty constructor:");
	}
	Student1(int a){
		System.out.println(a);
		System.out.println("welcome");
		
	}

	public static void main(String[] args) {
		Student1 k=new Student1(20);//this is similar to 2nd constructor becoz ->20 is passed to paramter int a
		Student1 j=new Student1();//this will call student1 1st constructor becoz-> no value is passed there also no parameter setted
		
		
		

	}

}
//constructor function2 see 