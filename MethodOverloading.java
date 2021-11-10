package sakshigothal;

public class MethodOverloading {
	public int add() {
		return 1;
	}
	public int add(int x) {
		return 1;
	}
	public int add(int x,String abc) {
		return x; // je return karto tech op made yet jar return 1 kel ki op made 1 ch yet aani x kel ki aapn bracket made taklel yet
	}
	public String add(String name) {
		return name;
	}
public static void main(String[] args) {
	MethodOverloading m=new MethodOverloading();
	System.out.println(m.add());
	System.out.println(m.add(3));
	System.out.println(m.add("sakshi"));
	System.out.println(m.add(2,"sakshi"));
}
}
