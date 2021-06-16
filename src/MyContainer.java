import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class MyContainer extends MyComponent {
	protected ArrayList<MyComponent> compList;

	public MyContainer() {
		compList = new ArrayList<>();
	}

	public void add(MyComponent c) {
		compList.add(c);
	}

	public ArrayList<MyComponent> getList() {
		return compList;
	}

	@Override
	public void draw(Graphics g) {

	}

	@Override
	public void isClicked(Point p) {
		super.isClicked(p);
		for (MyComponent it : compList) {
			it.isClicked(p);
		}
	}
}
