
//reference datatype is also called non primitive datatype;


package datatypes;

public class referencedatatype {

	public static void main(String[] args) {
		
		//1.string
		String a="JAVA";
		System.out.println("the string value:"+a);
		
		//2.array
		int[]values=new int[3];
		System.out.println(values[2]);
		
		//3.class
		class student{//class are defined by used here class is keyword student like variable(class variable)
		String name ="k";
		int age=14;
		//we cant give here print sts;
		
		}
		student k1=new student();//object;
	System.out.println("NAME:"+k1.name);
	System.out.println("AGE:"+k1.age);
		
	

	}

}
