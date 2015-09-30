package pl.droidsonroids.berlinclock.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pl.droidsonroids.berlinclock.model.BerlinClock;

import static org.mockito.Mockito.mock;

@Module
public class TestAppModule {

	@Provides
	@Singleton
	public BerlinClock provideBerlinClock() {
		return mock(BerlinClock.class);
	}
}
