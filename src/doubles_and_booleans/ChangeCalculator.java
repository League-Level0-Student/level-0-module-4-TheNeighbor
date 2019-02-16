package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String strNickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(strNickels);
		// Ask the user how many dimes they have, and convert their answer
String strDimes = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes = Integer.parseInt(strDimes);
		// Ask the user how many quarters they have, and convert their answer
String strQuarters = JOptionPane.showInputDialog("How many quarters do you have?");
int quarters = Integer.parseInt(strQuarters);
		// Calculate how much money the user has and save it in a double variable 
double intNickels = (double)nickels * .05;
double intDimes= (double)dimes * .10;
double intQuarters = (double)quarters * .25;
		// Tell the user how much money they have
double total = intNickels + intDimes + intQuarters;
JOptionPane.showMessageDialog(null, total);
	}
}

