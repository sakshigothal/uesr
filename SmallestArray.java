package sakshigothal;

public class SmallestArray {
public static void main(String[] args) {
	int arr[]= {1,24,3,4,5};
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		if(temp<arr[i]) {
			temp=arr[i];
		}
	}
	System.out.println(temp);
	
	int count=arr[0];
	for(int j=1;j<arr.length;j++) {
		if(count>arr[j]) {
			count=arr[j];
		}
	}
	System.out.println(count);
}

}
