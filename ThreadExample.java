package sakshigothal;

public class ThreadExample extends Thread {
	public void run() {
		System.out.println("thread running:");
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
			System.out.println(i);
		}
	}
public static void main(String[] args) {
	ThreadExample t=new ThreadExample(); // new method
	ThreadExample t1=new ThreadExample();
	ThreadExample t2=new ThreadExample();
	t.start();
	try { // for separating thread running
		t.join(); // wait 
	}
	catch(InterruptedException e) {
		
	}
	t1.start();
	t2.start();
	t.run();
}
}