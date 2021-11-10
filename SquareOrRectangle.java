package sakshigothal;
import java.util.Scanner;
public class SquareOrRectangle {
		int length;
		int breath;
		SquareOrRectangle(int l,int b){
			length=l;
			breath=b;
		}
		static void display() {
			System.out.println("Hello user!!!");
		}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enther length:");
	int l=sc.nextInt();
	System.out.println("Enter breath:");
	int b=sc.nextInt();
	if(l==b) {
		display();
		System.out.println("It is Square");
	}
	else {
		display();
		System.out.println("It is Reactangle");
	}
	SquareOrRectangle sr=new SquareOrRectangle(4,2);
	System.out.println("length=" + l + " " + "breath=" + b);

}}