//example of static method

package interface_ex;

interface mathoperation {
	static int add(int a,int b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		//calling static method usinf=g interface name
		int result=mathoperation.add(10,5 );//return a+b is store in->result
		System.out.println("The sum is:"+result);
	

	}

}
