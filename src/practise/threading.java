package practise;

public class threading implements Runnable {

	int threadnumb;

	public threading(int threadnumb) {
		super();
		this.threadnumb = threadnumb;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int i = 0;
		Thread[] threads = new Thread[10];

		for (i = 0; i < 10; i++) {
			Thread t = new Thread(new threading(i));
			threads[i] = t;
			System.out.println("ID of thread is" + t.getId());

			t.start();
		}
		for (i = 0; i < 10; i++) {
			Thread t = threads[i];
			t.join();
		}

		System.out.println("Thread from main method");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("threading starts from" + threadnumb + "thread");

	}

}
