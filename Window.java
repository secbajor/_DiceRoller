import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener{
	//Global components 
	JTextField numRolls; 
	JButton d6, d20; 
	JLabel lnumRolls; 
	
	Random rand = new Random();
	int maxVal; 
	int roll; 
	
	Window(String title){
		super(title); 
		this.init(); 
		this.setSize(300,110); 
		this.setVisible(true); 
	
	}//end constructor
	
	void init(){
		JPanel panel = new JPanel(); 
		lnumRolls = new JLabel("Enter the # of rolls to make: ");
		numRolls = new JTextField(10); 
		d6 = new JButton("d6"); 
		d20 = new JButton("d20"); 
	
		panel.add(lnumRolls); 
		panel.add(numRolls); 
		panel.add(d6); 
		panel.add(d20); 
		
		d6.addActionListener(this);
		d20.addActionListener(this);
		
		this.add(panel); 
	}//end void 
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==d6)
		{
			maxVal = 6; 
			String sNum = numRolls.getText(); 
			int num = Integer.parseInt(sNum);
			
			while(num>0)
			{
				roll = rand.nextInt(maxVal)+1;
				JOptionPane.showMessageDialog(null,"You have rolled: "+roll, "Dice Roll", JOptionPane.INFORMATION_MESSAGE);
				num--; 
			}
			
		}
	}
	
}//end class