package sakshigothal;

public class homework2 {
public static void main(String[] args) {
	for(int i=1;i<=30;i++) {
		if(i%2==0) {
			System.out.println(i + " even");
		}
		else {
			System.out.println(i + " odd");
		}
	}
	
	int sum=0;
	for(int a=1;a<=10;a++) {
		sum+=a;
	}
	System.out.println("sum= " + sum);
	
	int m=3;
	String months="";
	switch(m) {
	case 1:
		months="Jan";
		break;
	case 2:
		months="Feb";
		break;
	case 3:
		months="Mar";
		break;
	case 4:
		months="Apr";
		break;
	case 5:
		months="May";
		break;
	case 6:
		months="June";
		break;
	case 7:
		months="July";
		break;
	case 8:
		months="Aug";
		break;
	case 9:
		months="Sep";
		break;
	case 10:
		months="Oct";
		break;
	case 11:
		months="Nov";
		break;
	case 12:
		months="Dec";
		break;
		default:
			System.out.println("invalid");
	}
	System.out.println(months);
	
}

}
