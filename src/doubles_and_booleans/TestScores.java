package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String score = JOptionPane.showInputDialog("What is your test score?");
double intscore = Double.parseDouble(score);
if (intscore>=90) {
	JOptionPane.showMessageDialog(null, "You got an A. You did awesome!");
}
else if (intscore>=80) {
	JOptionPane.showMessageDialog(null, "You got a B. You did good.");
}
else if (intscore>=70) {
	JOptionPane.showMessageDialog(null, "You got a C. You did bad.");
}
else if (intscore>=60) {
	JOptionPane.showMessageDialog(null, "You got a D. You did terrible!");
}
else if (intscore>=0) {
	JOptionPane.showMessageDialog(null, "You got an F. You failed!");
}
	}

}
