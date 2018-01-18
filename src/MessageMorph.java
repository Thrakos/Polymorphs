import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph implements MouseListener {
	
	ArrayList<String> quotes = new ArrayList<String>();

	MessageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		quotes.add("Change will not come if we wait for some other person or some other time. We are the ones we've been waiting for. We are the change that we seek.");
		quotes.add("If you're walking down the right path and you're willing to keep walking, eventually you'll make progress.");
		quotes.add("I think when you spread the wealth around it's good for everybody.");
		quotes.add("You know, my faith is one that admits some doubt.");
		quotes.add("Money is not the only answer, but it makes a difference.");
		quotes.add("I don't oppose all wars. What I am opposed to is a dumb war. What I am opposed to is a rash war.");
		quotes.add("There's not a liberal America and a conservative America - there's the United States of America.");
		quotes.add("What Washington needs is adult supervision.");
		quotes.add("The future rewards those who press on. I don't have time to feel sorry for myself. I don't have time to complain. I'm going to press on.");
		quotes.add("Why can't I just eat my waffle?");
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(255, 255, 0));
		g.fillRect(x, y, width, height);
	}
	
	@Override
	public void update() {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Random rand = new Random();
		JOptionPane.showMessageDialog(null, quotes.get(rand.nextInt(10)));
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
