package sakshigothal;

public class ThreadInterfaceExample implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
public static void main(String[] args) {
	ThreadInterfaceExample t=new ThreadInterfaceExample();
	Thread tt=new Thread(t);// t made method ahe te execute karayla
	tt.start();
}
}
