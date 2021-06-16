import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

public class MyGridLayout implements MyLayout {

	int x, y;

	public MyGridLayout(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void sortPosition(MyContainer arr, Dimension dimension) {
		int index = 0;
		int sizeX = dimension.width / x;
		int sizeY = dimension.height / y;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				arr.getList().get(index).setBounds(j * sizeX, i * sizeY, sizeX, sizeY);
				index++;
			}
		}
	}

	@Override
	public void sortPosition(ArrayList<MyComponent> arr, Point p, Dimension dimension, int dis) {
		// TODO Auto-generated method stub

	}

}
