package sakshigothal;

public class SumOfDigitExample {
public static void main(String[] args) {
	int x=193;
	int sum=0;
	while(x!=0) {
		sum=sum+x%10;//0+193%10=3//3+19%10=3+9=12 //12+1%10=13
		x=x/10; //193/10=19 //19/10=1  //0
	}
	System.out.println(sum);
}

}
