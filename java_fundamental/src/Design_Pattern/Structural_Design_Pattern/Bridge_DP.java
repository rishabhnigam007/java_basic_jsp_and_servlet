package Design_Pattern.Structural_Design_Pattern;

// The bridge is a design pattern in which the client can only
// access the abstraction part without being concerned about the implementation part

interface DrawAPI {
	public void drawCircle(int radius, int x, int y);
}

class RedCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: " + radius + " , x: " + x + " , " + y + " ]");
	}
}

class GreenCircle implements DrawAPI {
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	}
}

abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}

class Circle extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}

public class Bridge_DP {

	public static void main(String[] args) {

		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		redCircle.draw();
		
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		greenCircle.draw();

	}

}
