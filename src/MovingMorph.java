import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {
	
	int red = 255;
	int green = 0;
	int blue = 0;
	int color = 1;
	boolean change2 = false;

	MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(red, green, blue));
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {
		
		if (red == 255 && green == 0 && blue == 0) {
			color = 1;
		} else if (red == 255 && green == 255 && blue == 0) {
			color = 2;
		} else if (red == 0 && green == 255 && blue == 0) {
			color = 3;
		} else if (red == 0 && green == 255 && blue == 255) {
			color = 4;
		} else if (red == 0 && green == 0 && blue == 255) {
			color = 5;
		} else if (red == 255 && green == 0 && blue == 255) {
			color = 6;
		}
		
		if (color == 1) {
			green++;
		} else if (color == 2) {
			red--;
		} else if (color == 3) {
			blue++;
		} else if (color == 4) {
			green--;
		} else if (color == 5) {
			red++;
		} else if (color == 6) {
			blue--;
		}
		
//		if (color < 250 && !change) {
//			color++;
//
//		} else if (color == 1) {
//			change = true;
//		} else {
//			color--;
//			change = true;
//		}
		
		if(this.x < 400 && !change2) {
			this.x++;
			this.y++;
		} else if (this.x == 0) {
			change2 = false;
		} else {
			this.x--;
			this.y--;
			change2 = true;
		}
	}
	
}
