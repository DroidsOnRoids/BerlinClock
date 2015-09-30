package pl.droidsonroids.berlinclock;

import android.app.Application;

import pl.droidsonroids.berlinclock.dagger.AppGraph;
import pl.droidsonroids.berlinclock.dagger.main.MainGraph;
import pl.droidsonroids.berlinclock.ui.MainView;

public class BerlinClockApplication extends Application {
	private static BerlinClockApplication sInstance;
	protected AppGraph appGraph;

	@Override
	public void onCreate() {
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
