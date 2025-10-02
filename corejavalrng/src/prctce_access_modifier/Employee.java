package prctce_access_modifier;

public class Employee extends Person1{

	public static void main(String[] args) {
		Employee t=new Employee();
		System.out.println(t.name);//public
		System.out.println(t.age);//protected
		t.display();//private accessing
		System.out.println(t.address);//defualt accessing
	



	}

}
