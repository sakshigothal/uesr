package sakshigothal;

import java.util.Scanner;
//Q1. Write a program to take input from user and check whether it is vowel or not using switch statement.

public class homework3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	/*System.out.println("enter your input:");
	char c=sc.next().charAt(0);
	switch(c){
	case 'a':
		System.out.println("It is vowel");
		break;
	case 'e':
		System.out.println("It is vowel");
		break;
	case 'i':
		System.out.println("It is vowel");
		break;
	case 'o':
		System.out.println("It is vowel");
		break;
	case 'u':
		System.out.println("It is vowel");
		break;
		default:
			System.out.println("It is constant");
			break;
	}*/
	System.out.println("enter your number:");
	int num=sc.nextInt();
	int temp=0;
	int reverse =0;
	int original=num;
	while(num!=0) {
		temp=num%10;//123%10=3 //12%10=2 //1%10=1
		reverse=reverse*10+temp;//0*10+3=3 //3*10+2=32 // 32*10+1=321
		num=num/10;//123/10=12 // 12/10=1 // 1/10=0
	}
	if(reverse==original) {
		System.out.println("It is panlidrome");
	}
	else {
		System.out.println("It is not palindrome");
	}
}
}
