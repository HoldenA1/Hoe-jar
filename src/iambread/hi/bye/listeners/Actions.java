package iambread.hi.bye.listeners;

import java.util.*;
import javax.swing.*;
import iambread.hi.bye.display.*;
import iambread.hi.bye.helper.*;

public class Actions {
	
	public static Random random = new Random();
	public static ImageIcon icons = GraphicsDisplay.a;
	public static String new_txt;
	public static String new_sass;
	public static int fff;
	public static int zzzz;
	public static int pp;
	public static int numb;
	public static int maxnumb;
	public static int finalnumb;
	public static int finalnumb2;

	public void onClick(JTextField tf) {
		Display.txt = tf.getText().toString().toLowerCase().trim();
		int fu = random.nextInt(11);
		int fc = random.nextInt(12);
		fff = fc;
		Display.SassFactor = Integer.toString(fu);			
		for(int i = 0; i < Display.peeple.size(); i++) {
			if(Display.txt.equals(Display.peeple.get(i))) {
				Display.SassFactor = Display.numbers.get(i);
				fff = Display.mood.get(i);
			}
		}
		
		if (fff == 0) {
			icons = GraphicsDisplay.a;
		} else if (fff == 1) {
			icons = GraphicsDisplay.b;
		} else if (fff == 2) {
			icons = GraphicsDisplay.c;
		} else if (fff == 3) {
			icons = GraphicsDisplay.d;
		} else if (fff == 4) {
			icons = GraphicsDisplay.e;
		} else if (fff == 5) {
			icons = GraphicsDisplay.f;
		} else if (fff == 6) {
			icons = GraphicsDisplay.g;
		} else if (fff == 7) {
			icons = GraphicsDisplay.h;
		} else if (fff == 8) {
			icons = GraphicsDisplay.i;
		} else if (fff == 9) {
			icons = GraphicsDisplay.j;
		} else if (fff == 10) {
			icons = GraphicsDisplay.k;
		} else if (fff == 11) {
			icons = GraphicsDisplay.special;
		}
		
		if (Display.txt != null && !Display.txt.isEmpty()) {
			tf.setText("");
			zzzz = Corruption.calculateCorruption();
			GraphicsDisplay.jj = pp;
			numb = (fff * 36) + pp;
			maxnumb = 496;
			finalnumb = (numb * 360) / maxnumb;
			finalnumb2 = (numb * 10) / maxnumb;
			Display.peeple.add(Display.txt);
			Display.numbers.add(Display.SassFactor);
			Display.mood.add(fff);
			new_txt = Display.txt.replaceAll(" ", ":");
			new_sass = Display.SassFactor.replaceAll(" ", ":");
			String bacon = new_txt.concat("/" + new_sass);
			Display.hashbrowns.add(bacon);
		}
	}

}
