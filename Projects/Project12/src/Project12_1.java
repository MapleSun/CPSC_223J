import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Project12_1 extends Applet implements ActionListener {
	Label 
		title = new Label("Macy's Department Store"),
		firstL = new Label("Shoes on sale                  choose / return                       Your Shopping Cart"),
		//cr = new Label(""),
		//shoppingCart = new Label(""),
		report = new Label("Report");
	
	List
		shoesList = new List(),
		shoppingCartList = new List(),
		reportList = new List();
	
	Button
		issue = new Button("Issue Report"),
		choose = new Button(">>>"),
		ret = new Button("<<<");
	
	Image img;
	
	CheckboxGroup cbg = new CheckboxGroup();
	
	// color box
	Checkbox
		opRed = new Checkbox("Red",cbg, true),
		opBlack = new Checkbox("Black",cbg,false),
		opBrown = new Checkbox("Brown",cbg,false);
	
	String[] pic = {"winter", "sandals","boots","sneakers","Calf","Alaskan","Lucky"};
	
	String[] shoesName = {"Winter Shoes", "Sandals","Boots","Sneakers",
			"Calf boots", "Alaskan boots", "Luckt brand"
	};
	
	String[] price = {"$100.25","$75.99","$55.50","$23.99",	"$69.99","$85.50","$220.9"};
	
	int i = 0;

	
	public void init(){
		
		//Graphics g = new Graphics();
		setLayout(null);
		resize(600,400);
		title.setBounds(220,10,200,20); add(title);

		// first level
		firstL.setBounds(50,50,500,20); add(firstL);
		
		/*String[] shoesName = {"Winter Shoes    $100.25", "Sandals     $75.99","Boots     $55.50","Sneakers   $23.99",
					"Calf boots   $69.99", "Alaskan boots   $85.50", "Luckt brand   $220.9"
		};*/
		
		
		
		shoesList.setFont(new Font("Courier", 0, 12));
		for(int i = 0; i<shoesName.length;i++){
			shoesList.add(shoesName[i] +" "+price[i]);
		}
		
		shoesList.setBounds(25,75,160,300); add(shoesList);
		shoesList.select(0);
		shoesList.addActionListener(this);
		
		choose.setBounds(190,75,70,20); add(choose);
		ret.setBounds(260,75,70,20); add(ret);
		
		img = getImage(getDocumentBase(),"../image/winter.jpg");
		
		opRed.setBounds(190,300,60,20); add(opRed);
		opBlack.setBounds(250,300,70,20); add(opBlack);
		opBrown.setBounds(320,300,80,20); add(opBrown);
		
		issue.setBounds(210,320,120,40); add(issue);
		shoppingCartList.setBounds(375,75,200,90); add(shoppingCartList);
		
		
		report.setBounds(430,175,80,20); add(report);
		reportList.setBounds(375,200,200,90); add(reportList);
		
		// Listener
		//shoesList.addActionListener(null);
		choose.addActionListener(this);
		ret.addActionListener(this);
		issue.addActionListener(this);
		
	}
	
	public void paint(Graphics g){
		g.drawImage(img,190,110,170,180,this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		img = getImage(getDocumentBase(), "../image/"+pic[shoesList.getSelectedIndex()]+".jpg");
		repaint();
		
		
		String shoeType, color, shoeprice, shoppingCart, line;
		double totalPrice = 0.0;
		
		if(opRed.getState()){
			color = "Red";
		}else if(opBlack.getState()){
			color = "Black";
		}else{
			color = "Brown";
		}
		
		if(e.getSource() == choose){
			int index = shoesList.getSelectedIndex();
			shoeType = shoesName[index] ;
			shoeprice = price[index];
			line = shoeType + "\t" + shoeprice+ "\t" + color;
			shoppingCartList.add(line);
		}else if(e.getSource() == ret){
			shoppingCartList.remove(shoppingCartList.getSelectedIndex());
		}else if(e.getSource() == issue) {
			for(int i = 0; i< shoppingCartList.getItemCount(); i++){
				String [] shoes = shoppingCartList.getItem(i).split("\t",3);
				String newLine = shoes[0] + "\t" + shoes[1];
				reportList.add(newLine);
				totalPrice += Double.valueOf(shoes[1].substring(1));
			}
			line = "Total Bill" + "\t$" + totalPrice;
			reportList.add(line);
			
		}
		
	}
	
	
}

