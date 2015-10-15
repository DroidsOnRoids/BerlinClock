package pl.droidsonroids.berlinclock.model;

import java.util.Date;

/**
 * Created by koral on 15.10.15.
 */
public final class TestLogPrinter {
	public static void println(String message) {
		System.out.printf("%s %s\n", new Date(), message);
	}
}
