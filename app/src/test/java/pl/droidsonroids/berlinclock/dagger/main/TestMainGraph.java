package pl.droidsonroids.berlinclock.dagger.main;

import dagger.Component;
import pl.droidsonroids.berlinclock.dagger.ActivityScope;
import pl.droidsonroids.berlinclock.dagger.AppGraph;
import pl.droidsonroids.berlinclock.dagger.TestAppGraph;

@ActivityScope
@Component(modules = TestMainModule.class, dependencies = TestAppGraph.class)
public interface TestMainGraph extends MainGraph {

	final class Initializer {
		public static TestMainGraph init(AppGraph testAppGraph) {
			return DaggerTestMainGraph.builder()
					.testMainModule(new TestMainModule())
					.testAppGraph((TestAppGraph) testAppGraph)
					.build();
		}
	}
}
