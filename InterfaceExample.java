package sakshigothal;

interface interface1{
	void add();
	void test();
}

public class InterfaceExample implements interface1{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("inside add");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("inside test");
	}
	public static void main(String[] args) {
		InterfaceExample i=new InterfaceExample();
		i.add();
		i.test();
	}
}
