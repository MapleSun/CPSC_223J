import javax.swing.*;
import javax.swing.event.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Project10_2 extends Applet implements ActionListener{
	Button
		Btn1 = new Button("1"),
		Btn2 = new Button("2"),
		Btn3 = new Button("3"),
		Btn4 = new Button("4"),
		Btn5 = new Button("5"),
		Btn6 = new Button("6"),
		Btn7 = new Button("7"),
		Btn8 = new Button("8"),
		Btn9 = new Button("9"),
		Btn0 = new Button("0"),
		BtnAdd = new Button("+"),
		BtnMinus = new Button("-"),
		BtnMul = new Button("*"),
		BtnDivd = new Button("/"),
		BtnEqual = new Button("="),
		BtnNeg = new Button("+/-"),
		BtnClear = new Button("CLEAR"),
		BtnFactorial = new Button("n!");
	
	TextField
		txtWin = new TextField();
	String n="", n1st, n2st;
	int n1, n2;
	String operator = new String();
	
	public void init(){
		setLayout(null);
		int top =  100;
		int left = 50;
		int edge = 60;
		int width = edge;
		int height = edge;
		int gap = 20;
		int wide = width * 2 + gap;
		txtWin.setBounds(left, 20, 300, 70); add(txtWin);
		
		Button [] Btns = {Btn7,Btn8, Btn9, BtnAdd,
						  Btn4, Btn5, Btn6, BtnMinus,
						  Btn1, Btn2, Btn3, BtnMul,
						  Btn0, BtnEqual, null, BtnDivd,
						  BtnNeg, BtnClear, null, BtnFactorial};
		
		for(int i = 0; i<Btns.length; i++){
			int col = i%4;
			int row = i/4;
			if(Btns[i]!=null){
				
				Btns[i].setSize(width, height);
				Btns[i].setLocation((left+(width+gap)*col), top+(height+gap)*row);
				add(Btns[i]);
				Btns[i].addActionListener(this);
			}
			
		}
		BtnEqual.setSize(wide,height);
		BtnClear.setSize(wide,height);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button [] BtnNum = {Btn0, Btn1, Btn2, Btn3, 
				  		  Btn4, Btn5, Btn6,  
				  		  Btn7, Btn8, Btn9 };
		
		boolean function = true;
		for(int i = 0; i<BtnNum.length; i++){
			if(e.getSource() == BtnNum[i]){
				n+=i; txtWin.setText(n);
				function = false;
			}
		}
		if(function){
			if(e.getSource() == BtnAdd){
				n=txtWin.getText().trim();
				n1 = Integer.parseInt(n);
				txtWin.setText("");
				n="";
				operator = " + ";
				/*n+=" + ";
				txtWin.setText(n);
				n2 = Integer.parseInt(n); n = "";
				n1st = Integer.toString(n1);
				n2st = Integer.toString(n2);*/
				
				
			}else if(e.getSource() == BtnAdd){
				n=txtWin.getText().trim();
				n1 = Integer.parseInt(n);
				txtWin.setText("");
				n="";
				operator = " + ";
			}else if(e.getSource() == BtnMinus){
				n=txtWin.getText().trim();
				n1 = Integer.parseInt(n);
				txtWin.setText("");
				n="";
				operator = " - ";
			}else if(e.getSource() == BtnMul){
				n=txtWin.getText().trim();
				n1 = Integer.parseInt(n);
				txtWin.setText("");
				n="";
				operator = " * ";
			}else if(e.getSource() == BtnDivd){
				n=txtWin.getText().trim();
				n1 = Integer.parseInt(n);
				txtWin.setText("");
				n="";
				operator = " / ";
			}else if(e.getSource() == BtnNeg){
				n=txtWin.getText().trim();
				if(n.charAt(0)=='-'){
					
					n = n.substring(1);
				}else{
					n = "-"+n;
				}
				txtWin.setText(n);
			}else if(e.getSource() == BtnFactorial){
				n=txtWin.getText().trim();
				n1 = Integer.parseInt(n);
				//txtWin.setText("");
				n+="!";
				txtWin.setText(n);
				operator = "!";
			}else if(e.getSource() ==BtnEqual){
				if(operator != "!"){
				
					n = txtWin.getText().trim();
					n2 = Integer.parseInt(n); n="";
					n1st = Integer.toString(n1);
					n2st = Integer.toString(n2);
					
					if(operator == " + "){
						txtWin.setText(n1st + operator + n2st + " = " + Integer.toString(n1+n2));
					}else if(operator == " - "){
						txtWin.setText(n1st + operator + n2st + " = " + Integer.toString(n1-n2));
						
					}else if(operator == " * "){
						txtWin.setText(n1st + operator + n2st + " = " + Integer.toString(n1*n2));
						
					}else if(operator == " / "){
						txtWin.setText(n1st + operator + n2st + " = " + Double.toString(n1/(double)n2));
						
					}
				}else{
					n = txtWin.getText().trim();
					n1st = Integer.toString(n1);
					txtWin.setText(n + " = " + Integer.toString(factorial(n1)));
				}
			}
			
			else if(e.getSource() == BtnClear){
				txtWin.setText(""); n="";
				txtWin.requestFocus();
			}
		}
		
		
		
		
	}
	int factorial(int val){
		if(val==1) return val;
		return val * factorial(val-1);
	}
	

}
