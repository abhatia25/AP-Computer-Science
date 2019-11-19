import java.awt.*;
import java.awt.event.ActionEvent;

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
	
	public void actionPerformed(ActionEvent e) {
	    if ("exit".equals(e.getActionCommand())) {
	        testframe.setVisible(false);
	    }
	} 
	
}
