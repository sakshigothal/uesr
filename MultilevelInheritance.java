package sakshigothal;
class parent1{
	public void add() {
		System.out.println("inside parent 1 class");
	}
}

class parent2 extends parent1{
	public void test() {
		System.out.println("inside parent 2 class");
	}
}

public class MultilevelInheritance extends parent2 {
	public static void main(String[] args) {
		MultilevelInheritance m=new MultilevelInheritance();
		m.add();
		m.test();
	}

}
