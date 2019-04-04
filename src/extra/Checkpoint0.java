package extra;



import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.jointheleague.graphical.robot.RobotImage;

public class Checkpoint0 {
public static void main(String[] args) {
String color = JOptionPane.showInputDialog("What is your favorite color?");
JOptionPane.showMessageDialog(null, color + " is also my favorite color.");
Robot rob = new Robot();
rob.penDown();
rob.setSpeed(100);
rob.setPenWidth(5);
rob.turn(90);
for (int i = 0; i <3; i++) {
	rob.move(100);
	rob.turn(-120);
}
rob.hide();
}
}
