package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickle = JOptionPane.showInputDialog("How manuy nickles do you have???");
		int nickles = Integer.parseInt(nickle);
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("How manuy dimes do you have???");
		int dimes = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
		String quarter = JOptionPane.showInputDialog("How manuy quarters do you have???");
		int quarters = Integer.parseInt(quarter);
		String penny = JOptionPane.showInputDialog("How manuy pennies do you have???");
		int pennies = Integer.parseInt(penny);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double nickless = nickles * .05;
		double dimess = dimes * .1;
		double quaterss = quarters * .25;
		double penniess = pennies * .01;
		double total1 = nickless + dimess +quarters+pennies ;
		
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "You have $" +total1);
	}
}

