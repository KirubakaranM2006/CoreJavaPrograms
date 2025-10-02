package superkeyword;
class person{
	String name;
	person(String name){
		this.name=name;//this.name(instance variable)=xyz(name)
		System.out.println(name);//o/p->xyz
	}
}
class employee extends person
{
	employee(String name){//step2->(constructor)->accepting value from obj
		super(name);//step3 sending value to person becoz of the use of super keyword,which can access super class
	}
}
public class Zclass {
	

	public static void main(String[] args) {
		employee e=new employee("xyz");//step 1//pass value to employee
		

	}

}
