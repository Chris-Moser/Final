import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Test2 extends JPanel implements ActionListener, KeyListener{
	
	
	public static int xposit;
	public static int yposit;
	public static int radius;
	public static double speed = 1.5;
	public static boolean isGen = false;
	public static boolean lostPopupDisplayed = false;
	
	static ArrayList<Shape> goodShapes = new ArrayList<Shape>();
	static ArrayList<Shape> badShapes = new ArrayList<Shape>();

	
	Timer t = new Timer(5, this);
	double x = 0, y = 0, velx = 0, vely = 0, r = 40;
	
	public Test2(JFrame f) {
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		if (x >= 800) {
			x = -40;
		}
		else if (x <= -40){
			x = 800;
		}
		
		if (y >= 800) {
			y = -40;
		}
		else if (y <= -40){
			y = 800;
		}
		
		g2.fill(new Ellipse2D.Double(x,y,r,r));
		
		
		for (int i = 0; i < 20; i++)
		{	
			if (isGen == false) {
				xposit = (int) (Math.random() * 800) + 0;
				yposit = (int) (Math.random() * 800) + 0;
				radius = 20;
				goodShapes.add(new Shape ("shape", radius,xposit,yposit));
			}
			else {
				xposit = goodShapes.get(i).getCordinatex();
				yposit = goodShapes.get(i).getCordinatey();
				radius = goodShapes.get(i).getRadius();
			}
		
				
			g2.setColor(Color.green);
			g2.fillOval(xposit, yposit, radius, radius);
		
			if (radius != 0) {
				double a = xposit + (double)radius/2.0;
				double b = x + (double)r/2.0;
				double deltaX =  (a-b) * (a-b);
				
				double c = yposit + (double)radius/2.0;
				double d = y + (double)r/2.0;
				double deltaY = (c-d)*(c-d);
				
				double pointDistance = Math.sqrt(deltaX+deltaY);
				
				double radiusDistance = ((double)radius + (double)r)/2.0;
				
				if (pointDistance <= radiusDistance)
				{
					r = r + 10;
					speed = speed + .1;
	
					
					
	//				goodShapes.get(i).setCordinatex(1000);
	//				goodShapes.get(i).setCordinatey(1000);
					goodShapes.get(i).setRadius(0);
				}
			}
		}
	
		for (int i = 0; i < 20; i++)
		{
			if (isGen == false) {
				xposit = (int) (Math.random() * 800) + 20;
				yposit = (int) (Math.random() * 800) + 20;
				radius = 20;
				badShapes.add(new Shape ("shape", radius,xposit,yposit));
			}
			else {
				xposit = badShapes.get(i).getCordinatex();
				yposit = badShapes.get(i).getCordinatey();
				radius = badShapes.get(i).getRadius();
			}
			
			g2.setColor(Color.red);
			g2.fillOval(xposit, yposit, radius, radius);
			
			double a = xposit + (double)radius/2.0;
			double b = x + (double)r/2.0;
			double deltaX =  (a-b) * (a-b);
			
			double c = yposit + (double)radius/2.0;
			double d = y + (double)r/2.0;
			double deltaY = (c-d)*(c-d);
			
			double pointDistance = Math.sqrt(deltaX+deltaY);
			
			double radiusDistance = (radius + r)/2;
			
			if (pointDistance <= radiusDistance)
			{
				speed = 0;
				velx= 0;
				vely=0;
				g2.setColor(Color.black);
				g2.fillRect(0, 0, 800, 800);
				r = 800;
				
				
				
				
				
				if (lostPopupDisplayed == false) {
					lostPopupDisplayed = true;
					JOptionPane.showMessageDialog(null,"YOU SUCK ☹ ", "BREAKING NEWS!", JOptionPane.ERROR_MESSAGE);					
				}
				
				
			}
			
		}
	
		
		
	
		
	
	if (isGen == false) {
		isGen = true;
	}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		repaint();
		x += velx;
		y+= vely;
		
	}
	
	public void up() {
		vely =- speed;
		velx = 0;		
	}
	
	public void down() {
		vely = speed;
		velx = 0;
	}
	
	public void left() {
		velx = - speed;
		vely = 0;
	}
	
	public void right() {
		velx = speed;
		vely = 0;
	}
	
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_UP) {
			up();
		}
		
		if (code == KeyEvent.VK_DOWN) {
			down();
		}
		
		if (code == KeyEvent.VK_RIGHT) {
			right();
		}
		
		if (code == KeyEvent.VK_LEFT) {
			left();
		}
	}
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
}
