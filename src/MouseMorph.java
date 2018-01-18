import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class MouseMorph extends Polymorph implements MouseMotionListener {

	int thing = 0;
	int thing2 = 0;

	MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(thing, thing2, thing));
		g.fillRect(x, y, width, height);
	}

	@Override
	public void update() {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {

		this.x = e.getX();
		this.y = e.getY();

		if (e.getX() > 255) {
			thing = 255;
		} else {
			thing = e.getX();
		}

		if (e.getY() > 255) {
			thing2 = 255;
		} else {
			thing2 = e.getY();
		}

	}

}
