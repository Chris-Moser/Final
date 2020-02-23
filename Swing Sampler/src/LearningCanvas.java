import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.geom.Line2D.Double;


public class LearningCanvas extends JPanel 
{
	
	public void paintComponents(Graphics g) 
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Line2D line = new Line2D.Double(0,30,600,40);
		g2.draw(line);
	}

}
