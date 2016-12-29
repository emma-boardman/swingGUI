import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private JButton btn;
	
	
	public MainFrame(){
		super("Hello World"); 
		// equivalent to new JFrame("")
		
		setLayout(new BorderLayout());
		
		textPanel = new TextPanel();
		btn = new JButton("Click me!");
		
		btn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
//				textPanel.append("Hello\n");
			}
			
			
		});
		
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
