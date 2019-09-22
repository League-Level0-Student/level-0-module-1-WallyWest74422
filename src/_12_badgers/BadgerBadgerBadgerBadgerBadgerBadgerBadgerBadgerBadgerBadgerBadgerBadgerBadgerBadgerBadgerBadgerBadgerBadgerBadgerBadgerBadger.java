package _12_badgers;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class BadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadgerBadger {
public static void main(String[] args) {
	String sentence=JOptionPane.showInputDialog("I am Alexa What Can I do for You?");
	speak(sentence);
}

static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
}}