package sakshigothal;

public class LowestString {
public static void main(String[] args) {
	String arr[]= {"Virat","Suresh","Dhoni","A b"};
	int temp=arr[0].length();
	String low="";
	for(int i=0;i<arr.length;i++) {
		if(temp>arr[i].length()) {
			temp=arr[i].length();
			low=arr[i];
		}
	}
	System.out.println(temp + " " + low);
}

}
