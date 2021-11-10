package sakshigothal;

public class operator {
public static void main(String[] args) {
	//operators // arithmetic +,-,*,/
	int a=10;
	int b=2;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	
	//compare operator <,>,<=,>=,==,!=
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	System.out.println(a!=b);
	
	// logical && ||
	int c=3;
	System.out.println(a==b && b==c);
	System.out.println(a==b || b==c);
	
	//increment +1 decrement -1(post and pre)
	int x=0;
	System.out.println(x++);// post increment 
	System.out.println(x);
	System.out.println(++x);// pre increment
	
	int y=5;
	System.out.println(y--); // post decrement
	System.out.println(y);
	System.out.println(--y); //pre decrement
	
	int z=9;
	System.out.println(--z);//8
	System.out.println(z++);//8
	System.out.println(++z);//10
	System.out.println(z--);//10
	System.out.println(z);
	
	int m=5;
	m++;
	System.out.println(m);//6
	
	++m;
	System.out.println(m);//7
	
	m--;
	System.out.println(m);//6
	
	--m;
	System.out.println(m);//5 
	
	// adding value
	int n=10;
	n=n+5;//15
	n+=5;//20
	n-=5;//15
	System.out.println(n);
	
	//over write
	int o=19;
	System.out.println(o);
	o=5;
	System.out.println(o);
	
	
}

}
