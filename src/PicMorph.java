import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class PicMorph extends Polymorph {
	
	BufferedImage eh;
	
	PicMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		 try {
			eh = ImageIO.read(this.getClass().getResourceAsStream("cookie.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(eh, 300, 300, 200, 200, null);
	}

	@Override
	public void update() {

	}

}
