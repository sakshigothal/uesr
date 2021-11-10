package sakshigothal;

public class StringPalindrom {
public static void main(String[] args) {
	String s="sas";
	int i=0;
	int j=s.length()-1;//3
	boolean flag=true;
	while(i<j) { //0<3 //1<2 //2<1
		if(s.charAt(i)!=s.charAt(j)) {
			flag = false;
			break;
		}
		i++;
		j--;
	}
	if(flag) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}

}
