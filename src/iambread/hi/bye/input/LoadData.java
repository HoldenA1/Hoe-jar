package iambread.hi.bye.input;

import java.io.*;
import java.util.*;
import iambread.hi.bye.display.*;
import javax.swing.JOptionPane;

public class LoadData {
	
	private static boolean exception = false;
	public static Random randoms = new Random();
	
	public static void loadData() {
		Display.fileScanner = null;
		Display.hashbrowns = new HashSet<String>();
		Display.temp = new ArrayList<String>();
		Display.peeple = new ArrayList<String>();
		Display.numbers = new ArrayList<String>();
		Display.mood = new ArrayList<Integer>();
		File dataFile = new File(Display.filename[LoadSettings.filechosen] + ".txt");
		try {
			Display.fileScanner = new Scanner(dataFile);
		} catch (IOException e) {
			LoadSettings.filechosen = 0;
			exception = true;
			loadData();
		}
		while(Display.fileScanner.hasNext()) {
			String b = Display.fileScanner.next();
			Display.hashbrowns.add(b);
			String ff = b.replaceAll(":", " ");
			for (String r : ff.split("/")) {
				Display.temp.add(r);
			}
		}
		for (int w = 0; w < Display.temp.size(); w += 2) {
			Display.peeple.add(Display.temp.get(w));
		}
		for (int w = 1; w < Display.temp.size(); w += 2) {
			Display.numbers.add(Display.temp.get(w));
		}
		for (int w = 0; w < Display.temp.size(); w += 2) {
			Display.mood.add(randoms.nextInt(12));
		}
	}
	
	public static void errorWindow() {
		if (exception == true) {
			JOptionPane.showMessageDialog(null, "Couldn't find custom.txt\nLibrary set to default", "Error", 0);
		}
	}

}
