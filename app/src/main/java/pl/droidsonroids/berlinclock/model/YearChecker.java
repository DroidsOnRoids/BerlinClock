package pl.droidsonroids.berlinclock.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class YearChecker {
	private YearChecker() {
	}

	private static final YearChecker sInstance = new YearChecker();

	public static YearChecker getInstance() {
		return sInstance;
	}

	public boolean isCurrentYearLeap() {
		final int year = getCalendar().get(Calendar.YEAR);
		return new GregorianCalendar().isLeapYear(year);
	}

	Calendar getCalendar() {
//		return Calendar.getInstance();
		return new GregorianCalendar();
	}
}
