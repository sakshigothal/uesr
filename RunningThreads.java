package sakshigothal;

public class RunningThreads extends Thread {
	public void run() {
		System.out.println("thread running:");
		System.out.println("yes i am");
			try {
				Thread.sleep(700);
			}
			catch(InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
	}
public static void main(String[] args)  {
	RunningThreads rt=new RunningThreads();
	RunningThreads rt2=new RunningThreads();
	RunningThreads rt3=new RunningThreads();
	RunningThreads rt4=new RunningThreads();
	rt.run();
	rt2.run();
	rt3.run();
	rt4.run();
}
}
