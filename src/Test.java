import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Test extends JFrame implements ActionListener
{
	JComboBox Mobiles,Submobiles;
	Object[] Phones= {"Android","Iphone"};
	public Test()
	{
		super("Mobile Phone");
		setLayout(null);
		setResizable(false);
		setVisible(true);
		setSize(300, 400);
		Mobiles=new JComboBox(Phones);
		Submobiles=new JComboBox();
		add(Mobiles);
		add(Submobiles);
		Mobiles.addActionListener(this);
		Mobiles.setBounds(30,40,100,30);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Mobiles)
		{
			//JOptionPane.showMessageDialog(this, Mobiles.getItemAt(Mobiles.getSelectedIndex()));//
			//switch()
		}
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		

	}

}
