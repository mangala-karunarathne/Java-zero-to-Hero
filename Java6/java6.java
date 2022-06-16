import javax.swing.JOptionPane;

public class java6 {
	
	public static void main(String args[])
	{
		String name = JOptionPane.showInputDialog("Hi, what's your Name... ?");
		
		JOptionPane.showMessageDialog(null , "Don't get Stress " + name);
	}
}