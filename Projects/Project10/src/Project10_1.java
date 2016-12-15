import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Project10_1 extends Applet implements ActionListener{
	// define components
	Label
		lblTitle = new Label("California Nite Club Check-in"),
		lblName = new Label("Name"),
		lblAddr = new Label("Address"),
		lblPhoneNum = new Label("Phone Number"),
		lblList = new Label("List of guests in the club");
		
	TextField
		txtName = new TextField(),
		txtAddr = new TextField(),
		txtPhoneNum = new TextField();
		
	Button
		btnAdd = new Button("Add to the List");
	
	TextArea
		txtaReport = new TextArea("Name\tAddr\tPhone\n",4,80,TextArea.SCROLLBARS_BOTH);
	
	public void init(){
		setLayout(null);
		
		int startTop = 70;
		int lblLeft = 50;
		int txtLeft = 250;
		int lblWidth = 100;
		int txtWidth = 200;
		int height = 20;
		int gap = 30;
		lblTitle.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		lblTitle.setBounds(60,20, 480, 50); 									add(lblTitle);
		
		lblName.setBounds(lblLeft, startTop, lblWidth, height);					add(lblName);
		txtName.setBounds(txtLeft, startTop, txtWidth, height);					add(txtName);
		lblAddr.setBounds(lblLeft, startTop + gap, lblWidth, height);			add(lblAddr);
		txtAddr.setBounds(txtLeft, startTop + gap, txtWidth, height); 			add(txtAddr);
		lblPhoneNum.setBounds(lblLeft, startTop + gap*2, lblWidth, height);		add(lblPhoneNum);
		txtPhoneNum.setBounds(txtLeft, startTop + gap*2, txtWidth, height); 	add(txtPhoneNum);
		
		btnAdd.setBounds(350, startTop + gap*4,lblWidth, height);				add(btnAdd);
		lblList.setBounds(100, startTop + gap*5, 200, height);					add(lblList);
		txtaReport.setBounds(lblLeft, startTop + gap*6, 400,200	);				add(txtaReport);
		
		btnAdd.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// This is action for btnAdd button
		String line, strName, strAddr, strPhoneNum;
		
		// get the input content
		strName = txtName.getText();
		strAddr = txtAddr.getText();
		strPhoneNum = txtPhoneNum.getText();
		
		// combain all the input content
		line = strName + "\t" + strAddr + "\t" + strPhoneNum;
		
		// put it in the text Area
		txtaReport.append(line + "\n");
		
		// Clear the input in the text field
		txtName.setText("");
		txtAddr.setText("");
		txtPhoneNum.setText("");

		// place the cursor in the name field
		txtName.requestFocus();
	}
		
	
}


