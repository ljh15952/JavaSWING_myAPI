import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public abstract class MyComponent {
	protected String label;
	protected Point position;
	protected Point size;
	protected boolean isVisible = false;
	private ArrayList<MyActionListener> _myListenerList = new ArrayList<>();

	public void setBounds(int i, int j, int k, int l) {
		position = new Point(i, j);
		size = new Point(k, l);
	}

	public abstract void draw(Graphics g);

	public Boolean contains(Point p) {
		if (position.x <= p.x && position.y <= p.y && size.x + position.x >= p.x && size.y + position.y >= p.y) {
			return true;
		}
		return false;
	}

	public void addListener(MyActionListener btnListener) {
		_myListenerList.add(btnListener);
	}

	public void ClickEvent() {
		for (MyActionListener it : _myListenerList) {
			it.actionPerformed(new MyEvent(label, position, this));
		}
	}

	public void isClicked(Point point) {
		if (contains(point))
			ClickEvent();
	}
}
