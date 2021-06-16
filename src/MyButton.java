import java.awt.Color;
import java.awt.Graphics;

public class MyButton extends MyComponent {

	public MyButton(String l) {
		label = l;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(position.x, position.y, size.x, size.y);
		g.drawString(label, position.x + 10, position.y + 15);
	}

}
