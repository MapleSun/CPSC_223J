import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Project11_1 extends Applet implements ActionListener, ItemListener, AdjustmentListener{
	Label
		title = new Label("Chip Tickets Agency"),
		depart =      new Label("  Depart                           Arrive"),
		CityAirport = new Label("City/Airport                    City/Airport"),
		Name = new Label("Name"),
		Phone = new Label("Phone No"),
		NumTickets = new Label("Number of tickets"),
		Type = new Label("Type of Tickets"),
		Conformation = new Label("Conformation");
	
	Scrollbar NumScroll = new Scrollbar(0,0,10,0,210);
	
	Button buy = new Button("Buy Ticket(s)");
	
	
	TextField
		txtNum = new TextField(),
		txtName = new TextField(),
		txtPhone = new TextField();
	
	TextArea
		txtConformation =  new TextArea();

	// CheckboxGroup
	CheckboxGroup  cbg = new CheckboxGroup();
	
	// Checkbox
	Checkbox
		opFirst = new Checkbox("First Class",cbg, true),
		opEconomy = new Checkbox("Economy Class",cbg,false),
		opBusiness = new Checkbox("Business Class",cbg,false);
		
	// Choice
	List 
		DTable = new List(5, false),
		ATable = new List(5, false);
		
		
	
	// Font
	Font fBold = new Font("Times New Roman", Font.BOLD,27);
		
	public void init(){
		
		// First level
		int height = 25;
		setLayout(null);
		title.setBounds(100,30,300,30); title.setFont(fBold); add(title);
		depart.setBounds(50,75,200,height); add(depart);
		CityAirport.setBounds(50, 100, 300, height); add(CityAirport);
		
		// List
		String [] Content = {"LAX", "Ontario", "Fullerton","John Wayne", "La Verne","another city",
				"New York", "Paris", "London", "Los Vegas", "Hawii", "Dallas", "Bostan"};
		
		for(int i = 0; i<6;i++){
			DTable.add(Content[i]);
			ATable.add(Content[i+5]);
		}
		
		DTable.setBounds(45, 130, 100, 100);
		ATable.setBounds(200,130,100,100);
		add(DTable); add(ATable);
		
		
		// Name and phoneNum
		Name.setBounds(350,100,120,height); add(Name);
		txtName.setBounds(325, 130, 100, height); add(txtName);
		
		Phone.setBounds(350,170,120,height); add(Phone);
		txtPhone.setBounds(325, 200, 100, height); add(txtPhone);
		
		// Second Level
		int secondT = 250;
		int secondL = 45;
		int secondW = 140;
		// Num of Tickets
		NumTickets.setBounds(secondL, secondT, secondW, height); add(NumTickets);
		NumScroll.setBounds(secondL+150, secondT, secondW, height); add(NumScroll); 
		txtNum.setBounds(secondL+secondW+190, secondT,35,height); add(txtNum);
		
		// Third Level Left
		int thirdL = 45;
		int thirdT = 290;
		int thirdW = 150;
		int gap = 5;
	
		Type.setBounds(thirdL, thirdT,thirdW,height); add(Type);
		opFirst.setBounds(thirdL, thirdT+height+gap, thirdW, height); add(opFirst);
		opEconomy.setBounds(thirdL, thirdT+(height+gap)*2, thirdW, height); add(opEconomy);
		opBusiness.setBounds(thirdL, thirdT+(height+gap)*3, thirdW, height); add(opBusiness);
		
		buy.setBounds(thirdL, thirdT+(height+gap)*4,thirdW, height+10); add(buy);
		
		// Third Level right
		int thirdRightL = 250;
		Conformation.setBounds(thirdRightL+50, thirdT, thirdW, height);
		add(Conformation);
		txtConformation.setBounds(thirdRightL, thirdT+height,200,150);
		add(txtConformation);
		
		buy.addActionListener(this);
		NumScroll.addAdjustmentListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name,phone,depart,arrive,type,Num,result;
		// TODO Auto-generated method stub
		depart = DTable.getSelectedItem();
		arrive = ATable.getSelectedItem();
		Num = txtNum.getText();
		name = txtName.getText();
		phone = txtPhone.getText();
		type = new String();
		if(opFirst .getState())
			type = "First Class";
		else if(opEconomy.getState())
			type = "Economy Class";
		else if(opBusiness.getState())
			type = "Business Class";
		
		result = "Name: " + name +"\n"
				+ "Phone No: " + phone + "\n"
				+ "Dept City: " + depart + "\n"
				+ "Arrival City: " + arrive +  "\n"
				+ "No. of Tickets: " + Num + "\n"
				+ "Tickets type: " + type;
		
		txtConformation.setText(result);
	}


	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == NumScroll)
			txtNum.setText(Integer.toString(NumScroll.getValue()/20));
		else
			txtNum.setText("1");
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
