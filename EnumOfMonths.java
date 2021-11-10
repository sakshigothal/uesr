package sakshigothal;
import java.util.Scanner;
public class EnumOfMonths {
	enum months{
		JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);//String mm="";
	System.out.println(months.values());
	System.out.println(months.APRIL);
	System.out.println("enter the number of month:");
	int mm=sc.nextInt();//	for(months m: months.values()) {//		System.out.println(m);//	}
	switch(mm) {
	case 1:
		//mm="JANUARY";
		System.out.println("JANUARY");
		break;
	case 2:
		//mm="FEBRUARY";
		System.out.println("FEBRUARY");
		break;
	case 3:
		//mm="MARCH";
		System.out.println("MARCH");
		break;
	case 4:
		//mm="APRIL";
		System.out.println("APRIL");
		break;
	case 5:
		//mm="MAY";
		System.out.println("MAY");
		break;
	case 6:
		//mm="JUNE";
		System.out.println("JUNE");
		break;
	case 7:
		//mm="JULY";
		System.out.println("JULY");
		break;
	case 8:
		//mm="AUGUST";
		System.out.println("AUGUST");
		break;
	case 9:
		//mm="SEPTEMBER";
		System.out.println("SEPTEMBER");
		break;
	case 10:
		//mm="OCTOBER";
		System.out.println("OCTOBER");
		break;
	case 11:
		//mm="NOVEMBER";
		System.out.println("NOVEMBER");
		break;
	case 12:
		//mm="DECEMBER";
		System.out.println("DECEMBER");
		break;
		default:
			System.out.println("invalid");
	}
	System.out.println(mm);
}
}
