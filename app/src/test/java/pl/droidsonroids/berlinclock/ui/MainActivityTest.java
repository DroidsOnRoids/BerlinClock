package pl.droidsonroids.berlinclock.ui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import pl.droidsonroids.berlinclock.BuildConfig;
import pl.droidsonroids.berlinclock.TestBerlinClockApplication;

import static org.mockito.Mockito.verify;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, application = TestBerlinClockApplication.class)
public class MainActivityTest {

	@Test
	public void testSetView() throws Exception {
		MainActivity activity = Robolectric.setupActivity(MainActivity.class);
		verify(activity.presenter).setView(activity);
	}

	@Test
	public void testClearView() throws Exception {
		MainActivity activity = Robolectric.buildActivity(MainActivity.class).setup().stop().get();
		verify(activity.presenter).clearView();
	}
}