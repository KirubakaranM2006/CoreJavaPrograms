package bufferedreader123;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class Mainclass {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Filewriterexample.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Hii Hello");
			bw.newLine();
			bw.write("Welcome");
			bw.close();//flushes or sends all data to the file and delete the buffermemory
			System.out.println("Writtens succesfully");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Something has happened!");
		}
	

	}

}


//buffer and file writer does same work slight difference is that fw takes 1 by 1 characters and sends to file
//while bw takes hole character (but it is temporary memory)
//because when you give bw.flush() or bw.close() all data sends to the file immediately and deleted the temporily stored one 
//if doesnt understand refer java note