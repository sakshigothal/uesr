package sakshigothal;

public class ExceptionHandling {
public static void main(String[] args) {
	
	try {
		System.out.println(7/0);
		}
	catch(ArithmeticException a) {
		System.out.println("hello");
		 System.out.println(a.getLocalizedMessage());
	}
	try {
		String a=null;
		System.out.println(a.length());
	}
	catch(NullPointerException n) {
		System.out.println(n.getLocalizedMessage());
	}
	try {
		int i[]= {1,2,3,4};
		System.out.println(i[5]);
	}
	catch(ArrayIndexOutOfBoundsException i) {
		System.out.println(i.getLocalizedMessage());
	}
	try {
		String abc="Virat";
		int i=Integer.parseInt(abc);
		System.out.println(i);
	}
	catch(NumberFormatException n) {
		System.out.println(n.getLocalizedMessage());
	}
}
}
