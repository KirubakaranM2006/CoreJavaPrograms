//see protected_access_modifier1 which can be used to access;
package protected_access_modifier2;

import protected_access_modifier1.Animal;

public class Cat extends Animal{
	void w() {
		System.out.println("HII THUS ACCESESSED FROM ANIMAL CLASS USING PROTECTED:");
	}
	
	

	public static void main(String[] args) {
		Cat t=new Cat();
		System.out.println(t.name);//accessing protected variable from animal class
		t.display();//accessinf from animal aclass which is from other package
		t.w();//accessing from cat class's w->w methods/functions
		
	}

}
