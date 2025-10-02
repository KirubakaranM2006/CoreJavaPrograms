package hierchicalInheritance;


	public class truck extends vehicle{
		int loadcapacity;
		@Override
		void startEngine() {
			System.out.println("Truck engines starts");
			
		}
		void haul() {
			System.out.println("Truck is hauling");
		}
		

}
