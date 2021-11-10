package sakshigothal;

class animal{
	void sleep() {
		System.out.println("inside class animal");
	}
}
class dog extends animal{
	void bark() {
		System.out.println("inside class dog");
	}
}
class cat extends animal{
	void meow() {
		System.out.println("inside class cat");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		cat c=new cat();
		c.sleep();
		c.meow();
		dog d=new dog();
		d.sleep();
		d.bark();
	}

}
