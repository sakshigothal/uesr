package sakshigothal;

import java.util.Scanner;

public class CharacterConversion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter character: ");
	char c=sc.next().charAt(0);
	short ss=(short) (c);
	System.out.println("conversion char to short: "+ss);
	long ll=(long)(c);
	System.out.println("conversion char to long: "+ll);
	double db=(double)(c);
	System.out.println("conversion char to double: "+db);
	float ff=(float)(c);
	System.out.println("conversion char to float: "+ff);
}

}
