package sakshigothal;

public class FibonacciSeries {
public static void main(String[] args) {

	//me
	/*	int a=0;
	System.out.println(a);
	int b=1;
	System.out.println(b);
	int c=a+b;
	System.out.println(c);
	for(int i=0;i<=10;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);
	}*/
	int a=0;
	int b=1;
	int c=0;
	for(int i=2;i<=10;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		
	}
}
}
