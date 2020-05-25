package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable{
	private int value;
	
	public ThreadedGreeter(int i) {
		// TODO Auto-generated constructor stub
		value = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (value < 50) {
			Thread thread = new Thread(new ThreadedGreeter(value+1));
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Hello from thread number: "+ value);
	}

}
