package sakshigothal;
import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter your name:");
	String name=sc.nextLine();
	System.out.println("enter your roll no:");
	int roll=sc.nextInt();
	System.out.println("enter alphabet");
	char c=sc.next().charAt(0);
	System.out.println("hello " + name + " " + roll + " " + c);
	}
}
