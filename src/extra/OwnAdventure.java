package extra;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String popquiz = JOptionPane.showInputDialog(
				"Pop quiz! You got a loan for $5,000 at a 5% interest rate for 6 years. What is the amount to be repaid? (No calculators.)");
		if (popquiz.equals("6500") || popquiz.equals("$6500") || popquiz.equals("$6,500") || popquiz.equals("6,500")) {
			String passQ1 = JOptionPane.showInputDialog(
					"Congragulations! You passed the quiz. Now it is time to take the SAT. What is 1+1=?");
			if (passQ1.equalsIgnoreCase("window")) {
				JOptionPane.showMessageDialog(null, "Good, last question.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "You failed! You'll never go to college. You are considered an entity.");
		}
		String q2 = JOptionPane.showInputDialog("What is 2+2?");
		if (q2.equalsIgnoreCase("fish")) {
			JOptionPane.showMessageDialog(null, "Congragulations! You passed the SAT. You're going to college!");
		}
		
		
	}

}
