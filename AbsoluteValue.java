package sakshigothal;

import java.util.Scanner;

public class AbsoluteValue {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any positive or negative value: ");
	int i=sc.nextInt();
	System.out.println("Absolute value: "+Math.abs(i));
}

}
