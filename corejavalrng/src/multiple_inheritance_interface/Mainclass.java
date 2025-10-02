package multiple_inheritance_interface;

interface printable{//like class(supper class)
	void display();
	default void show() {//default method used becoz it defualtly takes the abstract method in interfaces
		System.out.println("Welcome");
	}

}
interface showable{//super class
	void display();
}
class document implements printable,showable{//subclass
	@Override
	public void display() {
		System.out.println("Class C:");
		
		
		
	}
}


public class Mainclass {

	public static void main(String[] args) {
		document d=new document();
		d.display();
		d.show();//defualt method accessing

	}

}
//default as mentioned in 5th line becoz of we dont want the method be abstract it is used: 