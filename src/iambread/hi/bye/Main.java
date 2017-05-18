package iambread.hi.bye;

import java.awt.event.*;
import javax.swing.*;
import iambread.hi.bye.display.*;
import iambread.hi.bye.input.*;

public class Main {
	
	static final int width = 455;
	static final int height = 750;
	static String newstr;
	public static ImageIcon g = Textures.loadImage("/faces/icon.png");
	
	public static void exitProcedure(Display d) {	        	
		SaveNames.saveNames();
	    WriteSettings.writeSettings();
	    d.dispose();
	    System.exit(0);
	}

	public static void main(String[] args) {
		CreateFiles.createFiles();
		LoadSettings.loadSettings();
		LoadData.loadData();
		Display display = new Display("Hoe.jar");
		
		display.setSize(width, height);
		display.setIconImage(g.getImage());
		display.setLocationRelativeTo(null);
		display.setVisible(true);
		display.setResizable(false);
		LoadData.errorWindow();
		display.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    display.addWindowListener(new WindowAdapter() {
	        @Override
	        public void windowClosing(WindowEvent event) {
	            exitProcedure(display);
	        }
	    });
	}
}
