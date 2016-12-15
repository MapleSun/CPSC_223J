package quiz3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GUI {
	public static void main(String[] args){
		JFrame frame = new JFrame("Quiz4");
		frame.setSize(500, 500);
		frame.setLocation(0,0);
		//frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cPane = frame.getContentPane();
		Graphics g = cPane.getGraphics();
		//400, 400
		g.drawRoundRect(50, 50, 400, 400, 80, 80);
		g.setColor(Color.ORANGE);
		g.fillOval(125, 100, 250, 250);
		
		g.setColor(Color.blue);
		int[] x={200,200,400,400,250,250};
		int[] y={70,270,270,220,220,70};
		g.fillPolygon(x, y, 6);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Courier New", Font.BOLD, 20));
		g.drawString("California Lotto", 150, 380);
	}
}
