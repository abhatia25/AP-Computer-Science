import javax.swing.*;
import java.awt.Dimension;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards cards = new Cards();
		//ElevensBoard board = new ElevensBoard();
		JFrame testframe = new JFrame("FrameTest");
		//board.FrameInitialize();
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
        
        
		for (int i = 0; i < 11; i++) {
			String card = cards.RandomCard();
			ImageIcon ii = new ImageIcon("/Volumes/ADITYA_USB/AP-Computer-Science/Elevens v3/cards/" + card + ".png");
	        JLabel lable = new JLabel(ii);
	        JScrollPane jsp = new JScrollPane(lable);
	        testframe.getContentPane().add(jsp);
	        testframe. setSize(1000, 700);
	        JButton button = new JButton();
	        button.setSize(new Dimension(5, 5));
	        button.setLocation(500, 350);
	        testframe.getContentPane().add(button);
		}
	}

}
