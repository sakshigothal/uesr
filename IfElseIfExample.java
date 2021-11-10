package sakshigothal;

public class IfElseIfExample {
	public static void main(String[] args) {
		/*int a=10;
		int b=11;
		int c=9;
		if(a>b || a>c) {
			System.out.println("a is greater");
		}
		else if(b>a || b>c) {
			System.out.println("b is greater");
		}
		else if(c>a || c>b) {
			System.out.println("c is greater");
		}
		else {
			System.out.println("all are equal");
		}*/
		
		int a=10;
		int b=11;
		int c=11;
		if(a==b && b==c && c==a) {
			System.out.println("all are equal");
		}
		else if(a!=b || a==c) {
			System.out.println("a is equal to c");
		}
		else if(a!=b && b!=c && c!=a) {
			System.out.println("all are different");
		}
		else if(a!=b) {
			System.out.println("a is not equal to b");
		}
		else if(a!=c) {
			System.out.println("a is not equal to c");
		}
		else {
			System.out.println("invalid");
		}
	}

}
