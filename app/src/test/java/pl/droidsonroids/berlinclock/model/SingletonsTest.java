package pl.droidsonroids.berlinclock.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SingletonsTest {

	@Test
	public void testLazySingleton() throws Exception {
		TestLogPrinter.println("test started  " + LazySingleton.TAG);
		Thread.sleep(3000);
		LazySingleton.geInstance();
		TestLogPrinter.println("test finished  " + LazySingleton.TAG);
	}

	@Test
	public void testEagerSingleton() throws Exception {
		TestLogPrinter.println("test started  " + EagerSingleton.TAG);
		Thread.sleep(3000);
		EagerSingleton.geInstance();
		TestLogPrinter.println("test finished  " + EagerSingleton.TAG);
	}

	@Test
	public void testSingletonsEquality() throws Exception {
		final EagerSingleton firstInstance = EagerSingleton.geInstance();
		final EagerSingleton secondInstance = EagerSingleton.geInstance();
		assertThat(firstInstance).isEqualTo(secondInstance);
	}

	@Test
	public void testSingletonFail() throws Exception {
		startConcurrentThreads(lazyWorker);
	}

	@Test
	public void testDoubleCheckedSingleton() throws Exception {
		startConcurrentThreads(doubleCheckedWorker);
	}

	@Test
	public void testLuckyThreadOrder() throws Exception {
		final Thread thread0 = new Thread(lazyWorker);
		thread0.start();
		thread0.join();

		final Thread thread1 = new Thread(lazyWorker);
		thread1.start();

		thread1.join();
	}

	final Runnable lazyWorker = new Runnable() {
		@Override
		public void run() {
			LazySingleton.geInstance();
		}
	};

	final Runnable doubleCheckedWorker = new Runnable() {
		@Override
		public void run() {
			DoubleCheckedLockingLazySingleton.geInstance();
		}
	};

	private void startConcurrentThreads(Runnable lazyWorker) throws InterruptedException {
		final Thread thread0 = new Thread(lazyWorker);
		thread0.start();

		final Thread thread1 = new Thread(lazyWorker);
		thread1.start();

		thread0.join();
		thread1.join();
	}
}
