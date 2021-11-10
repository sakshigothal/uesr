package sakshigothal;

public class LocalGlobalVariable {
	int y=12; // global variable
	public int add() {
		int x=19; // local variable
		System.out.println(x);
		return 1;
	}
	public void test() {
		System.out.println(y);
	}
public static void main(String[] args) {
	LocalGlobalVariable l=new LocalGlobalVariable();
	l.add();
	l.test();
}

}
