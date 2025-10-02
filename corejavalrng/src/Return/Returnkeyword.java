package Return;

public class Returnkeyword {
	int sum(int a,int b) {// → (Step 2) Execution moves here when process.sum(10,10) is called
		int k=a+b;         // // → (Step 3) k = 10 + 10 = 20
		return k; // → (Step 4) Return 20 back to where sum(10,10) was called
				
	}
       
	public static void main(String[] args) {
		Returnkeyword process=new Returnkeyword(); // → (Step 1) Create an object of the class
		process.sum(10,10); // → (Step 5) Call sum(10, 10), but the return value is ignored
        System.out.println(process.sum(10,10));// → (Step 6) Call sum(10,10) again and print the returned value
    
		
	}

}
