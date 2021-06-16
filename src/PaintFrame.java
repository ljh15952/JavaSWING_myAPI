import javax.swing.JFrame;

public class PaintFrame extends MyFrame implements MyActionListener {

	public MyMenuBar menuBar;

	private MyMenu fileMenu;
	private MyMenu editMenu;
	private MyMenu helpMenu;

	private MyMenuItem loadItem;
	private MyMenuItem saveItem;
	private MyMenuItem exitItem;
	MyButton rectBtn;
	MyButton ovalBtn;
	MyButton lineBtn;

	public PaintFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 900);

		menuBar = new MyMenuBar();
		setMyMenuBar(menuBar);

		fileMenu = new MyMenu("File");
		editMenu = new MyMenu("Edit");
		helpMenu = new MyMenu("Help");

		loadItem = new MyMenuItem("Load");
		saveItem = new MyMenuItem("Save");
		exitItem = new MyMenuItem("Exit");

		loadItem.addListener(this);
		saveItem.addListener(this);
		exitItem.addListener(this);

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		MyToolBar toolBar = new MyToolBar();
		toolBar.setBounds(10, 100, 130, 500);
		add(toolBar);

		rectBtn = new MyButton("사각형");
		rectBtn.setBounds(100, 100, 50, 50);
		rectBtn.addListener(this);
		toolBar.add(rectBtn);

		ovalBtn = new MyButton("타원");
		ovalBtn.setBounds(100, 100, 50, 50);
		ovalBtn.addListener(this);
		toolBar.add(ovalBtn);

		lineBtn = new MyButton("선분");
		lineBtn.setBounds(100, 100, 50, 50);
		lineBtn.addListener(this);
		toolBar.add(lineBtn);
	}

	@Override
	public void actionPerformed(MyEvent e) {
		if (loadItem == e.getSource()) {
			System.out.println("LOAD FILE");
		} else if (saveItem == e.getSource()) {
			System.out.println("SAVE FILE");
		} else if (exitItem == e.getSource()) {
			System.exit(0);
		} else if (rectBtn == e.getSource()) {
			System.out.println("Click Rect Btn");
		} else if (ovalBtn == e.getSource()) {
			System.out.println("Click Oval Btn");
		} else if (lineBtn == e.getSource()) {
			System.out.println("Click Line Btn");
		}

	}

}