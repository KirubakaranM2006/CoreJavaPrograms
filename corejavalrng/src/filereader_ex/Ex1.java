
//Filereaderdemo notepad format we should write data in location of our project
package filereader_ex;


import java.io.FileReader;
public class Ex1 {

	public static void main(String[] args) {
		try {
			FileReader fr= new FileReader("Filereaderdemo.txt");
			int c=fr.read();
			while(c!=-1) {
				System.out.print((char)c);//typecasting becoz while reading the file ->print(c)-o/p 104 char(c)->hey refer note for better understanding
				c=fr.read();//given only print to display in line format
			}
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
