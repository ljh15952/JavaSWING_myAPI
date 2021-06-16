import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

public interface MyLayout {
	void sortPosition(MyContainer arr, Dimension dimension);

	void sortPosition(ArrayList<MyComponent> arr, Point p, Dimension dimension,int dis);
}
