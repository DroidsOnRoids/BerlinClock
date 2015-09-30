package pl.droidsonroids.berlinclock.dagger;

import javax.inject.Singleton;

import dagger.Component;
import pl.droidsonroids.berlinclock.BerlinClockApplication;

@Singleton
@Component(modules = TestAppModule.class)
public interface TestAppGraph extends AppGraph {

	final class Initializer {
		public static TestAppGraph init(BerlinClockApplication application) {
			TestAppGraph appGraph = DaggerTestAppGraph.builder().build();
			appGraph.inject(application);
			return appGraph;
		}
	}
}
