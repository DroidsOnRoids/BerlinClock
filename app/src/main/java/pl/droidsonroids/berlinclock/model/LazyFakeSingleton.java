package pl.droidsonroids.berlinclock.model;

public class LazyFakeSingleton {
	public static final String TAG = LazyFakeSingleton.class.getSimpleName();

	private LazyFakeSingleton() {
		TestLogPrinter.println(TAG + " created in " + Thread.currentThread());
	}

	private static LazyFakeSingleton sInstance;

	public static LazyFakeSingleton geInstance() {
		if (sInstance == null) {
			try {
				Thread.yield();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sInstance = new LazyFakeSingleton();
		}
		return sInstance;
	}
}
