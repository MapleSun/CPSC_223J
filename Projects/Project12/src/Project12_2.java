import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class Project12_2 extends Applet implements ActionListener {
	
	Calendar c = Calendar.getInstance();
	
	int day = c.get(Calendar.DATE);
	int month = c.get(Calendar.MONTH);
	int year = c.get(Calendar.YEAR);
	
	Label 
		title = new Label("Practing addition"),
		lblDate = new Label("Today's date: " + month +"/"+day+"/"+year),
		lblNum = new Label("Select the number of questions: "),
		lblQues = new Label(),
		lblMsg = new Label("A Message from the Institution"),
		lblReport = new Label("Report"),
		lblResult = new Label("result");

	Image Face, Img;
	
	Button 
		btnStart = new Button("Click to start"),
		btnNext = new Button("Press for next question");
	
	CheckboxGroup cbg = new CheckboxGroup();
	
	Checkbox
		Q5 = new Checkbox("5",cbg, true),
		Q10 = new Checkbox("10",cbg,false);
	
	TextArea 
		comment = new TextArea(),
		report = new TextArea();
	
	TextField
		answer = new TextField();
		
	List
		Message = new List();
	
	int Correct=0,Wrong=0;
	int rn1,rn2,result,questionNum = 1;
	int ques;
	public void init(){
		setLayout(null);
		resize(600,400);
		title.setFont(new Font("Courier", Font.BOLD, 16));
		title.setBounds(200,20,200,30); add(title);
		
		// Calendar
		lblDate.setBounds(30,50,200,20); add(lblDate);
		
		// Question Number
		lblNum.setBounds(30,80,210,20); add(lblNum);
		Q5.setBounds(240,80,50,20); add(Q5);
		Q10.setBounds(290,80,60,20); add(Q10);
		
		
		//
		Img = getImage(getDocumentBase(),"../image/school.jpg");
		
		// action listener
		btnStart.setBounds(70,110,120,50);add(btnStart);
		btnNext.setBounds(400,180,180,40);add(btnNext);
		btnStart.addActionListener(this);
		btnNext.addActionListener(this);
		lblQues.setBounds(30,180,170,20); add(lblQues);
		
		answer.setBounds(200,180,40,20); add(answer);
		lblResult.setBounds(250,180,80,20); add(lblResult);
		
		lblMsg.setBounds(55,210,200,20); add(lblMsg);
		
		comment.setBounds(40,250,180,120); add(comment);
		
		Face=getImage(getDocumentBase(),"../image/face.png");
		
		
		lblReport.setBounds(460,230,100,20); add(lblReport);
		
		report.setBounds(400,250,180,120); add(report);
		
		
	}
	
	public void paint(Graphics g){
		g.drawImage(Img, 400, 50, 180, 120, this);
		if(Correct/(double)ques > 0.5){
			g.drawImage(Face,230, 250, 150, 100, this);
		}
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		long currentTime = 0;
		Date d1 = new Date();
		Calendar c = Calendar.getInstance();
		if(Q5.getState()){
			ques = 5;
		}else{
			ques = 10;
		}
		if(e.getSource() == btnStart){
			questionNum = 1;
			currentTime=d1.getTime();
			rn1 = (int)(Math.random()*100);
			rn2 = (int)(Math.random()*100);
			result =rn1 + rn2;
			lblQues.setText("Question No." + questionNum + "  " + rn1 + "+" + rn2 + "=?");
		}else if(e.getSource() == btnNext && questionNum <= ques){
			
			if(Integer.valueOf(answer.getText()) == result){
				lblResult.setText("CORRECT");
				Correct++;
			}else{
				lblResult.setText("WRONG");
				Wrong++;
			}
			answer.setText("");
			rn1 = (int)(Math.random()*100);
			rn2 = (int)(Math.random()*100);
			result =rn1 + rn2;
			questionNum++;
			lblQues.setText("Question No." + questionNum + "  " + rn1 + "+" + rn2 + "=?");
			
			
		}
		
		if(questionNum == ques+1){
			long finishTime = d1.getTime();
			if(Correct/(double)ques > 0.5){
				comment.setText("Very Good! Keep up the good work");
				Face = getImage(getDocumentBase(),"../image/face.png");
				repaint();
			}else{
				comment.setText("Don't give up. Keep trying");
			}
			
			long diff = finishTime - currentTime;
			report.setText("Duration: " + diff/1000%60 + " seconds"
			+"\nNo. of CORRECTs: " + Correct
			+"\nNo. of WRONGs: " + Wrong);
		}
		
		
	}

	
}