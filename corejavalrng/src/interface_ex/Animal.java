package interface_ex;

interface Animal {
	int mark=20;//defaultly inside the interface the instance variable is (public static "final" ) which cannot be changed becoz it is fianl
	
	void sound();//defualtly inside the interface any method is declared -> abtract method 

	class cat implements Animal{
		@Override
		public void sound() {
			System.out.println("Meow");
			
		}
		
	}
	public static void main(String[] args) {
		cat c1=new cat();
		c1.sound();//call th overrided in cats class
		System.out.println(c1.mark);//
		
		

	}

}
//see note if not understand
//we can use static methods abd defualt methods
