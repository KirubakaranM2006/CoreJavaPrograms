package prctce_access_modifier;

public class Person1 {
	public String name="Kirubakaran.M";
	protected int age=18;
	private int socialsecuritynumber=10293847;
	void display() {
		System.out.println(socialsecuritynumber);//as protected variables are accessed only inside the classs
	}
	String address="xyz";
	

}
