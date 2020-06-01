package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {

	ConcurrentLinkedQueue<Task> taskQueue;
	Thread[] threadArray;

	public ThreadPool(int t) {
		threadArray = new Thread[t];
		
		taskQueue = new ConcurrentLinkedQueue<Task>();
		
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new Thread(new Worker(taskQueue));
		}
		
	}

	public void addTask(Task t) {
		taskQueue.add(t);
	}

	public void start() {

		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();

			try {
				threadArray[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
