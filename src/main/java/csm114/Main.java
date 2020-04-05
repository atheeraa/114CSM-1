package csm114;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
            
//Program That Calculate The Perfect Weight

 class GUI extends JFrame{
				
			JPanel panels;
			JPanel pa1;
			JPanel pa2;
			JPanel pa3;
			JPanel pa4;
			JPanel pa5;
			JPanel pa6;
			
			
			//Labels
			JLabel l1=new JLabel("Calculate Your Perfect Weight",SwingConstants.CENTER);
			JLabel l2=new JLabel("Your Tall(in meters): ",SwingConstants.CENTER);
			JLabel l3=new JLabel("Your Weight: ",SwingConstants.CENTER);
			JLabel l4=new JLabel("Evaluate Us! ",SwingConstants.CENTER);
			
			//List
			String num[]= {"1","2","3","4","5"};
			JComboBox list=new JComboBox(num);
			
			//TextFields
			JTextField t1=new JTextField (10);
			JTextField t2=new JTextField (10);
			JTextField t3=new JTextField (10);
			
			//Icons 
			Icon sunicon =new ImageIcon("C:\\Users\\favor\\Desktop\\P2\\Project #2\\sun.PNG");
			Icon moonicon=new ImageIcon("C:\\Users\\favor\\Desktop\\P2\\Project #2\\moon.PNG");
	GUI(){
		
		 panels=new JPanel(new GridLayout(6,1));
		 pa1=new JPanel(new GridLayout(1,0));
		 pa2=new JPanel(new GridLayout(1,2));
		 pa3=new JPanel(new GridLayout(1,2));
		 pa4=new JPanel(new GridLayout(2,1));
		 pa5=new JPanel(new GridLayout(1,2));
		 pa6=new JPanel(new GridLayout(1,2));
		 
		
		 //Frame
		setTitle("Perfect Weight");
		setSize(700,700);
		
		
		//Container
		Container p=getContentPane();
		p.setForeground(Color.WHITE);
		
	
			//Buttons
			JButton b1=new JButton("Calculate");JButton b2=new JButton(sunicon);JButton b3=new JButton(moonicon);
			
			b1.addActionListener(new ActionListener() {
				public void actionPerformed (ActionEvent e) {
						if (t1.getText().isEmpty()&&t2.getText().isEmpty()||t1.getText().isEmpty()||t2.getText().isEmpty())
							JOptionPane.showMessageDialog(null, "Please Enter numbers!");
						else
							{ double n1=Double.parseDouble(t1.getText().toString());
						
						double n2= Double.parseDouble(t2.getText().toString());
						double result=n2/(n1*n1);
						t3.setText(Double.toString(result));
						{if (result<15)
							JOptionPane.showMessageDialog(null,"You have Severe weight loss!");
						else if (result<18.5&&result>16)
							JOptionPane.showMessageDialog(null,"You have weight loss!");
						else if (result<25&&result>18.5)
							JOptionPane.showMessageDialog(null,"Your weight is normal");
						else if (result>25&&result<30)
							JOptionPane.showMessageDialog(null,"You have weight gain!");
						else if(result>30)
							JOptionPane.showMessageDialog(null,"You have Significant weight gain!");
						}}}});
			
			
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
				    l1.setForeground(Color.BLUE);
				    l1.setBackground(Color.WHITE);
					l1.setOpaque(true);
					
					l2.setForeground(Color.CYAN);
					l2.setBackground(Color.WHITE);
					l2.setOpaque(true);
					
					l3.setForeground(Color.CYAN);
					l3.setBackground(Color.WHITE);
					l3.setOpaque(true);
					
					
					l4.setForeground(Color.CYAN);
					l4.setBackground(Color.WHITE);
					l4.setOpaque(true);
					
	
					
					panels.setBackground(Color.WHITE);
					pa1.setBackground(Color.WHITE);
					pa2.setBackground(Color.WHITE);
					pa3.setBackground(Color.WHITE);
					pa4.setBackground(Color.WHITE);
					pa5.setBackground(Color.WHITE);
					pa6.setBackground(Color.WHITE);

				}});
			
			
			b3.addActionListener( new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				l1.setForeground(Color.MAGENTA);
				l1.setBackground(Color.BLACK);
				l1.setOpaque(true);
				
				l2.setForeground(Color.YELLOW);
				l2.setBackground(Color.BLACK);
				l2.setOpaque(true);
				
				l3.setForeground(Color.YELLOW);
				l3.setBackground(Color.BLACK);
				l3.setOpaque(true);
				
				
				l4.setForeground(Color.YELLOW);
				l4.setBackground(Color.BLACK);
				l4.setOpaque(true);
				
				t1.setBackground(Color.LIGHT_GRAY);
				t2.setBackground(Color.LIGHT_GRAY);
				t3.setBackground(Color.LIGHT_GRAY);
				
				panels.setBackground(Color.BLACK);
				pa1.setBackground(Color.BLACK);
				pa2.setBackground(Color.BLACK);
				pa3.setBackground(Color.BLACK);
				pa4.setBackground(Color.BLACK);
				pa5.setBackground(Color.BLACK);
				pa6.setBackground(Color.BLACK);	
				}});
			
						
			
			
			//Panel1
			l1.setFont(new Font("TimesNewRomans",Font.BOLD,60));
			l1.setForeground(Color.BLACK);
			pa1.add(l1);
			panels.add(pa1);
			
			//Panel2
			l2.setFont(new Font("TimesNewRomans",Font.PLAIN,36));
			l2.setForeground(Color.BLACK);
			t1.setFont(new Font("TimesNewRomans",Font.PLAIN,20));
			t1.setForeground(Color.DARK_GRAY);
			pa2.add(l2);
			pa2.add(t1);
			panels.add(pa2);
			
	        //panel3
			l3.setFont(new Font("TimesNewRomans",Font.PLAIN,36));
			l3.setForeground(Color.BLACK);
			t2.setFont(new Font("TimesNewRomans",Font.PLAIN,20));
			t2.setForeground(Color.DARK_GRAY);
			pa3.add(l3);
			pa3.add(t2);
			panels.add(pa3);
			
	        //panel4
			b1.setFont(new Font("TimesNewRomans",Font.PLAIN,36));
			b1.setForeground(Color.BLACK);
			t3.setFont(new Font("TimesNewRomans",Font.PLAIN,20));
			t3.setForeground(Color.DARK_GRAY);
			pa4.add(b1);
			pa4.add(t3);
			panels.add(pa4);
			
			//panel5
			l4.setFont(new Font("TimesNewRomans",Font.PLAIN,36));
			l4.setForeground(Color.BLACK);
			pa5.add(l4);
			list.setFont(new Font("TimesNewRomans",Font.BOLD,36));
			pa5.add(list);
			panels.add(pa5);


			//panel6
			pa6.add(b2);
			pa6.add(b3);
			panels.add(pa6);

		
		
        p.add(panels);
        setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}



public class Main {
public static void main(String args[]) {
	GUI g=new GUI();
}
}

