package pl.droidsonroids.berlinclock.dagger.main;

import dagger.Module;
import dagger.Provides;
import pl.droidsonroids.berlinclock.model.BerlinClock;
import pl.droidsonroids.berlinclock.ui.MainPresenter;
import pl.droidsonroids.berlinclock.ui.MainPresenterImpl;
import pl.droidsonroids.berlinclock.ui.MainView;

@Module
public class MainModule {

	private final MainView mainView;

	public MainModule(MainView mainView) {
		this.mainView = mainView;
	}

	protected MainModule() {
		mainView = null;
	}

	@Provides
	MainView provideMainView() {
		return mainView;
	}

	@Provides
	MainPresenter provideMainPresenter(BerlinClock berlinClock) {
		return new MainPresenterImpl(berlinClock);
	}
}
