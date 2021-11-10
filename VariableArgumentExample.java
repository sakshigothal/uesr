package sakshigothal;

public class VariableArgumentExample {
	int sum=0;
	void add(int ...x) { // variable argument
		System.out.println(x);
		System.out.println(x.length);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		for(int a:x) {
			System.out.println(a);
			sum+=a;
		}
		System.out.println(sum);
	}
	void test(int z,int ...y) { //in two variable variable argument should be last it cannot first value 
		System.out.println(z);
	}
	
	void sub(String ...name) {
		System.out.println(name);
		for(String s:name) {
			System.out.println(name);
		}
	}
public static void main(String[] args) {
	VariableArgumentExample v=new VariableArgumentExample();
	v.add(1,2,3,4,5,6);
	v.test(2, 1,2,3,4,5,6);
}

}
