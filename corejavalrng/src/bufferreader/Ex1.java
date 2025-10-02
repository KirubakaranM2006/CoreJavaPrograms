//reader means giving input in notepad
//refer java note if does not understand
package bufferreader;

import java.io.FileReader;
import java.io.BufferedReader;
public class Ex1 {

	public static void main(String[] args) {
		try{
		FileReader fr=new FileReader("exbrdemo.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();//reading the line
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
			
		}
		
		}
		catch(Exception e) {}

	}

}
