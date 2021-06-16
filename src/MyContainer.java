import java.util.ArrayList;

public class MyContainer {
	private ArrayList<MyComponent> compList;

	public MyContainer() {
		compList = new ArrayList<>();
	}

	public void add(MyComponent c) {
		compList.add(c);
	}

	public ArrayList<MyComponent> getList() {
		return compList;
	}
}
