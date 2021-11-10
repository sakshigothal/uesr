package sakshigothal;

public class StaticExample {
	int x=1;// normal variable
	static int y=1; //static variable // static is use to save memory or memory management
	StaticExample(){// default
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		x++;
		y++;
	}
	public void add() { // normal method
		System.out.println("hello");
	}
	public static void test() {
		System.out.println("inside test method"); // static method
	}
public static void main(String[] args) {
	StaticExample s= new StaticExample();
	StaticExample s1= new StaticExample();
	StaticExample s2= new StaticExample();
	StaticExample s3= new StaticExample();
	s.test(); // with class object
	test(); // using method name
	StaticExample.test(); // using class_name.method_name
	s.add();
}

}
