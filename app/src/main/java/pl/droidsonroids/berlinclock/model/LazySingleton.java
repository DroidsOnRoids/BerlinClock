package pl.droidsonroids.berlinclock.model;

public class LazySingleton {
	public static final String TAG = LazySingleton.class.getSimpleName();

	private LazySingleton() {
		TestLogPrinter.println(TAG + " created");
	}

	private static LazySingleton sInstance;

	public static LazySingleton geInstance() {
		if (sInstance == null) {
			sInstance = new LazySingleton();
		}
		return sInstance;
	}
}
