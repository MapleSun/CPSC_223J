import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Final2 extends Applet implements ActionListener {
	
	Image img;
	TextArea discription = new TextArea("",3,100,TextArea.SCROLLBARS_VERTICAL_ONLY);
	String[] pics = {"winter","spring","summer","fall"};
	JFrame frmMenu = new JFrame("Season");
	
	JMenuBar mnuMain = new JMenuBar();
	
	JLabel lblImage = new JLabel();
	JMenu spring = new JMenu("Spring"),
			summer = new JMenu("Summer"),
			fall = new JMenu("Fall"),
			winter = new JMenu("Winter");
	
	JMenu[] menus = {spring, summer, fall, winter};
	
	String[] season = {"SPRING", "SUMMER", "FALL", "WINTER"};
	
	String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	JMenuItem april = new JMenuItem("April");
	JMenuItem may = new JMenuItem("May");
	JMenuItem june = new JMenuItem("June");
	
	public static void main(String[] args){
		Final2 myMenu = new Final2();
		myMenu.createInterface();
		
	}
	
	public void createInterface(){
		frmMenu.setLayout(null);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i<month.length; i++){
			JMenuItem item = new JMenuItem(month[(i+3)%12]);
			menus[i/3].add(item);
			item.addActionListener(this);
			
		}
		
		for(int i = 0; i<menus.length; i++){
			mnuMain.add(menus[i]);
			menus[i].addActionListener(this);
		}
		
		lblImage.setIcon(new ImageIcon(getClass().getResource("spring.jpg")));
		lblImage.setBounds(50,150,200,200); frmMenu.add(lblImage);
		discription.setBounds(300,150,200,200); frmMenu.add(discription);
		frmMenu.setJMenuBar(mnuMain);
		
		frmMenu.setVisible(true);
		frmMenu.setSize(600, 600);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//String strMenuItem = e.getActionCommand();
		for(int i = 0; i<month.length; i++){
			if(e.getActionCommand()==month[i]){
				lblImage.setIcon(new ImageIcon(getClass().getResource(pics[i/3] + ".jpg")));
				String th = new String();
				if(i%3 == 1){
					 th  = "st";
				}else if(1%3 ==2){
					 th = "nd";
				}else{
					 th = "rd";
				}
				discription.setText("Month of " + month[i] + " the " + i%3 + th +" month of " +  pics[i/3] 
						+ " and the " + i + "th month of the year");
			}
		}
	}
	
	public void paint(Graphics g){
		g.drawImage(img, 50, 150, 200, 200, this);
	}
	
}