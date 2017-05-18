package iambread.hi.bye.input;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Textures {
	
	public static ImageIcon loadImage(String filePath) {
		try {
			BufferedImage image = ImageIO.read(Textures.class.getResource(filePath));
			ImageIcon p = new ImageIcon();
			p.setImage(image);
			return p;
		} catch(Exception e){
			System.out.println("Failed getting textures");
			throw new RuntimeException(e);
		}
	}

}
