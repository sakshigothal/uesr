package sakshigothal;

import java.util.Scanner;

public class CapitalizeEachWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string: ");
	String s=sc.next();
	System.out.println("capitalize each word: "+s.toUpperCase());
}

}
