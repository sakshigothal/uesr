package sakshigothal;


public class ConstructorEx {
	int id;// global variable
	String n;
	ConstructorEx(int x,String name){// parameterised con
		id=x;
		n=name;
		System.out.println(id + " " + n); // using global variable
		//System.out.println(x + " " +name); // using parameter
	}
public static void main(String[] args) {
	ConstructorEx c1=new ConstructorEx(1,"virat");
	ConstructorEx c2=new ConstructorEx(2,"suresh");
	ConstructorEx c3=new ConstructorEx(3,"raina");
}

}
