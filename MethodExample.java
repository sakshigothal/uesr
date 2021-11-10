package sakshigothal;

public class MethodExample {
	//access_modifier return_type method_name(parameter) {// statements}
	public int add()   //creating method without parameter with return type
	{
		System.out.println("inside add method ");
		return 1;
	}
	public String name() {
		System.out.println("inside name method" );
		return "";
	}
	public void test(int x) { // creating method with parameter and without return type
		System.out.println("inside test method");
	}
	public void test(String name) {
		System.out.println("inside test string method" + name);
	}
	public double intrest() {
		double intrest_rate=1000*45/2;
		System.out.println(intrest_rate);
		return intrest_rate;
	}
public static void main(String[] args) {
	MethodExample m=new MethodExample();
	m.add(); //
	m.name();
	m.test(12);
	m.test("sakshi");
	m.intrest();
	//System.out.println(m.intrest());
}
}
