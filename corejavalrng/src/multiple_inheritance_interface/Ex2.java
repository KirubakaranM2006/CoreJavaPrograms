package multiple_inheritance_interface;


interface readable{//assume like a supperclass
	void read();//abstract method should be overriden in subclass
	
}
interface writable{//assume like a supperclass
	void write();//abstract method should be overriden in subclass
	
}
interface storable{//assume like a supperclass
	void store();//abstract method should be overriden in subclass
	
}
class file implements readable,writable,storable{
	@Override
	public void read() {//overriden from read
		System.out.println("reading");
	
		
	}
	@Override
	public void write() {//overriden from write
		System.out.println("writing");
		
	}
	@Override
	public void store() {//overriden from store
		System.out.println("storing");
		
	}
	
	
}
public class Ex2 {

	public static void main(String[] args) {
		file f=new file();
		f.read();
		f.write();
		f.store();

	}

}
