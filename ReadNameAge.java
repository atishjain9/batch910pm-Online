

import javax.swing.*;

class ReadNameAge
{
	public static void main(String args[])
	{
		String name;
		int age;

		name=JOptionPane.showInputDialog("Enter ur Name:");
		age=Integer.parseInt(JOptionPane.showInputDialog("Enter ur Age:")); 

		JOptionPane.showMessageDialog(null,"Heyy "+name);
      JOptionPane.showMessageDialog(null,"Ur Age is: "+age);
	
	}
}