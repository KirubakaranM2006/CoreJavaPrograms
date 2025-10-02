package filehandlingconcept;
import java.io.FileWriter;
public class Filewrite1ex {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("output.txt");//used try catch becoz the opened file may or maynot cause error or exception to handle that we use try catch
			fw.write("man\t");
			fw.append("hey");
			fw.close();
			System.out.println("Written to a file successfully");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Something has happended!");
			
		}
		

	}

}
