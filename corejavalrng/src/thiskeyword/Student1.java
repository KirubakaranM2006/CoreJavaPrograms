//without this keyword
//see student2 for understandds
package thiskeyword;

public class Student1 {
	String name;
	int age;
	Student1(String name,int age){
		name=name;//compares parameter variable name=name(alice) which give->(null)but we to access instance variable and parameter 
		
		
		
	}
	

	public static void main(String[] args) {
		Student1 k1=new Student1("john",20);
		System.out.println(k1.name);

		

	}

}
//if it takes parameter parameter variable->(name=name) it show ->(null)
//so we want to use instance variable to compare parameter value ADD this->this.name(instance variable=name(parameter value-which is john)