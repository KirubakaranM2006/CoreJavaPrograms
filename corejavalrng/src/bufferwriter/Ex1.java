package bufferwriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Ex1 {

	public static void main(String[] args) {
		try {
		FileWriter fw=new FileWriter("welcome.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hiiiii");
		bw.newLine();
		bw.write("Welcome");
		bw.close();//very important becoz not wriiten o/p not shown
		System.out.println("Successfully runned");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
//difference b/w filewriter and buffer reader is that filewriter read character by character
//while bufferedwriter writes whole character 
//after using it operation when in filewriter->fw.close when in bufferedwriter->bw.close