package sakshigothal;
final class test{
	
}
//final class cannot be inherited
//final variable cannot be be re-initialized
//final method cannot be override
class test2{
	void add() {
		
	}
	final void test() {
		System.out.println("inside final class");
	}
}
public class FinalKeywordExample extends test2 {
	void add() {
		
	}
public static void main(String[] args) {
	test2 t=new test2();
	t.test();
	int x=10;
	x=12;
	final int y=1;
	//y=2;
	System.out.println(x);
	System.out.println(y);
	
	}
}
