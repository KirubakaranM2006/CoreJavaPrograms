//Even the try catch blocks true or false or executes or not executes will display the finally block
//in note witherror without error examples are available if didnt understand see the note for reference

package finallyblock_excptnhandlngconcept;

public class Mainclass {

	public static void main(String[] args) {
		try {
			int a=10/0;//error found in try it takes the error to catch object
		}
		catch(Exception e){
			System.out.println(e);//printing the error as catch object
			
		}
		finally {//even the try and catch is true or false or execute or not execute will display the code in finallyblock 
			System.out.println("This is from finally block:");
		}
		

	}

}
