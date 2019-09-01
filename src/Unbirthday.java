import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Please enter your birthday (mm/dd)");
	if(input.equals("09/01")){
	JOptionPane.showMessageDialog(null, "Happy Birthday! :)");
}
else {
	JOptionPane.showMessageDialog(null, "Have a merry UNbirthday!");
}}}
