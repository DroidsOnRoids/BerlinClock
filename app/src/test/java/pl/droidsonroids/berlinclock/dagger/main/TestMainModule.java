package pl.droidsonroids.berlinclock.dagger.main;

import dagger.Module;
import dagger.Provides;
import pl.droidsonroids.berlinclock.model.BerlinClock;
import pl.droidsonroids.berlinclock.ui.MainPresenter;
import pl.droidsonroids.berlinclock.ui.MainPresenterImpl;
import pl.droidsonroids.berlinclock.ui.MainView;

import static org.mockito.Mockito.mock;

@Module
public class TestMainModule {

	@Provides
	MainView provideMainView() {
		return mock(MainView.class);
	}

	@Provides
	MainPresenter provideMainPresenter(BerlinClock berlinClock) {
		return mock(MainPresenterImpl.class);
	}
}
