import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Final3 extends JFrame implements ActionListener{

    JFrame frame = new JFrame("Final3");
    JLabel
            lblNum = new JLabel("Enter the number of disks(<=7): ");
    JButton
            btnStart = new JButton("Press to start");
    TextField  tf = new TextField();
    //public static CustomDrawingPanel content;

    int num=0;

    private Graphics g;

    Stack<Disk> Peg1 = new Stack<>();
    Stack<Disk> Peg2 = new Stack<>();
    Stack<Disk> Peg3 = new Stack<>();
    Stack[] Pegs = {Peg1, Peg2, Peg3};

    int interval = 20;
    int gap = 10;
    int top = 370;


    public static void main(String args[]) {
        Final3 Hanoi = new Final3();
        Hanoi.createInterface();
    }

    public void createInterface(){
        frame.setLayout(null);
        frame.setSize(800,600);
        frame.setLocation(0,0);
        frame.setVisible(true );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cPane = frame.getContentPane();
        g = cPane.getGraphics();


        lblNum.setBounds(10, 10, 220, 30); frame.add(lblNum);
        tf.setBounds(250,10,30,30); frame.add(tf);
        btnStart.setBounds(300, 10, 150, 30); frame.add(btnStart);

        btnStart.addActionListener(this);
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        g.setColor(Color.DARK_GRAY);
        int width = 200;
        int height = 20;
        int left = 100;
        int top = 400;

        for(int i = 0; i<3; i++){

            g.fillRect(left + i*(width), top, width, height);
            //g.fillRect((left+width/2)+i*width, 200, 20, 200);

        }



    }


    public void CreateDisks(Graphics g, int Num){
        g.setColor(Color.BLUE);

        /* The Base width is 200. The largest disk's width is 180;
            The Base left is 100. The largest disk's left is 210
         */
        int maxwidth = 180;

        int height = 20;
        int maxleft = 120;


        for(int i = 0; i<num; i++){
            g.fillRect(maxleft + i*(interval/2), top - i*(gap+height), maxwidth - i * interval, height);
            Pegs[0].push(new Disk (maxleft + i*(interval/2), top - i*(gap+height), maxwidth - i * interval, height));
        }


    }


    public void clear(Graphics g, Disk item){
        g.clearRect(item.left,item.top, item.width,item.height);
    }

    public void draw(Graphics g, Disk item){
        g.fillRect(item.left,item.top, item.width,item.height);
    }


    public  void moveTo(int from, int to){
        System.out.println(Pegs[0]);
        Disk moved = (Disk) Pegs[from].pop();
        clear(g,moved);


        moved.left += (to-from) * 200;

        moved.top = top- Pegs[to].size()*(gap+moved.height);
        Pegs[to].push(moved);
        draw(g,moved);

        try {
            TimeUnit.MILLISECONDS.sleep(200); //.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public  void towerOfHanoi(int N, int from, int to, int temp){
        if(N==1)
            moveTo(from, to);
        else{
            towerOfHanoi(N-1, from, temp, to);
            moveTo(from, to);
            towerOfHanoi(N-1, temp, to, from);

        }
    }







    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == btnStart) {
            num = Integer.valueOf(tf.getText());
            Peg1 = new Stack<>();
            CreateDisks(g, num);
            towerOfHanoi(num,0,2,1);
        }


    }


}

/*
public static void towerOfHanoi(int N, int from, int to, int temp){
	if(N==1)
		moveTo(from, to);
	else{
		towerOfHanoi(N-1, from, temp, to);
		moveTo(from, to);
		towerOfHanoi(N-1, temp, to, from);

	}
}



public static void moveTo(int from, int to){
	System.out.println(from+"->" + to);
}
*/

