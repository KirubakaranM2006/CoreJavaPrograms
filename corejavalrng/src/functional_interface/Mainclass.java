

//before reading the lambda expression we have to learn functionalinterface,itis the basics for that

//fonctional interface has only one abstract method

package functional_interface;

interface A{
	void disp();//(abstract method)-which should be overridden in subclass
}
public class Mainclass {

	public static void main(String[] args) {
		//we cannot create obj for this becoz of interface
		A obj=new A() {//annonymous inner class
			@Override
			public void disp() {
				System.out.println("This is the display method:");
				
			}
		};
		obj.disp();//calling the methhod
	
	}

}
//here anonymous innerclass is used to provide an implementation-(override) for the disp() method
//since A is the interface, we cannot create an object of it directly,instead we can use an annonymous class to implement(override) the method
//see lambda expression package after seeing this