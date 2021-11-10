package sakshigothal;

public class homework {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			System.out.println("table of " + i);
			for(int j=1;j<=10;j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println("**************");
		}
		
		for(int a=1;a<=4;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
			
		}
		for(int x=4;x>=1;x--) {
			for(int y=1;y<=x;y++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
		
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		for( int c=0;c<arr.length;c++) {
			sum=sum+arr[c];
			System.out.println(arr[c]);
		}
		System.out.println(sum);

}
}
