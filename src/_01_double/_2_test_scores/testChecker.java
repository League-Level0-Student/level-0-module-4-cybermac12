package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testChecker {
	public static void main(String[] args) {
		String testScores = JOptionPane.showInputDialog("What did you get on your test");
		int testScore = Integer.parseInt(testScores));	
		if (testScore >= 100 ) {
			JOptionPane.showMessageDialog(null, "finilly some one usefull!" );
		}
		else if (testScore >= 94 ) {
			JOptionPane.showMessageDialog(null, "ok average" );
		}
		else if (testScore >= 90 ) {
			JOptionPane.showMessageDialog(null, "how did you get below an A you falure" );
		}
		else if (testScore >= 87 ) {
			JOptionPane.showMessageDialog(null, "when i was younger a b+ was a F " );
		}
		else if (testScore >= 84 ) {
			JOptionPane.showMessageDialog(null, "you are as smart as a baloni" );
		}
		else if (testScore >= 80) {
			JOptionPane.showMessageDialog(null, "the baloni in the fridge is smarter then you " );
		}
		else if (testScore >= 77 ) {
			JOptionPane.showMessageDialog(null, "Mom grabs belt..." );
		}
		else if (testScore >= 74 ) {
			JOptionPane.showMessageDialog(null, "what are you a cat" );
		}
		else if (testScore >= 70 ) {
			JOptionPane.showMessageDialog(null, "" );
		}
		else if (testScore >= 67 ) {
			JOptionPane.showMessageDialog(null, "I didn't even know you could get a D you falure" );
		}
		else if (testScore >= 64 ) {
			JOptionPane.showMessageDialog(null, "" );
		}
		else if (testScore >= 60 ) {
			JOptionPane.showMessageDialog(null, "you are the ultimite falure" );
		}
		else if (testScore >= 1 ) {
			JOptionPane.showMessageDialog(null, "i am disowning you" );
		}
		else if (testScore == 0 ) {
			JOptionPane.showMessageDialog(null, "you are homeless!!!!!" );
		}

	}
}
