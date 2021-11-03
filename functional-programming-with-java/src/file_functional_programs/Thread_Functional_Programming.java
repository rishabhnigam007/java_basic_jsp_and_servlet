package file_functional_programs;

public class Thread_Functional_Programming {

	public static void main(String[] args) {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getId() + " : " + i);
				}
			}
		};

		// USing Functional interface
		Runnable r1 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getId() + " : " + i);
			}
		};

		Thread t1 = new Thread(r);
		t1.run();

		Thread t2 = new Thread(r);
		t2.run();

		Thread t3 = new Thread(r);
		t3.run();
		
		Thread t4 = new Thread(r1);
		t4.run();

	}

}
