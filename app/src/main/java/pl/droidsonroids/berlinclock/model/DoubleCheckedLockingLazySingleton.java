package pl.droidsonroids.berlinclock.model;

public class DoubleCheckedLockingLazySingleton {
	public static final String TAG = DoubleCheckedLockingLazySingleton.class.getSimpleName();

	private DoubleCheckedLockingLazySingleton() {
		TestLogPrinter.println(TAG + " created in " + Thread.currentThread());
	}

	private static volatile DoubleCheckedLockingLazySingleton sInstance;

	public static DoubleCheckedLockingLazySingleton geInstance() {
		if (sInstance == null) {

			synchronized (DoubleCheckedLockingLazySingleton.class) {
				if (sInstance == null) {
					sInstance = new DoubleCheckedLockingLazySingleton();
				}

			}
		}
		return sInstance;
	}
}
