package sakshigothal;

import java.util.Scanner;

public class IntegerConversion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number: ");
	int i=sc.nextInt();
	//double,float,long,short.
	double d=(double)(i);
	System.out.println("conversion int to double: "+d);
	float f=(float)(i);
	System.out.println("conversion int to float: "+f);
	long l=(long)(i);
	System.out.println("conversion int to long: "+l);
	short s=(short)(i);
	System.out.println("conersion int to short: "+s);
}

}
