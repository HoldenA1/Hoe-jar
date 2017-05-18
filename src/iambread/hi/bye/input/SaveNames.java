package iambread.hi.bye.input;

import java.io.File;
import java.util.Formatter;
import iambread.hi.bye.display.*;

public class SaveNames {
	
	public static void saveNames() {
		File dataFile = new File(Display.filename[LoadSettings.filechosen] + ".txt");
		Formatter x = null;
		try {
			x = new Formatter(dataFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(String t : Display.hashbrowns) {
			x.format("%s\n", t);
		}
		x.close();
		Display.hashbrowns = null;
		Display.temp = null;
		Display.peeple = null;
		Display.numbers = null;
	}

}
