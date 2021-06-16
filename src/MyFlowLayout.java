import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

public class MyFlowLayout implements MyLayout {

	@Override
	public void sortPosition(MyContainer arr, Dimension size) {
		int y = 0;
		int plusX = 0;
		for (MyComponent it : arr.getList()) {
			it.setBounds(plusX, y, 50, 50);
			plusX += 100;
			if (plusX > size.width - it.size.x) {
				plusX = 0;
				y += 100;
			}
		}
	}

	@Override
	public void sortPosition(ArrayList<MyComponent> arr, Point p, Dimension size, int d) {
		int y = p.y;
		int plusX = 0;
		for (MyComponent it : arr) {
			it.setBounds(p.x + plusX, y, 50, 50);
			plusX += d;
			if (plusX > size.width - it.size.x) {
				plusX = 0;
				y += d;
			}
		}
	}

}
