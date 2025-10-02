package finaldemo;

public class Finalkeyword {
	final int weekdays=7;//once setted as final cannot be changed

	public static void main(String[] args) {
		Finalkeyword k1=new Finalkeyword();
		
		System.out.println(k1.weekdays);
		

	}

}
//once the variable is setted as final in next step value cannot be changed
//example in normal assigning int a=10; int a=20; print(a)->output 20
//in final->final int a=10; int a=20; print(a)->output :error(because value cant able to change in final keyword
//for example:(they are standard like weekdays which is 7 no one could change it)