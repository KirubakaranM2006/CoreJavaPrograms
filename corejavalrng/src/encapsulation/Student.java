package encapsulation;

public class Student {
	private int age;
	private String name;
	 
	public void setage(int a) {
		age=a;
		
	}
	public int getage() {
		return age;
	}
	
	void setname(String n) {
		name=n;
	}
	public String Getname() {
		return name;
	} 




	public static void main(String[] args) {
		Student t1=new Student();
		t1.setage(11);;
		t1.setname("kumar");
		System.out.println(t1.Getname()+":"+t1.getage());
	
		
		

	}

}
