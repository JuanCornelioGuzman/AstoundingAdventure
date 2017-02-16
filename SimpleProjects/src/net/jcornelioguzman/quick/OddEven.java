<<<<<<< HEAD
package net.jcornelioguzman.quick;

import java.io.IOException;

import javax.swing.JOptionPane;

public class OddEven {
	public static void main(String agrs[]) throws IOException {
		String s;
		int i;
		s = JOptionPane.showInputDialog(null, "Enter a Number: ");
		i = Integer.parseInt(s);
		if (i % 2 == 0)
			JOptionPane.showMessageDialog(null, "the number is even " + i);
		else
			JOptionPane.showMessageDialog(null, "the number is odd " + i);
	}
=======
package net.jcornelioguzman.quick;

import java.io.IOException;

import javax.swing.JOptionPane;

public class OddEven {
	public static void main(String agrs[]) throws IOException {
		String s;
		int i;
		s = JOptionPane.showInputDialog(null, "Enter a Number: ");
		i = Integer.parseInt(s);
		if (i % 2 == 0)
			JOptionPane.showMessageDialog(null, "the number is even " + i);
		else
			JOptionPane.showMessageDialog(null, "the number is odd " + i);
	}
>>>>>>> 9184d66d7c071cc3cddb2112ef94d5856997cfa5
}