package pl.droidsonroids.berlinclock.dagger.main;

import dagger.Component;
import pl.droidsonroids.berlinclock.dagger.ActivityScope;
import pl.droidsonroids.berlinclock.dagger.AppGraph;
import pl.droidsonroids.berlinclock.ui.MainActivity;
import pl.droidsonroids.berlinclock.ui.MainView;

@ActivityScope
@Component(modules = MainModule.class, dependencies = AppGraph.class)
public interface MainGraph {

	void inject(MainActivity mainActivity);

	final class Initializer {
		public static MainGraph init(AppGraph appGraph, MainView mainView) {
			return DaggerMainGraph.builder()
					.mainModule(new MainModule(mainView))
					.appGraph(appGraph)
					.build();
		}
	}

}
