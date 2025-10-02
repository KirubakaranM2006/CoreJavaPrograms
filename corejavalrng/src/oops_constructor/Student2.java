package oops_constructor;

public class Student2 {
	int marks;
	String name;
	Student2(int a,String b)
	{ 
		marks=a;
		name=b;
		
		
	}

	public static void main(String[] args) {
		Student2 k=new Student2(10,"kirubakaran");
		Student2 j=new Student2(20,"john");
		System.out.println(k.marks);
		System.out.println(k.name);
		System.out.println(j.marks);
		System.out.println(j.name);
		
		
	
			}

}
