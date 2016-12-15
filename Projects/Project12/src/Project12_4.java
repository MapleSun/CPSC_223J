import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Project12_4 extends Applet implements	ActionListener{

	Label
		title = new Label("My Family Album"),
		subTitle = new Label("Image description");
	
	Button
		back = new Button("<<<"),
		next = new Button(">>>"),
		display = new Button("Show describtion");
	
	TextArea description = new TextArea();
	
	Scrollbar sb = new Scrollbar(0,10,10,0,190);
	
	Image img;
	String[] Pics = {"face", "Eastern", "Mountain"};
	
	public void init(){
		setLayout(null);
		resize(600,400);
		back.setBounds(50,50,60,30);
		next.setBounds(190,50,60,30);
		add(back); add(next);
		back.addActionListener(this);
		next.addActionListener(this);
		sb.setBounds(60,80,180,30); add(sb);
		
		img = getImage(getDocumentBase(),"../image/"+ Pics[0]+".png"); 
		
		display.setBounds(260, 150, 120, 50); add(display);
		display.addActionListener(this);
		title.setBounds(400,80,120,20);add(title);
		subTitle.setBounds(400,100,120,30); add(subTitle);
		description.setBounds(400,140,180,80); add(description);
	}
	
	public void paint(Graphics g){
		g.drawImage(img, 60, 120, 180, 130, this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int value = sb.getValue();
		int interval = 100;
		
		if(e.getSource() == back && value > 0){
			sb.setValues(value - interval, 10, 10, 210);
		}else if(e.getSource() == next && value <200){
			sb.setValues(value + interval, 10, 10, 210);
			
		}
		int newIndex = (sb.getValue()+20)/interval;
		img = getImage(getDocumentBase(),"../image/"+ Pics[newIndex]+".png");
		repaint();
		if(e.getSource() == display){
			description.setText(Pics[newIndex]);
		}
	}
	
}
