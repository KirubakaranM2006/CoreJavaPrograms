//example for final class
package finaldemo;

final class ClassA {
	 void name() {
			System.out.println("welcome");
			
		}
	//cannot able to inherit the super class(class B) as ->(class B extends A{}) becoz of (Final class)
		public static void main(String[] args) {
			ClassA a=new ClassA();
			a.name();
		}

}
//if we edit this it will show error as -> as class type already defined->so do properly