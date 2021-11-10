package sakshigothal;

public class StaticEx {
	int id;// global variable
	String n;
	static String classname="trycatch";
	StaticEx(int x,String name){// parameterized constructor
		id=x;
		n=name;	
	}
	void display() {
		System.out.println(id + " " +n + " " + classname );
	}
public static void main(String[] args) {
	StaticEx s1=new StaticEx(1,"virat");
	StaticEx s2=new StaticEx(2,"suresh");
	StaticEx s3=new StaticEx(3,"raina");
	StaticEx s4=new StaticEx(4,"sakshi");
	s1.display();
	s2.display();
	s3.display();
	s4.display();
}
}