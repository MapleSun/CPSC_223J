import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Final1 extends Applet implements ActionListener{
	Label
		title = new Label("Avis Rent a Car"),
		lblSubtitle = new Label("Type of Cars"),
		lblCompact =  new Label("Subcompacts (Hyundai Accent or similar). $24.95/day                                  Selected Car"),
		lblInter = new Label("Intermediate (Chev. Cruze or similiar). $30.95/day"),
		lblFull = new Label("Full Size (Chrysler, Impala or similar). $35.95/day"),
		lblDay = new Label("Number of days(1-7)");
		//lblSelected = new Label("Selected Car");
	
	Button
		btnNext1 = new Button("Next Car>>"),
		btnRes1 = new Button("Reserve"),
		btnNext2 = new Button("Next Car>>"),
		btnRes2 = new Button("Reserve"),
		btnNext3 = new Button("Next Car>>"),
		btnRes3 = new Button("Reserve"),
		btnReport = new Button("Press to see report");
	
	Choice
		Number = new Choice();
	
	Image
		imgSub, imgInter, imgFull,
		sSub,sinter,sFull;
	
	TextArea
		report = new TextArea();
	String[] cars={"Totyota", "Hyundai", "菲亚特","Corolla", "Hyundai", "Mazda", "Buick", "Nissan", "Honda"};
	Label[] lbls = {lblCompact, lblInter,lblFull};
	String[] type = {"sub", "inter", "full"};
	Image[] imgs = {imgSub, imgInter, imgFull};
	Image[] res = {sSub,sinter,sFull};
	Button[] btns = {btnNext1,btnRes1, btnNext2,btnRes2, btnNext3,btnRes3};
	int img1w = 250;
	int img1h = 150;
	int interval = 180; 
	
	int current1=0, current2=0, current3=0;
	double price1 = 24.95, price2 = 30.95, price3 = 35.95; 
	int[] counts = {current1, current2, current3};
	double[] prices = {price1, price2, price3};
	
	String carType = null, numDays = null, line;
	int carModel = 0;
	double payment = 0;
	
 	public void init(){
		setLayout(null);
		resize(700,850);
		title.setBounds(270,20,100,20); add(title);
		lblSubtitle.setBounds(20,50,100,20); add(lblSubtitle);

		for(int i=0; i<3; i++){
			lbls[i].setBounds(20,80+i*interval,600, 20); add(lbls[i]);
			imgs[i] = getImage(getDocumentBase(),"../Image/" + type[i]+"1.jpg");
			
			btns[i*2].setBounds(img1w+30,110+i*interval,100,50); add(btns[i*2]);
			btns[i*2+1].setBounds(img1w+30,200+i*interval,100,50); add(btns[i*2+1]);
			btns[i*2].addActionListener(this);
			btns[i*2+1].addActionListener(this);
		}
		
		lblDay.setBounds(25,650,150,30); add(lblDay);
		Number.setBounds(25,680,150,30); add(Number);
		for(int i = 0; i<7; i++){
			Number.add(i+1 + "");
		}
		btnReport.setBounds(250, 680, 150, 50); add(btnReport);
		report.setBounds(450,680,200,150); add(report);
		btnReport.addActionListener(this);
	}
	
	
	
	public void paint(Graphics g){
		for(int i =0; i<3; i++){
			g.drawImage(imgs[i],20,110+i*interval,img1w,img1h,this);
			g.drawImage(res[i], 400,110+i*interval,img1w,img1h,this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++){
			if(e.getSource() == btns[i*2]){
				counts[i]++;
				imgs[i] = getImage(getDocumentBase(),"../Image/" + type[i] + (counts[i]%3+1) +".jpg");
				repaint();
			}
			
			if(e.getSource() == btns[i*2+1]){
				res[i] = getImage(getDocumentBase(),"../Image/" + type[i] + (counts[i]%3+1) +".jpg");
				res[(i+1)%3] = null;
				res[(i+2)%3] = null;
				
				
				carType = type[i];
				carModel = (i*3) + counts[i]%3;
				numDays = Number.getSelectedItem();
				payment = Integer.valueOf(numDays) * prices[i];
				repaint();
			}
			
		}
		
		
		
		if(e.getSource() == btnReport){
			line = "Car type: " +  carType + " Size\n"
					+ "Car Model: " + cars[carModel] + "\n"
					+ "No. of days: " + numDays + "\n"
					+ "Total Pay: " + payment;
			report.setText(line);
		}
		
	}
	
	
		
}
