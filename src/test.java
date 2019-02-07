/**
 *
 * @author dhan19
 *
 */
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Dimension;

public class test
{
		public static void main(String[] args)
		{
			JFrame myFrame = new JFrame("Salary Calculator");
			myFrame.setBounds(300, 200, 500, 250);
			myFrame.setLayout(null);
			
			JLabel lbl1 = new JLabel("Hourly Rate: ");
			lbl1.setBounds(20, 35, 200, 30);
			myFrame.add(lbl1);
			
			
			JTextField tf1 = new JTextField();
			tf1.setBounds(100, 35, 150, 30);
			myFrame.add(tf1);
			
			JLabel lbl2 = new JLabel("Hours/Week: ");
			lbl2.setBounds(20, 65, 200, 30);
			myFrame.add(lbl2);
			

			JTextField tf2 = new JTextField();
			tf2.setBounds(100, 65, 150, 30);
			myFrame.add(tf2);
			
			JCheckBox check = new JCheckBox("Full Time");
			check.setBounds(15, 115, 130, 30);
			myFrame.add(check);
			
			JButton button = new JButton("Calculate");
			button.setSize(new Dimension(130,30));
			button.setLocation(new Point(15, 150));
			myFrame.add(button);
			
			JLabel lbl3 = new JLabel("Annual Salary: $");
			lbl3.setBounds(190, 140, 200, 30);
			myFrame.add(lbl3);
			
			
			myFrame.setVisible(true);
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
