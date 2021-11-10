package sakshigothal;

import java.util.Scanner;

public class Homework4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	System.out.println("enter your namber:");
	int num=sc.nextInt();
	while(num!=0) {
		sum=sum+num%10;//0+56%10=6 //6+5%10=0
		num=num/10;//56/10=5
	}
	System.out.println(sum);
	
	/*String s[]= {"Virat","Suresh","Dhoni","A B","_"};
	int temp=s[0].length();
	String low="";
	for(int i=0;i<s.length;i++) {
		if(temp>s[i].length()) {
			temp=s[i].length();
			low=s[i];
		}
	}
	System.out.println(temp + " " +low);*/

	
	}
}