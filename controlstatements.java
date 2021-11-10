package sakshigothal;

public class controlstatements {
public static void main(String[] args) {
	int age=18;
	if(age<=18) {
		System.out.println("it eligible for driving ");
	}
	else {
	System.out.println("not eligible for driving");
	}
	
	int a=10;
	if(a%2==0) {
		System.out.println(a + " divisible by 2");
	}
	else {
		System.out.println(a + " not divisible by 2");
	}
	
	for(int i=1;i<=20;i++) {
		if(i%2==0) {
			System.out.println(i + " even");
		}
		else {
			System.out.println(i + " odd");
		}
	}
}

}
