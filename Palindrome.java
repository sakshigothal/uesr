package sakshigothal;

public class Palindrome {
public static void main(String[] args) {
	int x=1991;
	int reverse =0;
	int temp=0;
	int og=x;
	while(x!=0) {
		temp=x%10;//192%1=1 //19%10=9//1
		reverse=reverse*10+temp;//0*10+1=1 //1*10+9=10+9=19 //19*10+1=191
		x=x/10;//191/10=19 //19/10=1 //0
	}
	if(og==reverse) {
		System.out.println("it is palindrom");
	}
	else {
		System.out.println("it is not palindrom");
	}
}
}
