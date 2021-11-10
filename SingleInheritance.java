package sakshigothal;

class parent{
	int x=1;// local variable
	public void add() {
		int y=2;//global variable
		System.out.println("inside parent class");
	}
}

public class SingleInheritance extends parent{
	public static void main(String[] args) {
		SingleInheritance s=new SingleInheritance();
		s.add();
		System.out.println(s.x);
	}

}
