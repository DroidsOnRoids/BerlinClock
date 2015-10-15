package pl.droidsonroids.berlinclock.model;

public class EagerSingleton {
	public static final String TAG = EagerSingleton.class.getSimpleName();

	private EagerSingleton() {
		TestLogPrinter.println(TAG + " created");
	}

	private static final EagerSingleton sInstance = new EagerSingleton();

	public static EagerSingleton geInstance() {
		return sInstance;
	}
}
