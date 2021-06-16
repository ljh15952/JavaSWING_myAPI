import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintFrame extends MyFrame {

	public PaintFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 900);
		
		PaintPanel panel = new PaintPanel();
		setContentPane(panel);
		
		for(int i = 0; i < 12; i++) {
			MyButton b = new MyButton("Bt" + i);
			b.setBounds(0 + (60 * i), 0 + (60 * i), 50, 50);
			panel.add(b);
		}
//		panel.setLayout(null);
	//	panel.setLayout(new MyFlowLayout());
		panel.setLayout(new MyGridLayout(3, 4));
		/*
		 * 버튼으로 바뀌게
		 * super.setLayout(null);
		 * MyButton button1 = new MyButton("그리드");
		 * MyButton button2 = new MyButton("플로우");
		 * button1.setBound(100,100,100,100);
		 * button2.setBound(200,100,100,100);
		 * super.setLayout(new FlowLayout());
		 * super.setLayout(new GridLayout(3,4));
		 * super.add(button1);
		 * super.add(button2);
		 * 	toolBar.add(releaseGroupBtn);
		 * 	add(toolBar, BorderLayout.WEST);
		 */
	}
}
