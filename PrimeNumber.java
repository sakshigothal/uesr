package sakshigothal;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any no:");
	int x=sc.nextInt();
	boolean flag=false;
	if(x==0 || x==1) {
		System.out.println("neither prime or composite");
	}
	else {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(x + " composite");
		}
		else {
			System.out.println(x + " prime");
		}
	}
	}

}
