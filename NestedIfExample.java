package sakshigothal;

public class NestedIfExample {
public static void main(String[] args) {
	/*int a=12;
	int b=11;
	int c=10;
	if(a==b) {
		if(a==c) {
			System.out.println("all are equals");
		}
		else {
			System.out.println("a is not equal to c");
		}
	}
	else {
		System.out.println("all are difference");
	}*/
	int x=25;
	if(x%5==0) {
		if(x%3==0) {
			System.out.println("divisible by 3 and 5");
		}
		else {
			System.out.println("not divisible 5");
		}
	}
	else {
		System.out.println("not divisible by 3 and 5");
	}
}

}
