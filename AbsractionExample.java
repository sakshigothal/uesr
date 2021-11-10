package sakshigothal;
abstract class bank {
	abstract public int intrest();
}
class icici extends bank{

	@Override
	public int intrest() {
		// TODO Auto-generated method stub
		return 12;
	}
	
}
class sbi extends bank{

	@Override
	public int intrest() {
		// TODO Auto-generated method stub
		return 18;
	}
	
}
class bob extends bank{

	@Override
	public int intrest() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}
public class AbsractionExample {
	public static void main(String[] args) {
		bob b=new bob();
		System.out.println(b.intrest());
		icici i=new icici();
		System.out.println(i.intrest());
		sbi s=new sbi();
		System.out.println(s.intrest());
	}

}
