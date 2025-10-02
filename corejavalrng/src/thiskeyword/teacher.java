package thiskeyword;

public class teacher {
	String myname;
	teacher(){
		
		System.out.println("welcome:");
	}
	void setname(String myname) {
		this.myname=myname;
		
		
	}

	public static void main(String[] args) {
		teacher t1=new teacher();//step 1 constructor is printed when object is created
		t1.setname("mark");//set myname=mark
		System.out.println(t1.myname);//prints the myname
		
		
		

	}

}
//here compiler confuses that is it uses parameter variable myname=myname(mark)
//this key word added to access the instance variable (string myname)
//Use this keyword when you need to refer to the instance variable inside a method.

//Feature                               With this Keyword                         Without this Keyword
//----------------------------------------------------------------------------------------------------------------------
//Variable updated:                      Instance variable is updated             Only local variable is affected

//Instance variable myname after method:     Stores "mark"                            Stays null

//Output:                                    Hello \n mark                              Hello \n null