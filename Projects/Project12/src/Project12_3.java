import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;

public class Project12_3 extends Applet implements ActionListener	{
	Label 
		Welcome = new Label("Welcome to the United States of America"),
		lblTime = new Label("Select time zone"),
		lblPacific = new Label("Pacific Time");
	
	Image sample, screen;
	
	Choice TimeZone = new Choice();
	
	TextField time = new TextField();
	
	Button show = new Button("Show Info");
	String[] Area = {"Pacific", "Mountain", "Central","Eastern"};
	public void init(){
		setLayout(null);
		
		resize(600,400);
		Welcome.setFont(new Font("Courier",Font.BOLD,13));
		Welcome.setBounds(120, 30, 300, 30); add(Welcome);
		
		lblTime.setBounds(35,75,120,20); add(lblTime);
		
		for(int i = 0; i<Area.length; i++){
			TimeZone.add(Area[i]);
		}
		TimeZone.setBounds(25,100,130,30); add(TimeZone);
		
		sample = getImage(getDocumentBase(),"../image/Pacific.png");
		screen = getImage(getDocumentBase(),"../image/screen.jpg");
		
		
		lblPacific.setBounds(35,150,120,20); add(lblPacific);
		time.setBounds(25,180,120,20); add(time);
		
		show.setBounds(25, 240,130,30); add(show);
		show.addActionListener(this);
		
	}
	
	public void paint(Graphics g){
		g.drawImage(sample,180,70,170,300,this);
		g.drawImage(screen,400,70,170,180,this);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		int index = TimeZone.getSelectedIndex();
		
		hour += index; 
		String timeline = hour + ":"+min+":"+sec;
		time.setText(timeline);
		
		sample = getImage(getDocumentBase(),"../image/"+ Area[index]+".png");
		repaint();
		
	}


}
