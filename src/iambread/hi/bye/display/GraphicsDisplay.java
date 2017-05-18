package iambread.hi.bye.display;

import java.awt.*;
import javax.swing.*;
import iambread.hi.bye.input.*;
import iambread.hi.bye.listeners.*;
import iambread.hi.bye.*;

public class GraphicsDisplay extends JPanel {
	private static final long serialVersionUID = 1L;
	public static ImageIcon a = Textures.loadImage("/faces/a.png");
	public static ImageIcon b = Textures.loadImage("/faces/b.png");
	public static ImageIcon c = Textures.loadImage("/faces/c.png");
	public static ImageIcon d = Textures.loadImage("/faces/d.png");
	public static ImageIcon e = Textures.loadImage("/faces/e.png");
	public static ImageIcon f = Textures.loadImage("/faces/f.png");
	public static ImageIcon g = Textures.loadImage("/faces/g.png");
	public static ImageIcon h = Textures.loadImage("/faces/h.png");
	public static ImageIcon i = Textures.loadImage("/faces/i.png");
	public static ImageIcon j = Textures.loadImage("/faces/j.png");
	public static ImageIcon k = Textures.loadImage("/faces/k.png");
	public static ImageIcon special = Textures.loadImage("/faces/special.png");
	public static ImageIcon banner = Textures.loadImage("/faces/banner.png");
	Font tempFont = new Font("Dialog", Font.BOLD, 60);
	Font font;
	Font tempFont2 = new Font("Dialog", Font.BOLD, 30);
	Font font2;
	String baby;
	int xx = 90;
	int yy = 200;
	int xxx = 80;
	int yyy = 100;
	Color blue = new Color(0, 154, 255);
	Color light_grey = new Color(178, 189, 196);
	Color lightlight_grey = new Color(238, 240, 242);
	Color dark_grey = new Color(76, 85, 91);
	public static int jj;
	String chosenOne;
	int x = 185;
	int y = 540;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.white);
		//banner
		banner.paintIcon(this, g, 0, 0);
		
		if (Display.txt != null && !Display.txt.isEmpty()) {
			//name
			g.setColor(dark_grey);
			font2 = tempFont2;
			if (Display.txt.length() > 3) {
				xxx = 60;
				if (Display.txt.length() > 8) {
					font2 = tempFont2.deriveFont(25f);
					if (Display.txt.length() > 12) {
						font2 = tempFont2.deriveFont(20f);
						if (Display.txt.length() > 16) {
							yyy = 105;
							font2 = tempFont2.deriveFont(15f);
							if (Display.txt.length() > 20) {
								yyy = 100;
								font2 = tempFont2.deriveFont(10f);
							}
						}
					}
				}
			}
			g.setFont(font2);
			baby = upperCaseFirst(Display.txt);
			g.drawString(baby, xxx, yyy);
			xxx = 80;
			yyy = 100;
			//is at hoe lvl
			g.setColor(light_grey);
			g.setFont(new Font("Dialog", Font.PLAIN, 20));
			g.drawString("is at hoe level", 60, 130);
			//hoe lvl itself			
			g.setColor(blue);
			font = tempFont;
			if (Display.SassFactor.length() > 2) {
				xx = 60;
				if (Display.SassFactor.length() > 4) {
					yy = 170;
					font = tempFont.deriveFont(30f);
					if (Display.SassFactor.length() > 10) {
						yy = 160;
						font = tempFont.deriveFont(20f);
						if (Display.SassFactor.length() > 19) {
							yy = 155;
							font = tempFont.deriveFont(15f);
							if (Display.SassFactor.length() > 30) {
								yy = 150;
								font = tempFont.deriveFont(10f);
							}
						}
					}
				}
			}
			g.setFont(font);
			g.drawString(Display.SassFactor, xx, yy);
			xx = 90;
			yy = 200;
			//mood txt and image
			g.setColor(dark_grey);
			g.setFont(new Font("Dialog", Font.BOLD, 25));
			g.drawString("Mood", 295, 105);
			Actions.icons.paintIcon(this, g, 280, 120);
			//bar txt
			g.drawString("Corruption:", 100, 265);
			g.drawString(jj + "%", 270, 265);
			//bar
			g.setColor(lightlight_grey);
			g.fillRect(60, 290, 320, 70);
			g.setColor(blue);
			g.fillRect(60, 290, Actions.zzzz, 70);
			//circles
			g.setColor(lightlight_grey);
			g.fillOval(90, 410, 250, 250);
			g.setColor(blue);
			g.fillArc(90, 410, 250, 250, 90, -Actions.finalnumb);
			g.setColor(Color.white);
			g.fillOval(120, 440, 190, 190);
			//circle txt
			g.setColor(dark_grey);
			g.drawString("Attractiveness", 125, 400);
			g.setColor(blue);
			font = tempFont.deriveFont(30f);
			if (Actions.finalnumb2 == 0) {
				chosenOne = "Eww";
				x = 180;
			} else if (Actions.finalnumb2 == 1) {
				chosenOne = "Ugly";
				x = 180;
			} else if (Actions.finalnumb2 == 2) {
				chosenOne = "Pretty bad";
				x = 150;
				font = tempFont.deriveFont(25f);
			} else if (Actions.finalnumb2 == 3) {
				chosenOne = "Could be worse";
				x = 145;
				font = tempFont.deriveFont(20f);
			} else if (Actions.finalnumb2 == 4) {
				chosenOne = "Meh";
				x = 180;
			} else if (Actions.finalnumb2 == 5) {
				chosenOne = "Average";
				x = 160;
				font = tempFont.deriveFont(30f);
			} else if (Actions.finalnumb2 == 6) {
				chosenOne = "More than acceptable";
				x = 140;
				font = tempFont.deriveFont(15f);
			} else if (Actions.finalnumb2 == 7) {
				chosenOne = "Pretty fine";
				x = 160;
				font = tempFont.deriveFont(25f);
			} else if (Actions.finalnumb2 == 8) {
				chosenOne = "Hot";
				x = 185;
			} else if (Actions.finalnumb2 == 9) {
				chosenOne = "Smokin' Hawt!";
				x = 150;
				font = tempFont.deriveFont(20f);
			} else if (Actions.finalnumb2 == 10) {
				chosenOne = "OMG!!";
				x = 173;
			}
			g.setFont(font);
			g.drawString(chosenOne, x, y);

			//limits frames to about 60 per second
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}					
		} else {
			//limits frames to about 60 per second
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//placeholder
			g.drawImage(Main.g.getImage(),75, 180, 300, 300, null);
		}

		repaint();
	}
	
    public static String upperCaseFirst(String value) {
    	char[] array = value.toCharArray();
    	array[0] = Character.toUpperCase(array[0]);
    	return new String(array);
    }

}
