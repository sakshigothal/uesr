package sakshigothal;

public class pattern {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	
	System.out.println("------------------------");
	
	for(int a=4;a>=1;a--) {
		for(int b=1;b<=a;b++) {
			System.out.print("*" + " ");
		}
		System.out.println();
	}
}

}
