package sakshigothal;
import java.util.Scanner;
public class Username {
	String firstname,lastname,mobileno;
	//static String password;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your first name: ");
	String firstname=sc.next();
	System.out.println(firstname.length());
	System.out.println("Enter your last name: ");
	String lastname=sc.next();
	System.out.println("Enter mobile no:");
	String mobileno=sc.next();
	System.out.println("password: "+firstname.substring(0,3)+mobileno.substring(0,3)+lastname.substring(lastname.length()-3));
//	for(int i=1;i<=3;i++) {
//		System.out.println("Enter your mobile number: ");
//		String mobileno=sc.next();
//		if(mobileno.length()<=10) {
//			break;		}
//		else {
//			System.out.println("please enter valid number!!!!!!!");
//		}
//	}
//	for(int i=1;i<=3;i++) {
//		System.out.println("creat password first name of starting 3 char,starting 3 digit of mobile number and last 3 end char of lastname: ");
//		String password=sc.next(); 
//		if(password.length()<=9) {
//			System.out.println("your password save succesfully!!!!!!!!");
//			break;
//		}
//		else {
//			System.out.println("please enter valid password!!!!!!!!!!!!!!!!!!!!!!"); 
//			}
//		}
}
}
