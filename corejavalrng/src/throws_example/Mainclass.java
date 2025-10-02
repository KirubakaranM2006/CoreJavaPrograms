//throws keyword is used when we know the method is going to cause an error in that time we use (throws exception) in methods
//it is used only in methods
//Throws can only be used after the parameter list in a method declaration
package throws_example;



class calc{
	void div()throws Exception{//WKT the method is going to cause an error, so we used throw exception 
		int a=10/0;
	}
}
public class Mainclass {

	public static void main(String[] args) {
		calc c=new calc();
		try {//should uses try catch we call the method for handling exception
			c.div();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
