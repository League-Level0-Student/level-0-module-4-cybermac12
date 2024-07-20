package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickelss = JOptionPane.showInputDialog("how many nickels do you have");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickels = Integer.parseInt(nickelss);
		// Ask the user how many dimes they have, and convert their answer
		String dimess = JOptionPane.showInputDialog("how many dimes do you have");
		int dimes = Integer.parseInt(dimess);
		// Ask the user how many quarters they have, and convert their answer
		String quarterss = JOptionPane.showInputDialog("how many quarters do you have");
		int quarters = Integer.parseInt(quarterss);
		// Calculate how much money the user has.  Hint: Use a double variable 
		System.out.println(nickels * .05); 
		System.out.println(dimes * .1);
		System.out.println(quarters * .25);
		System.out.println(nickels + dimes + quarters);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, nickels + dimes + quarters );
	}
}

