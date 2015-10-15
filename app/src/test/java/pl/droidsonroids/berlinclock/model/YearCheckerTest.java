package pl.droidsonroids.berlinclock.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by koral on 15.10.15.
 */
@RunWith(MockitoJUnitRunner.class)
public class YearCheckerTest {

	@Spy
	YearChecker yearChecker;

	@Test
	public void testIsCurrentYearLeap() throws Exception {
		final Calendar calendar = new GregorianCalendar();
		calendar.set(Calendar.YEAR, 2000);

		when(yearChecker.getCalendar()).thenReturn(calendar);

		assertThat(yearChecker.isCurrentYearLeap()).isTrue();
	}
}