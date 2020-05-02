package _04_Thread_Pool;

public class ThreadPool {
	Thread[] a;
	ConcurrentLinkedQueue<Task> b;
	ThreadPool(Thread[] a){
		this.a = a;
	}
}
