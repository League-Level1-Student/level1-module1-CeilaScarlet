import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz implements ActionListener {
	//member variable
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	JTextField tf = new JTextField(5);
	JButton one = new JButton();
	JButton two = new JButton();
	Quiz(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    frame.setVisible(true);
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		panel.add(tf);
		one.setText("Greet");
		two.setText("Goodbye");
		one.addActionListener(this);
		two.addActionListener(this);
		frame.pack();
	}
	
public static void main(String[] args) {
    Quiz qz = new Quiz();
	
	
	
		
	
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String text = tf.getText();
	
	if (arg0.getSource()==one) {
		JOptionPane.showMessageDialog(null, "Hello "+ text + "!");
	}
	if (arg0.getSource()==two) {
		JOptionPane.showMessageDialog(null, "Goodbye "+ text);
	}
}
}
