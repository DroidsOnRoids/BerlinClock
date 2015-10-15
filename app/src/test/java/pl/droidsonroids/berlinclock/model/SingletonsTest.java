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
		Runnable worker = new Runnable() {
			@Override
			public void run() {
				LazyFakeSingleton.geInstance();
			}
		};
		new Thread(worker).start();
		new Thread(worker).start();
	}
}
