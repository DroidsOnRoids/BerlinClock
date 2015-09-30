package pl.droidsonroids.berlinclock.dagger;

import dagger.Module;
import dagger.Provides;
import pl.droidsonroids.berlinclock.model.BerlinClock;

@Module
public class AppModule {

	@Provides
	public BerlinClock provideBerlinClock() {
		return new BerlinClock();
	}
}
