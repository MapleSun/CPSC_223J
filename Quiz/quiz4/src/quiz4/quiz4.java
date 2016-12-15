package quiz4;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quiz4 extends Applet implements ActionListener{
		// define components
		Label
			lblNum1 = new Label("Enter a number"),
			lblNum2 = new Label("Enter another number"),
			lblTitle = new Label("Press to show them");
			
		TextField
			txtNum1 = new TextField(),
			txtNum2 = new TextField();
			
			
		Button
			btnSum = new Button("Sum"),
			btnDiff = new Button("Difference"),
			btnAvg = new Button("Average"),
			btnMax = new Button("Max");
		
		TextArea
			txtaReport = new TextArea("",0,0,TextArea.SCROLLBARS_BOTH);
		
		public void init(){
			setLayout(null);
			int lblLeft = 25;
			int top = 50;
			int lblWidth = 200;
			int height = 35;
			int txtLeft = 225;
			int txtWidth = 200;
			int gap = 50;
			int btnWidth = 100;
			int wGap = 120;
			
			lblNum1.setBounds(lblLeft, top, lblWidth, height);					add(lblNum1);
			txtNum1.setBounds(txtLeft, top, txtWidth, height);					add(txtNum1);
			lblNum2.setBounds(lblLeft, top + gap, lblWidth, height);			add(lblNum2);
			txtNum2.setBounds(txtLeft, top + gap, txtWidth, height); 			add(txtNum2);
			
			lblTitle.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
			lblTitle.setBounds(150, top+2*gap, 300, 50); 									add(lblTitle);
			
			btnSum.setBounds(25, top + gap*3,btnWidth, height);					add(btnSum);
			btnDiff.setBounds(25+wGap, top + gap*3,btnWidth, height);				add(btnDiff);
			btnAvg.setBounds(25+2*wGap, top + gap*3,btnWidth, height);					add(btnAvg);
			btnMax.setBounds(25+3*wGap, top + gap*3,btnWidth, height);					add(btnMax);
			txtaReport.setBounds(lblLeft+25, top + gap*4, 400,200	);				add(txtaReport);
			
			btnSum.addActionListener(this);
			btnDiff.addActionListener(this);
			btnAvg.addActionListener(this);
			btnMax.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String  num1, num2;
			String line = new String();
			
			// get the input content
			num1 = txtNum1.getText();
			num2 = txtNum2.getText();
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			
			if(e.getSource() == btnSum){
				line = "The sum of " + num1 + " and "  + num2 + " is " +   (n1+n2);
			}else if(e.getSource() == btnDiff){
				line = "The Difference of " + num1 + " and "  + num2 + " is " +   (n1-n2);
			}else if(e.getSource() == btnAvg){
				line = "The Average of " + num1 + " and "  + num2 + " is " +   (n1+n2)/2;
			}else if(e.getSource() == btnMax){
				int max = n1>n2?n1:n2;
				line = "The Max of " + num1 + " and "  + num2 + " is " +   max;
			}
			

			// put it in the text Area
			txtaReport.append(line + "\n");
			
			// Clear the input in the text field
			txtNum1.setText("");
			txtNum2.setText("");


			// place the cursor in the name field
			txtNum1.requestFocus();
			
			
		}

}
