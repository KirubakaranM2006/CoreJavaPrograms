//example of default methods

package interface_ex;

interface Device {//like class
	void turnon();//abstract method which should be overriden by all subclass
	 
	default void showstatus() {
		System.out.println("Device is working :");
	}
	class Tv implements Device{
		
		@Override
		public void turnon() {
			System.out.println("Tv is turnedon:");
			
			
		}
		
	}
	class fan implements Device{
		@Override
		public void turnon() {
			System.out.println("Fan is turned on:");
			
		}
		
	}

	public static void main(String[] args) {
		Tv mytv=new Tv();
		fan myfan=new fan();
		
		mytv.turnon();
		mytv.showstatus();//calls default method
		
		myfan.turnon();
		myfan.showstatus();//calls defualt method
		
	}

}
