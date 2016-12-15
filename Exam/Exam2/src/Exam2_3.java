import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam2_3 extends Applet implements ActionListener{
	Label
		title = new Label("Hospitally Desk"),
		fLine = new Label("Name                                  Day           Month         Year(2000-2016)"),
		choose = new Label("Choose your gift"),
		chooseColor = new Label("Choose your Favourite Color"),
		press = new Label("Press to display");
	
	TextField
		txtName = new TextField();
	TextArea
		txtOrder = new TextArea();
		
	Choice
		dList = new Choice(),
		mList = new Choice(),
		yList = new Choice();
	
	CheckboxGroup cbg = new CheckboxGroup();
     
     //create checkboxes and add to group
     Checkbox cake = new Checkbox("Cake", cbg, true);
     Checkbox champaign = new Checkbox("Champaign", cbg, false);
     Checkbox ice = new Checkbox("Ice Cream", cbg, false);
    
	List
		cList = new List(4,false);
	Button
		pbtn = new Button("press");
	
	public void init(){
		setLayout(null);
		title.setBounds(150,10,200,20); add(title);
		fLine.setBounds(70,50,400,20);	add(fLine);
		//first level
		int y = 80;
		int height = 20;
		txtName.setBounds(50,y,100,height); add(txtName);
		for(int i = 1; i < 31; i++){
			dList.add(Integer.toString(i));
		}
		
		
		for(int i = 1; i<13; i++){
			mList.add(Integer.toString(i));
		}
		for(int i = 2000; i<2017; i++){
			yList.add(Integer.toString(i));
		}
		int x = 200;
		dList.setBounds(x,y,50, height);
		mList.setBounds(x+70,y,50,height);
		yList.setBounds(x+70*2,y,70,height);
		add(dList);
		add(mList);
		add(yList);
		
		
		 
		
		//second level
		int sY = 110;
		choose.setBounds(50, sY, 100,height); add(choose);
		int sX = 170;
		cake.setBounds(sX,sY,70,30);
		champaign.setBounds(sX+100,sY,70,30);
		ice.setBounds(sX+100*2,sY,70,30);
		add(cake);
	    add(champaign);
	    add(ice);
	    
	    //third level
	    int tY = 140;
	    chooseColor.setBounds(50,tY,150,20); add(chooseColor);
	    cList.add("red");
	    cList.add("yellow");
	    cList.add("green");
	    cList.add("blue");
	    cList.setBounds(50,tY+40,150,80); add(cList);
	    
	    press.setBounds(240,tY,100,20); add(press);
	    
	    pbtn.setBounds(350,tY,100,20); add(pbtn);
	    
	    txtOrder.setBounds(240,tY+40,200,100); add(txtOrder);
		
		pbtn.addActionListener(this);;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name, day, month, year, gift, color,Order;
		name = txtName.getText();
		day=dList.getSelectedItem();
		month = mList.getSelectedItem();
		year = yList.getSelectedItem();
		color = cList.getSelectedItem();
		gift = new String();
		if( cake.getState())
			gift = "Cake";
		else if(champaign.getState())
			gift = "Champaign";
		else if(ice.getState())
			gift= "Ice Cream";
		
		int old = 2016-Integer.valueOf(year);
		Order = "Hello " + name +"\n"
				+"On your " + old + "th birthday," + month +" "+ day + " 2016" + "\n"
				+"We will send you a " + gift + "\n"
				+ "in a " + color + " box.       management";
		
		txtOrder.setText(Order);
	
		
	}
}
