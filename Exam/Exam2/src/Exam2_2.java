import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Exam2_2 {
	public static void main(String[] args){ 
		JFrame frame = new JFrame("Exam2_2"); 
		frame.setSize(500, 500); 
		frame.setLocation(0,0); 
		//frame.pack(); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 
		Container cPane = frame.getContentPane(); 
		Graphics g = cPane.getGraphics(); 
		
		int length = 50;
		int height = 35;
		int[] x = {0,0,35,85,120,120,85,35};
		int[] y = {35,85,120,120,85,35,0,0};
		
		g.setColor(Color.RED);
		g.fillPolygon(x	,y, 8);
		g.setColor(Color.white);
		Font f = new Font("Helvetica", Font.BOLD,35);
		g.setFont(f);
		g.drawString("STOP", 10, 60);
	}
		
}
