package pl.droidsonroids.berlinclock;

import pl.droidsonroids.berlinclock.dagger.TestAppGraph;
import pl.droidsonroids.berlinclock.dagger.main.MainGraph;
import pl.droidsonroids.berlinclock.dagger.main.TestMainGraph;
import pl.droidsonroids.berlinclock.ui.MainView;

public class TestBerlinClockApplication extends BerlinClockApplication {

	@Override
	public void onCreate() {
		super.onCreate();
		appGraph = TestAppGraph.Initializer.init(this);
	}

	@Override
	public MainGraph getMainGraph(MainView view) {
		return TestMainGraph.Initializer.init(appGraph);
	}

}
