import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;

public class wifiPassword extends JFrame implements ActionListener
{

	private static final long serialVersionUID = 1L;
	static String newPassword = "";
	private static JRadioButton rad1;
	private static JRadioButton rad2;
	private static  JLabel textLabel = new JLabel("Click Create!",SwingConstants.CENTER); 

	public wifiPassword()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 		
		this.setSize(420, 150); 
		textLabel.setFont(new Font("Serif", Font.PLAIN, 28));
		this.setTitle("Wifi Password Generator"); 
		((JPanel) getContentPane()).setBorder(new EmptyBorder(10, 10, 0, 10) );
		this.setLocationByPlatform(true);
		this.setResizable(false);

		JLabel instructions;
		instructions = new JLabel("Pick either 10 or 16 characters and click Create.");
		this.getContentPane().add(instructions, BorderLayout.NORTH);

		JButton createPassword;
		createPassword = new JButton("Create");
		createPassword.setActionCommand("myButton");
		createPassword.addActionListener(this);
		this.getContentPane().add(createPassword, BorderLayout.SOUTH);

		rad1 = new JRadioButton("10");
		rad1.setActionCommand("rad1");
		rad1.addActionListener(this);
		rad1.setSelected(true);
		this.getContentPane().add(rad1, BorderLayout.WEST);

		rad2 = new JRadioButton("16");
		rad2.setActionCommand("rad2");
		rad2.addActionListener(this);
		this.getContentPane().add(rad2, BorderLayout.EAST);

		add(textLabel);

		this.setVisible(true);
	}


	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("myButton"))
		{	
			password.create();		
			textLabel.setText(newPassword);
		}

		if (e.getActionCommand().equals("rad1"))
		{
			rad1.setSelected(true);			
			password.num = 10;
			rad2.setSelected(false);
		}

		if (e.getActionCommand().equals("rad2"))
		{
			rad2.setSelected(true);
			password.num = 16;
			rad1.setSelected(false);
		}
	}

	public static void main(String[] args)
	{
		new wifiPassword();
	}
}