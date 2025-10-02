//example of cllassees and object;
package oops_classandobjects;

public class car {
	String carname;
	String model;
	int modelyear;//these are class values ,these car class is said to be blueprint which can be used many times
	int price=0;
	
	

	public static void main(String[] args) {
		car car1=new car();
		car1.carname="Toyota";//car1(object1)
		car1.model="Fortuner";//we can assign value when calling the object also
		car1.modelyear=2024;
		car1.price=530000;
		
		car car2=new car();
		car2.carname="Hyundai";//car2(object2)
		car2.model="i10";//we can assign value when calling the object also
		car2.modelyear=2024;
		car2.price=120000;
		
		car car3=new car();
		car3.carname="Maruti Suzuki";//car2(object2)
		car3.model="Swift";//we can assign value when calling the object also
		car3.modelyear=2024;
		car3.price=100000;
		
		car car4=new car();
		  
		
		
		System.out.println(car1.price);
		System.out.println(car2.price);
		System.out.println(car3.price+" "+car3.carname);
		System.out.println(car4.price);// here i didnt assign price value to object 4(car4) so in the class i assigned price =0 that will be displayed


	}

}