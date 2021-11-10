package sakshigothal;

public class HighestStringExample {
public static void main(String[] args) {
	String s[]= {"Virat","Suresh","Dhoni","A B"};
	int temp=0;
	String high="";
	for(int i=0;i<s.length;i++) {
		if(temp<s[i].length()) {
			temp=s[i].length();
			high=s[i];
		}
	}
	System.out.println(s[3].length());
	System.out.println(temp + " " + high);
	
	
	}

}
