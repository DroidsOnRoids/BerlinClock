package pl.droidsonroids.berlinclock.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.droidsonroids.berlinclock.model.BerlinClock;

@Module
public class AppModule {

	@Singleton
	@Provides
	public BerlinClock provideBerlinClock() {
		return new BerlinClock();
	}
}
