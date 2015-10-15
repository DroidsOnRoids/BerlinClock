package pl.droidsonroids.berlinclock.model;

public class DoubleCheckedLockingSingleton {
	private DoubleCheckedLockingSingleton() {
	}

	private static DoubleCheckedLockingSingleton sInstance;

	public static DoubleCheckedLockingSingleton geInstance() {
		if (sInstance == null) {

			synchronized (DoubleCheckedLockingSingleton.class) {
				if (sInstance == null) {
					sInstance = new DoubleCheckedLockingSingleton();
				}

			}
		}
		return sInstance;
	}
}
