package operators;

public class Assignmtoptr {

	public static void main(String[] args) {
		
		int x=10;//here the value 10 is assigned to x;
		int y=11;
		System.out.println("the value of x:"+(x=x+y));//output:10+11=21
		System.out.println("the value of x:"+(x+=y));//(output:21+11=32) becoz the value of x before is 21
	

	}

}
                     //x=x+y may cause error in some case in typecasting(expanded assisgnment)
                 // but the x+=y is best to use ,and this is used in every programs(shorthand assigntment)


         //=	Assign	x = 10	x = 10

//+=	Add and Assign	    |x += 5|x = x + 5
//-=	Subtract and Assign	|x -= 3|x = x - 3
//*=	Multiply and Assign	|x *= 2|x = x * 2
///=	Divide and Assign	|x /= 2|x = x / 2
//%=	Modulus and Assign	|x %= 3|x = x % 3
