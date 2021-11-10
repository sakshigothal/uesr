package sakshigothal;

public class array {
public static void main(String[] args) {
	int arr[]= {109,90,756,200,150};
	int sum=0;
	System.out.println(arr[0]);
	System.out.println(arr.length);
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		System.out.println(arr[i]);
	}
	System.out.println("sum="+sum);
}

}
