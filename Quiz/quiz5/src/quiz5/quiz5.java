package quiz5;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quiz5 extends Applet implements ActionListener {
	Label
		Title = new Label("Domino's Pizza"),
		lblDate = new Label("Today's date: "),
		lblSubTitle = new Label("Choose your pizza (Basic $7.00)"),
		lblCrust = new Label("Select the Crust(0.50 extra)"),
		lblSize  = new Label("Select size($1.00, $2.00, $3.00 extra)"),
		lblNum = new Label("Number of Pizza"),
		lblName = new Label("Your name"),
		lblPhone = new Label("Phone Number");
	
	Button
		btnNext = new Button(">>>"),
		btnBack = new Button("<<<"),
		btnNextPizza = new Button("next"),
		btnOrder = new Button("Click to order");
	
		
	
	Choice
		Crust = new Choice(),
		Num  = new Choice();
	
	TextField
		Name = new TextField(),
		Phone = new TextField(),
		Type = new TextField();
	
	TextArea
		Order = new TextArea();
	
	CheckboxGroup cbg = new CheckboxGroup();
	
	Checkbox
		inch10 = new Checkbox("10\"",cbg, false),
		inch12 = new Checkbox("12\"",cbg, true),
		inch14 = new Checkbox("14\"", cbg,false);
	
	Image Pizza, selectedPizza;

	int typeNum = 0;
	public void init(){
		setLayout(null);
		resize(500,600);
		Title.setBounds(210, 20, 100, 20); add(Title);
		lblDate.setBounds(180, 50, 120, 30); add(lblDate);
		lblSubTitle.setBounds(50, 90, 250, 20); add(lblSubTitle);
		btnNext.setBounds(220, 140, 80, 30); add(btnNext);
		Type.setBounds(220, 180, 80 ,30); add(Type);
		btnBack.setBounds(220, 220, 80, 30); add(btnBack);
		btnNextPizza.setBounds(100, 240, 50, 20 ); add(btnNextPizza);
		
		lblCrust.setBounds(30, 260,200, 30); add(lblCrust);
		Crust.setBounds(40, 300, 150, 30); add(Crust);
		
		lblSize.setBounds(230, 260,250, 30); add(lblSize);
		inch10.setBounds(240, 300, 80, 30); add(inch10);
		inch12.setBounds(320, 300, 80, 30); add(inch12);
		inch14.setBounds(400, 300, 80, 30); add(inch14);
		
		lblNum.setBounds(50,350,120,30); add(lblNum);
		lblName.setBounds(230,350,80,30); add(lblName);
		lblPhone.setBounds(320,350,100,30); add(lblPhone);
		
		Num.setBounds(75, 390, 80, 30); add(Num);
		Name.setBounds(210,390,100,30); add(Name);
		Phone.setBounds(320,390,100,30); add(Phone);
		
		btnOrder.setBounds(50,450,400,30); add(btnOrder);
		
		Order.setBounds(50, 500, 400, 80); add(Order);
		
		Pizza = getImage(getDocumentBase(), "../image/"+ 1 +".png");
		
		String[] CrustType = {"Hand Tossed", "Pan"};
		for(int i = 0; i < CrustType.length; i++){
			Crust.add(CrustType[i]);
		}
		
		for(int i=1; i<6; i++){
			Num.add(Integer.toString(i));
		}
		
		
		btnNext.addActionListener(this);
		btnBack.addActionListener(this);
		btnNextPizza.addActionListener(this);
		btnOrder.addActionListener(this);
		
		
	}
	
	public void paint(Graphics g){
		g.drawImage(Pizza, 50, 120, 150,120,this);
		g.drawImage(selectedPizza, 320, 120, 150, 120, this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnNextPizza){
			typeNum++;
			Pizza = getImage(getDocumentBase(), "../image/"+ (typeNum%3+1) +".png");
			repaint();
		}else if(e.getSource() == btnNext){
			selectedPizza = getImage(getDocumentBase(), "../image/"+ (typeNum%3+1) +".png");
			Type.setText(""+(typeNum%3+1) );
			
			repaint();
		} else if(e.getSource() == btnBack){
			selectedPizza = null;
			Type.setText("");
			repaint();
		} else if(e.getSource() == btnOrder) {
			String name, phone, num, size, crust, type;
			double price = 7.0;
			name = Name.getText();
			phone = Phone.getText();
			num = Num.getSelectedItem();
			crust = Crust.getSelectedItem();
			price += 0.05;
			type = Type.getText();
			if(inch10.getState()){
				size = "10";
				price += 1;
			} else if(inch12.getState()){
				size = "12";
				price += 2;
			} else {
				size = "14";
				price += 3;
			}
			
			String Line = name + ", "+phone + "\n"
					+ "Basic pizza type " + type + ": 7.00\n"
					+ "Crust: " + crust + " 0.05\n"
					+ "Size: " + size + " inches\n"
					+ "Number of pizzas " + num
					+ "\nTotal $" + price;
			Order.setText(Line);
					
		}
		
		
	}
	
}
