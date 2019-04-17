package extra;

import javax.swing.JOptionPane;

public class Checkpoint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String flour = JOptionPane.showInputDialog("How cups of flour do you have?");
int flournum = Integer.parseInt(flour);
if(flournum<2) {
	JOptionPane.showMessageDialog(null, "Go to the store and buy some more.");
}
String friends = JOptionPane.showInputDialog("How many people are you giving cookies to?");
int friendsnum = Integer.parseInt(friends);
if (friendsnum>30) {
	JOptionPane.showMessageDialog(null, "You will have to bake two batches of cookies!");
}
String batches = JOptionPane.showInputDialog("How many batches of cookies have you baked?");
int batchesnum = Integer.parseInt(batches);
if(batchesnum==2) {
	JOptionPane.showMessageDialog(null, "You are lucky to have so many friends.");
}
	}

}
