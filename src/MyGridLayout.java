import java.awt.Dimension;

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

}
