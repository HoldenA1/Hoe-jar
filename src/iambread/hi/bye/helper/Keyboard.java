package iambread.hi.bye.helper;

import java.awt.event.*;
import iambread.hi.bye.display.*;

public class Keyboard implements KeyListener{

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) Display.ac.onClick(Display.tf);
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {	
	}

}
