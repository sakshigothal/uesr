package sakshigothal;

public class PositiveNegative {
public static void main(String[] args) {
	System.out.println("**************** positive negative ***************");
	int x=-9;
	if(x<0) {
		System.out.println("number is negative");
	}
	else if(x>0) {
		System.out.println("number is positive");
	}
	else {
		System.out.println("number is zero");
	}
	
	System.out.println("*************** Grading System ****************");
	
	int a=90;
	if(a<=25) {
		System.out.println("fail");
	}
	else if(a>25 && a<=45) {
		System.out.println("E grade");
	}
	else if(a>45 && a<=50) {
		System.out.println("D grade");
	}
	else if(a>50 && a<=60) {
		System.out.println("C grade");
	}
	else if(a>60 && a<=80) {
		System.out.println("B grade");
	}
	else {
		System.out.println("A grade");
	}
}
}
