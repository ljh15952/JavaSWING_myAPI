import java.awt.Dimension;
import java.util.ArrayList;

public class MyFlowLayout implements MyLayout {

	@Override
	public void sortPosition(MyContainer arr, Dimension size) {
		int y = 0;
		int plusX = 0;
		for (MyComponent it : arr.getList()) {
			it.setBounds(plusX, y, it.size.x, it.size.y);
			plusX += 100;
			if (plusX > size.width - it.size.x) {
				plusX = 0;
				y += 100;
			}
		}
	}

}
