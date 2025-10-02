//see note for full ex[planation 
//here o/p show as 0 but actually it has to show 50(wait for this concept)
package joinmethod_thread;

class A extends Thread{
	int j=0;
	
	public void run() {
		int j=50;
	}
	
	
}
public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Main thread Starts");
		A a1=new A();
		a1.start();
		try {
			System.out.println("Main thread waiting for child thread to finish...");
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a1.j);
		System.out.println("Main thread continues after child thread is done");
	    System.out.println("Main thread finished");
		
	
		
		

	}

}
