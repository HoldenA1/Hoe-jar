package iambread.hi.bye.input;

import java.io.IOException;
import java.util.Scanner;
import iambread.hi.bye.display.*;

public class LoadSettings {
	
	public static int filechosen;
	
	public static void loadSettings() {
		Display.fileScanner = null;
		try {
			Display.fileScanner = new Scanner(Display.settings);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(Display.fileScanner.hasNext()) {
			String b = Display.fileScanner.next();
			filechosen = Integer.parseInt(b);
		}
	}

}
