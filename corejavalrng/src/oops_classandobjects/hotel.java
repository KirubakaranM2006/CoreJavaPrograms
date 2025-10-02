//classes and objects


package oops_classandobjects;

public class hotel {
	int coffee=20;//class values
	int tea =10;

	public static void main(String[] args) {
		hotel server1=new hotel();//creating object
		System.out.println(server1.coffee);//calling class values by object
		System.out.println(server1.tea);
		
		hotel server2=new hotel();
		System.out.println(server2.coffee);
		
		
		

	}

}
//class are blueprint
//object are instance of class
//here hotel is the class and server is object (server is person who ask whether the customer asking food is available in their hotel to the cooker )
//object(server)is called ,server will say the price or availability of food