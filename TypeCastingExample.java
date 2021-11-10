package sakshigothal;

public class TypeCastingExample {
public static void main(String[] args) {
	String s="123";
	String s1="22";
	System.out.println(s+s1);
	
	// converting string to int
	int s11=Integer.parseInt(s);
	int s22=Integer.parseInt(s1);
	System.out.println(s11+s22);
	
	//String to other datatype
	String ss="200";
	short sh=Short.parseShort(ss);
	long l=Long.parseLong(ss);
	double d=Double.parseDouble(ss);
	float f=Float.parseFloat(ss);
	System.out.println("short"+sh);
	System.out.println("long"+l);
	System.out.println("double"+d);
	System.out.println("float"+f);
	
	//datatype to string
	String sss="";
	short shh=12;
	int i=2;
	sss=String.valueOf(i);
	System.out.println(sss);
	sss=String.valueOf(shh);
	System.out.println(sss);
	long lg=12567;
	double db=12.6876d;
	float ft=567.9787f;
	sss=String.valueOf(ft);
	System.out.println(sss);
	
	//long,double,float to int
	int ii;
	ii=(int) db;
	ii=(int) ft;
	ii=(int) lg;
	
	//char to int
	ii=(int) 'a';
	System.out.println(ii);
	char c='Y';
	ii=(int) c;
	System.out.println(ii);
	double doubleC=(double) 'M';
	float sf=(float) 'S';
	
	//int to long, double, float
	int ik=100;
	long longg;
	
	//automatic type conversion
	longg=ik;
	float fl=ik;
	double dl=ik;
	
	//string to char
	String sc="Hello";
	char cc=sc.charAt(0);
	char[] c_arr=sc.toCharArray();
	for(int j=0;j<c_arr.length;j++) {
		System.out.println(c_arr[j]);
	}
	
	//char array to string
	char arr[]= {'a','b','c'};
	String scc=new String(arr);
	System.out.println(scc);
}
}
