package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answerone =JOptionPane.showInputDialog("Forward, I am heavy. Backward, I am not. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answerone.equalsIgnoreCase("ton")) {
JOptionPane.showMessageDialog(null, "Correct!");
score++;
		// 5. Otherwise, say "wrong" and tell them the answer
}else {JOptionPane.showMessageDialog(null, "Wrong. The answer was ton");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
JOptionPane.showMessageDialog(null, "Your score is " + score );}
	}
}

