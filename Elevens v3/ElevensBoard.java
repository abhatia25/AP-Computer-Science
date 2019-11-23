import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

public class ElevensBoard {
	public static JFrame testframe = new JFrame("FrameTest");
	public static void FrameInitialize() {
		testframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("commands");
		JMenuItem exit = new JMenuItem("exit");
		menu.add(exit);
		exit.setActionCommand("exit");
		menubar.add(menu);
		testframe.setJMenuBar(menubar);
		testframe.pack();
		testframe.setVisible(true);
	}
	
	public static void Images (List<String> cardIn) {
		for (int i = 0; i < 11; i++) {
			String card = cardIn.get(i);
			ImageIcon ii = new ImageIcon("/Volumes/ADITYA_USB/AP-Computer-Science/Elevens v3/cards/" + card + ".png");
	        JLabel lable = new JLabel(ii);
	        JScrollPane jsp = new JScrollPane(lable);
	        testframe.getContentPane().add(jsp);
	        testframe.setSize(1000, 700);
	        JButton button = new JButton();
	        button.setSize(new Dimension(5, 5));
	        testframe.getContentPane().add(button);
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
	    if ("exit".equals(e.getActionCommand())) {
	        testframe.setVisible(false);
	    }
	}
	
}
