package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BinaryConverter implements ActionListener {
public static void main(String[] args) {
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
    JTextField answer = new JTextField(20);
	JButton Button = new JButton();
  
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
    panel.add(answer);
    panel.add(Button);
    Button.addMouseListener(null);
	frame.setVisible(true);
   

	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
String convert(String answer) {
    if(answer.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!answer.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(answer, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
}
