package operators;

public class Booleanoptr {

	public static void main(String[] args) {
		int x=5;            //0101 binary value of 5 if we do lcm by 2 we get this binary values
		int y=3;            //0011 binary value of 3
		System.out.println("Boolean AND operation is:"+(x&y));//perform multiplications in binary digits
		//inter operations
		
		//   0101  (5)
		// & 0011  (3)
		// ------------
		//   0001  (1) //outpt:1
		
		int x1=5;            //0101 binary value of 5 if we do lcm by 2 we get this binary values
		int y2=3;            //0011 binary value of 3
		System.out.println("Boolean OR operation is:"+(x1|y2));//perform addition in binary digits
		
		//inter operations
	      //      0101  (5)
		  // |    0011  (3)
		  //      ------------
		  //      0111  (7) assci value of111 is 7

		int x11=5;            //0101 binary value of 5 if we do lcm by 2 we get this binary values
		int y21=3;            //0011 binary value of 3
		System.out.println("Boolean XOR operation is:"+(x11^y21));//perform addition in binary digits
		//inter operations
		 //            0105  (5)
		   //      ^   0011  (3)
		 //         ------------
		     //        0110  (6) ascii value of 0110 is 6
		
		//complement functions
		        int xq = 5;  // 0101
		        int result = ~xq;  // -6
		        System.out.println("~xq = " + result); // Output: -6
		        //inner operations
		       //    0000 0000 0000 0101  (5)
		       // ~  1111 1111 1111 1010  (-6 in two's complement)

		        
		        
		        
		        
		     //left shift(<<)
		     //   Shifts bits to the left, filling with 0s on the right.
		     //   Formula: x << n = x * (2^n)
		        
		                int x7 = 5;  // 0101
		                int result7 = x << 1;  // 1010 (10 in decimal)
		                System.out.println("x7 << 1 = " + result7); // Output: 10
		                //inner operations
		             //             0101  (5)  
		             //    <<       1
		             //             ------------
		             //             1010  (10)

		         
		//right shift(>>)
		           //     Shifts bits to the right, discarding rightmost bits.
		           //     Formula: x >> n = x / (2^n)
		            
		                        int x6 = 5;  // 0101
		                        int result6 = x6 >> 1;  // 0010 (2 in decimal)
		                        System.out.println("x6 >> 1 = " + result6); // Output: 2
		                        //inter operations
		                        
		                  //         0101  (5)
		                  //      >> 1
		                  //         ------------
		                  //         0010  (2)

		                
             //unsigned right shift(>>>)
		                      //Similar to >> but does not preserve the sign (used for positive values).  
		                     
		                                int x8 = -5;
		                                int result8 = x8 >>> 1;
		                                System.out.println("x8 >>> 1 = " + result8);
		        //Negative numbers in two's complement are shifted, filling with 0s instead of sign bits.
  
		                          
	}

}
