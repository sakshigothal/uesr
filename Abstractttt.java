package sakshigothal;
abstract class perent{
	 void message(){
		 System.out.println("This is main class");
	 }
}
class child1 extends perent {
	void message() {
		System.out.println("This is first subclass");
	}
}
class child2 extends perent {
	 void message() {
		System.out.println("This is second subclass");
	}
}
public class Abstractttt extends perent{
public static void main(String[] args) {
	Abstractttt a=new Abstractttt();
	a.message();
	child1 c=new child1();
	c.message();
	child2 cc=new child2();
	cc.message();
}
}
