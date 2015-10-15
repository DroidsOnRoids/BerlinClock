package pl.droidsonroids.berlinclock.ui;

import android.app.Activity;
import android.os.Bundle;

import pl.droidsonroids.berlinclock.model.DoubleCheckedLockingLazySingleton;

public class EmptyActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DoubleCheckedLockingLazySingleton.geInstance();
	}
}
