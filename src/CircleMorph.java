import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class CircleMorph extends Polymorph {
	
	Random rand = new Random();
	int thing;
	int thing2;
	int thing3;
	
	double ctr = 0;
	
	CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		thing = rand.nextInt(255);
		thing2 = rand.nextInt(255);
		thing3 = rand.nextInt(255);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(thing, thing2, thing3));
		g.fillRect(x, y, width, height);
	}
	
	@Override
	public void update() {
		
		this.x += Math.sin(ctr) * 10;
		this.y += Math.cos(ctr) * 10;
		
		ctr += 0.1;
	}
	
}
