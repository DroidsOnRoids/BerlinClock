package pl.droidsonroids.berlinclock.dagger;

import javax.inject.Singleton;

import dagger.Component;
import pl.droidsonroids.berlinclock.BerlinClockApplication;
import pl.droidsonroids.berlinclock.model.BerlinClock;

@Singleton
@Component(modules = AppModule.class)
public interface AppGraph {

	void inject(BerlinClockApplication berlinClockApplication);

	BerlinClock getBerlinClock();

	final class Initializer {
		public static AppGraph init(BerlinClockApplication berlinClockApplication) {
			AppGraph appGraph = DaggerAppGraph.builder().build();
			appGraph.inject(berlinClockApplication);
			return appGraph;
		}
	}

}
