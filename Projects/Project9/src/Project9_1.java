import java.awt.*;
import javax.swing.*;
public class Project9_1 {
	public static void main(String[] args){
		JFrame frame = new JFrame("Project9_1");
		frame.setSize(500,300);
		frame.setLocation(0,0);
		frame.setVisible(true);;
		
		Container cPane = frame.getContentPane();
		Graphics g = cPane.getGraphics();
		
		g.drawString("Geometric Shapes", 200, 20);
		g.drawLine(250, 25, 250, 50);
		// second horizontal line
		g.drawLine(150, 50, 350, 50);
		
		// line above polygons
		g.drawLine(150, 50, 150, 90);
		g.drawString("Polygons", 125, 100);
		// line above Ovals
		g.drawLine(350, 50, 350, 90);
		g.drawString("Ovals", 340, 100);
		
		// third level height
		int height = 25;
		
		// polygons
		g.drawLine(150, 110, 150, 110+height+25);
		// horizontal
		g.drawLine(50, 135, 250, 135);
		// vertical
		g.drawLine(50, 135, 50, 135+height);
		g.drawLine(250, 135, 250, 135+height);
		// polygons rect:(50,135+height), tri:(150,135+height), ti:(250,135+height)
		
		//rect
		//g.setColor(Color.black);
		//g.drawRect(10, 135+height, 80, 40);
		g.setColor(Color.gray);
		g.fillRect(10, 135+height, 80, 40);
		// tri
		int[] x = {150, 130, 170};
		int[] y = {135+height, 135+height+40, 135+height+40};
		g.fillPolygon(x, y, 3);
		
		// ti
		int[] x_ti = {230,270,280,220};
		int[] y_ti = {135+height,135+height,135+height+40,135+height+40};
		g.fillPolygon(x_ti,y_ti,4);
		
		
		g.drawLine(350, 110, 350, 110+height);
		// horizontal
		g.drawLine(300, 135, 400, 135);
		// vertical
		g.drawLine(300, 135, 300, 135+height);
		g.drawLine(400, 135, 400, 135+height);

		// circle:(290,135+height,height,height)
		g.fillOval(280, 135+height, 40, 40);
		
		// Oval
		g.fillOval(360, 135+height, 80, 40);
				
		
		
		
	}
}
