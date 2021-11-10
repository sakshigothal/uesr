package sakshigothal;

public class ConstructorExample {
	// syntax: access modifirs classname()
	// constructor is a special method 
	ConstructorExample(){
		System.out.println("inside constructor");
	}
	ConstructorExample(int x){
		System.out.println("inside constructor 1");
	}
	ConstructorExample(String x){
		System.out.println("inside constructor 2");
	}
public static void main(String[] args) {
	ConstructorExample c= new ConstructorExample();
	ConstructorExample c1= new ConstructorExample();
	ConstructorExample c2 = new ConstructorExample(12);
	ConstructorExample c3= new ConstructorExample("sakshi");
}

}
