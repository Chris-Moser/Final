import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Agario extends Canvas implements ActionListener, KeyListener{
	
	
	public static int userX = 0;
	public static int userY = 0;
	
	public static int x;
	public static int y;
	public static int r;

	private static final long	serialVersionUID	= 1L;
	static ArrayList<Shape> goodShapes = new ArrayList<Shape>();
	
	static ArrayList<Shape> badShapes = new ArrayList<Shape>();
	
	public static void main(String[] args) {
		
		  Agario canvas = new Agario();
	      JFrame frame = new JFrame();
	      frame.setSize(500, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
	       
		
		//player();
		
		grow();
		die();
		restart();
		

	}



	private static void die() 
		{
		
	
		
		}

	private static void grow() 
		{

		
		
		}

//	private static void run() {		
//		badShapes.add(new Shape ("poison1",20,25,25));
//		badShapes.add(new Shape ("poison2",20,30,30));
//		badShapes.add(new Shape ("poison3",20,35,35));
//		badShapes.add(new Shape ("poison4",20,40,40));
//		badShapes.add(new Shape ("poison5",20,45,45));
//		badShapes.add(new Shape ("poison6",20,50,50));
//		
//		goodShapes.add(new Shape ("food1",20,55,55));
//		goodShapes.add(new Shape ("food2",20,60,60));
//		goodShapes.add(new Shape ("food3",20,65,65));
//		goodShapes.add(new Shape ("food4",20,70,70));
//		goodShapes.add(new Shape ("food5",20,75,75));
//		goodShapes.add(new Shape ("food6",20,80,80));
//		
//		for (int i = 0; i < goodShapes.size(); i++)
//		{
//			
//			//System.out.println(order.get(SizePatternSelect).getImage());
//			x = goodShapes.get(i).getCordinatex();
//			y = goodShapes.get(i).getCordinatey();
//			r = goodShapes.get(i).getRadius();
//			
//			
//		
//		}
//		
//	}
	
	private static void restart() {
	
		
	}
	
	public void paint(Graphics graphics) {
		
		
		for (int i = 0; i < 20; i++)
			{
			x = (int) (Math.random() * 500) + 0;
			y = (int) (Math.random() * 500) + 0;
			r = 20;
			goodShapes.add(new Shape ("shape", r,x,y));
			
			
			graphics.setColor(Color.green);
			graphics.fillOval(x, y, r, r);
			
			
			
			}
		
		for (int i = 0; i < 20; i++)
			{
			x = (int) (Math.random() * 500) + 0;
			y = (int) (Math.random() * 500) + 0;
			r = 20;
		
			badShapes.add(new Shape ("shape", r,x,y));
		
			graphics.setColor(Color.red);
			graphics.fillOval(x, y, r, r);
		
		
		
			}
		
		
			graphics.setColor(Color.blue);
			graphics.fillOval(userX, userY, 50, 50);
        
			delay();
        
			graphics.setColor(Color.white);
			graphics.fillOval(userX, userY, 50, 50);
    		}
		

			public void delay()
				{
					try
						{
						Thread.sleep(50);
						} 
					catch (InterruptedException e)
						{
						e.printStackTrace();
						}
		}	
	
		
		
		
//		for (int i = 0; i < goodShapes.size(); i++)
//		{
//			
//			
//			x = goodShapes.get(i).getCordinatex();
//			y = goodShapes.get(i).getCordinatey();
//			r = goodShapes.get(i).getRadius();
//			
//			graphics.setColor(Color.red);
//			 graphics.fillOval(x, y, r, r);
//		
//		} 
		
		
		
		
		 //graphics.setColor(Color.blue);
		 //graphics.fillOval(x, y, r, r);
	



	@Override
	public void keyTyped(KeyEvent e) {
			int	c = e.getKeyCode();
			if (c== KeyEvent.VK_LEFT)
			{
				userX--;
			}
			
			if (c== KeyEvent.VK_RIGHT)
			{
				userX++;
			}
			
			if (c== KeyEvent.VK_UP)
			{
				userY++;
			}
			
			if (c== KeyEvent.VK_DOWN)
			{
				userY--;
			}
	}



	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
