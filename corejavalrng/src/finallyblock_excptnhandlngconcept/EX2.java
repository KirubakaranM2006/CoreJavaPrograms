package finallyblock_excptnhandlngconcept;

public class EX2 {

	public static void main(String[] args) {
		int error=0;
		try {
			int a=10/0;//here error occurs ,so the error go to catch obj
			error=0;
		}
		catch(Exception e){
			error=1;//here assigning error =1 then go to finally block to check the condition
			
		}
		finally {
			if(error==1) {//if condition is true
				System.out.println("Error found");
			}
			else {
				System.out.println("No error");
			}
		}
		
	}

}
