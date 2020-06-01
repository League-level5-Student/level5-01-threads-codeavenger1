package _04_Thread_Pool;

import java.util.concurrent.*;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;
	
	public Worker(ConcurrentLinkedQueue<Task> taskQueue) {
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		while (taskQueue.isEmpty() == false) {
			Task t = taskQueue.remove();
			t.perform();
		}

	}

}
