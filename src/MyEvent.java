import java.awt.Point;

public class MyEvent {
	private String _str;
	private Point _point;
	private MyComponent _btn;

	public MyEvent(String name, Point position, MyComponent b) {
		_str = name;
		_point = position;
		_btn = b;
	}

	public MyComponent getSource() {
		return _btn;
	}

	public String getSourceStr() {
		return _str;
	}
}
