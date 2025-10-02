package thread_samples;


class book{
	void updatedb() {
		for(int i=1;i<=5;i++) {
			System.out.println("Updating db");
			try {
				Thread.sleep(8000);//this sts is used to print the sts to print in 8sec(it is denotd in millisec)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Num{
	void print () {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
public class Mainthread {

	public static void main(String[] args) {//main is also a thread
		book book=new book();
		Num no=new Num();
		
		book.updatedb();
		no.print();
		

	}
}

