package iambread.hi.bye.listeners;

import java.io.File;
import java.util.Formatter;
import iambread.hi.bye.input.*;
import iambread.hi.bye.display.*;

public class BoxListener {
	
	public static void boxListener() {
		File dFile = new File(Display.filename[1] + ".txt");
		if (! dFile.exists()) {
			Formatter x = null;
			try {
				x = new Formatter(Display.filename[1] + ".txt");
			} catch (Exception e) {
				e.printStackTrace();
			}
			x.format("%s/%s\n", "Name:colon:for:spaces", "lvl:only:use:lowercase");
			x.close();
		}
		SaveNames.saveNames();
		if (LoadSettings.filechosen == 0) {
			LoadSettings.filechosen = 1;
		} else {
			LoadSettings.filechosen = 0;
		}
	LoadData.loadData();
	}


}
