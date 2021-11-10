package sakshigothal;

class methodoverride{
	public void test() {
		System.out.println("inside parent class");
	}
}

public class MethodOverridingExample extends methodoverride {
	public void test() {
		System.out.println("inside sub class");
	}
	public static void main(String[] args) {
		MethodOverridingExample m=new MethodOverridingExample();
		m.test();

}
}