package extra;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String popquiz = JOptionPane.showInputDialog("Pop quiz! You got a loan for $5000 at 5% interest rate for 6 years. What is the amount to be repaid? (No calculators.)");
		if (popquiz.equals("6500")||popquiz.equals("$6500")||popquiz.equals("$6,500")||popquiz.equals("6,500")) {
			String pass = JOptionPane.showInputDialog("Congragulations! You passed the quiz. Now it is time to take the SAT. What is 1+1=?");
			if (pass.equalsIgnoreCase("window")) {
				
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "You failed! You'll never go to college. Your socioeconomic status is now -999999999999999999999999999999999999999.");
		}

	}
	
}
