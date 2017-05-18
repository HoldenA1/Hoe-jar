package iambread.hi.bye.input;

import java.io.*;
import java.util.Formatter;
import iambread.hi.bye.display.*;

public class CreateFiles {
	
	public static void createFiles() {
		String really = Display.userHomeFolder + "/Hoe-jar-res";
		File juan = new File(really);
		File juanita = new File(really + "/peeples.txt");
		File jushwa = new File(really + "/settings.txt");
		if (! juan.exists()) {
			juan.mkdir();
		}
		if (! juanita.exists()) {
			Formatter x = null;
			try {
				x = new Formatter(juanita);
			} catch (Exception e) {
				e.printStackTrace();
			}
			x.format("%s/%s\n", "caroline", "108320750");
			x.format("%s/%s\n", "holden", "-10");
			x.format("%s/%s\n", "ethan", "error");
			x.format("%s/%s\n", "cole", "undefined");
			x.close();
		}
		if (! jushwa.exists()) {
			Formatter x = null;
			try {
				x = new Formatter(jushwa);
			} catch (Exception e) {
				e.printStackTrace();
			}
			x.format("%s", "0");
			x.close();
		}
	}

}
