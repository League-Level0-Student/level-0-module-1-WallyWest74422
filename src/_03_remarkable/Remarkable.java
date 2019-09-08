package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Arshia = "cool";
String Ashay = "great";
String Darren = "nice";
String Devin  = "helpful";
String Andrew = "creative";
		// 2. Ask the user to enter a name. Store their answer in a variable.
 String answer=  JOptionPane.showInputDialog("What is your name?");
if(answer.equalsIgnoreCase("Arshia")) {
	JOptionPane.showMessageDialog(null, "You are very " + Arshia);}
else if(answer.equalsIgnoreCase("Ashay")) {
	JOptionPane.showMessageDialog(null, "You are very " + Ashay);}
else if(answer.equalsIgnoreCase("Andrew")) {
	JOptionPane.showMessageDialog(null, "You are very " + Andrew);}
else if(answer.equalsIgnoreCase("Darren")) {
	JOptionPane.showMessageDialog(null, "You are very " + Darren);}
else if(answer.equalsIgnoreCase("Devin")) {
	JOptionPane.showMessageDialog(null, "You are very " + Devin);}
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

