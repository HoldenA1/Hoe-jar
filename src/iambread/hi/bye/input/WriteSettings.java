package iambread.hi.bye.input;

import java.util.Formatter;
import iambread.hi.bye.display.*;

public class WriteSettings {
	
	public static void writeSettings() {
		Formatter x = null;
		try {
			x = new Formatter(Display.settings);
		} catch (Exception e) {
			e.printStackTrace();
		}
		x.format("%s", LoadSettings.filechosen);
		x.close();
	}

}
