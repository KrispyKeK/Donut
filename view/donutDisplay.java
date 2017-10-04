package donut.view;
import javax.swing.*;
public class donutDisplay {
	public void displayText(String message) {
		//opens up a java window to display text
		JOptionPane.showMessageDialog(null, message);{
		}	
	}
	//this method gets the user's input and stores it into a variable
	public String getResponse(String fromQuestion) {
		String response = "";
		response += JOptionPane.showInputDialog(null, fromQuestion);
		return response;
	}
}
