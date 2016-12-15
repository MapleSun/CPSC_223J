import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Project9_2 {
	public static void main(String[] args){
		
		
				JFrame frame = new JFrame("Project9_2");
				frame.setSize(500, 500);
				frame.setLocation(0,0);
				//frame.pack();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				Container cPane = frame.getContentPane();
				Graphics g = cPane.getGraphics();
				
				String option;
				int width = (int)cPane.getSize().getWidth();
				int height = (int)cPane.getSize().getHeight();
				do{
					displayMenu(g);
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					option = JOptionPane.showInputDialog("Enter your menu option");
					//Ellipse(g);
					
					g.clearRect(0, 0 ,width,height);
					switch(option){
					case("a"): Trangles(g);break;
					case("b"):Ellipse(g); break;
					case("c"): Polygons(g); break;
					default: break;
					}
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					option = JOptionPane.showInputDialog("Continue(y/n)");
					g.clearRect(0, 0, width, height);
				}while(option.equals("Y") || option.equals("y"));
		
	}
	
	static void displayMenu(Graphics g){
		g.drawString("---------------Menu-------------",10,20);
		g.drawString("a. Compute the area of triangles",10,35);
		g.drawString("b. Compute the area of ellipse",10,50);
		g.drawString("c. Compute the area of polygons",10,65);
	}
	// area of Trangles=1/2(x1(y2-y3)+x2(y3-y1)+x3(y1-y2));
	static void Trangles(Graphics g){
		g.drawString("Press enter trangles info", 10, 20);
		int[] x = {20,80,140};
		int[] y = {100,50,100};
		g.setColor(Color.DARK_GRAY);
		g.fillPolygon(x, y, 3);
		double abs = (x[0]-x[2])*(y[2]-y[0])-(x[0]-x[1])*(y[2]-y[0]);
		g.drawString("Area = |(xA−xC)(yB−yA)−(xA−xB)(yC−yA)|/2 =  " + Math.abs(abs)/2 ,20,200);
	}
	static void Polygons(Graphics g){
		int num = 5;//Integer.parseInt(JOptionPane.showInputDialog("How many edges?"));
		int[] x = {20,50,90,120,60};
		int[] y = {50,100,100,50,30};
		g.setColor(Color.BLACK);
		g.fillPolygon(x,y,num);
		double abs = 0;
		for(int i=0; i<num-1; i++){
			int j=i+1;
			if (j>num) j=0;
			abs += x[i]*y[j]-x[j]*y[i];
		}
		g.drawString("Area = |(xA−xC)(yB−yA)−(xA−xB)(yC−yA)|/2 =  " + Math.abs(abs)/2 ,20,200);
	}
	static void Ellipse(Graphics g) {
		g.drawString("Press enter ellipse info", 10, 20);
		int major = Integer.parseInt(JOptionPane.showInputDialog("What is the length of major axis?"));
		int minor = Integer.parseInt(JOptionPane.showInputDialog("What is the length of minor axis?"));
		g.setColor(Color.DARK_GRAY);
		g.fillOval(20, 50, major, minor);
		g.drawString("Major axis = " + major, 20,50+minor+20);
		g.drawString("Minor axis = " + minor, 20,50+minor+50);
		g.drawString("Area = pi*(major/2)*(minor/2) =  " + Math.PI*major*minor/4, 20, 50+minor+70);
		
		
	}
	
	
}
