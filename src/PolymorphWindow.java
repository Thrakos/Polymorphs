import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> morphs = new ArrayList<Polymorph>();
    
    Polymorph mouse = new MouseMorph(100, 300, 75, 75);
    Polymorph message = new MessageMorph(300, 50, 100, 100);
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener((MouseMorph) mouse);
   	 window.addMouseListener((MessageMorph) message); 
   	 
   	 morphs.add(new RedMorph(100, 100, 100, 100));
   	 morphs.add(new BluePolymorph(200, 200, 50, 50));
   	 morphs.add(new MovingMorph(0, 0, 75, 75));
   	 morphs.add(new PicMorph(300, 300, 200, 200));
   	 morphs.add(new RedMorph(50, 400, 100, 100));
   	 morphs.add(new MovingMorph(450, 450, 50, 50));
   	 morphs.add(new CircleMorph(200, 200, 100, 100));
   	 morphs.add(mouse);
   	 morphs.add(message);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (Polymorph p : morphs) {
   		 p.draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 for (Polymorph p : morphs) {
   		 p.update();
   	 }
    }
}
