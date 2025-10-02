package operators;

public class Logicaloptr {

	public static void main(String[] args) {
		int x=10;
		int y=5;
		System.out.println("logical AND value:"+(x>5&&y<10));   //[&& is AND operator] here 10>5&&5<10(true)
		System.out.println("logical OR values:"+(x>5||y>10));    //[|| is OR operator] here 10>5||5>10(true)
	    //in or(||) any one condition is true it return true here is sts is true as x>5 so it returns true
        System.out.println(!(x > y));         // false (x > y is true, but NOT (!) makes it false)

	}

}


//                Operator	Meaning	Example (x = 10, y = 5)	Result
//________________________________________________________________________________________________________________________
//                &&	   |   Logical AND	 | (x > 5 && y < 10) |true
//                ||       |  Logical OR     | (x>5||y>10)       |true (as any one value is true it returns true)
//                !	       | Logical NOT	 | !(x > y)	         |false
                  //inner condition is true10>5 but !not operator makes it false 
//____________________________________________________________________________________________________________________________