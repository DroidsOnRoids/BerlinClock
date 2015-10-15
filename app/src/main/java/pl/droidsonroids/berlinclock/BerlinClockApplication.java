package pl.droidsonroids.berlinclock;

import android.app.Application;
import android.os.StrictMode;

import pl.droidsonroids.berlinclock.dagger.AppGraph;
import pl.droidsonroids.berlinclock.dagger.main.MainGraph;
import pl.droidsonroids.berlinclock.model.BerlinClock;
import pl.droidsonroids.berlinclock.ui.MainView;

public class BerlinClockApplication extends Application {
	private static BerlinClockApplication sInstance;
	protected AppGraph appGraph;

	@Override
	public void onCreate() {
		StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().setClassInstanceLimit(BerlinClock.class, 1).penaltyLog().penaltyDeath().build());
		super.onCreate();
		sInstance = this;
		appGraph = AppGraph.Initializer.init(this);
	}

	public static BerlinClockApplication getInstance() {
		return sInstance;
	}

	public MainGraph getMainGraph(MainView view) {
		return MainGraph.Initializer.init(appGraph, view);
	}

}
