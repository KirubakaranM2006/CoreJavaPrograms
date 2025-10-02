package oop_functions_or_method;

public class Store {
	void getsoap(int money) {//accepting value from shop.getsoap(20);--> Here money=20     //where(int money)->is parameter or arguments
		System.out.println("Soap purchased:");//this -> int money can be accessed only in this function cannot cause disturbance to other functions 
		System.out.println(money+"*Rs give me by shop keeper*");
	}
	void getchocolate(int money) {//{//accepting value from shop.getchocolate(45);--> Here money=45     //where(int money)->is parameter or arguments
		System.out.println("Chocolate Purchased:");//this-> int money can be accessed only in this function cannot cause disturbance to other functions 
		System.out.println(money+"*Rs give me by shop keeper*");
	}
	void getjuice(int money) {//{//accepting value from shop.getjuice(40);--> Here money=40     //where(int money)->is parameter or arguments
		System.out.println("Juice purchased:");//this-> int money can be accessed only in this function cannot cause disturbance to other functions 
		System.out.println(money+"*Rs give me by shop keeper*");
	}

	public static void main(String[] args) {
		Store shop=new Store();
		shop.getsoap(20);//adding value to the getsoap()
		shop.getchocolate(45);//adding value to the getchocolate()
		shop.getjuice(40);//adding value to the getjuice()
	}

}
