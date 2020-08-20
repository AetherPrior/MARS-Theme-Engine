package themeengine;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.util.SystemInfo;

public final class ThemeEngine {

	private ThemeEngine() {}

	public static void setup() {
		FlatDarkLaf.install();
		if (SystemInfo.isMacOS && System.getProperty("apple.laf.useScreenMenuBar") == null) {
			System.setProperty("apple.laf.useScreenMenuBar", "true");
		}
		DemoPrefs.init("mars/themeengine");
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
	}
}