package Design_Pattern.Structural_Design_Pattern;

// Adding new features to an existence object without changing its structure
// The Decorator Pattern is also known as Wrapper

interface Shapes {
	void draw();
}

abstract class ShapeDecorator implements Shapes {
	protected Shapes decoratedShape;

	public ShapeDecorator(Shapes decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}
}

class RedShapeDecorator extends ShapeDecorator {
	public RedShapeDecorator(Shapes decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
	}
}

class Rectangle implements Shapes {
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}

class Circles implements Shapes {
	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}

public class Decorator_DP {

	public static void main(String[] args) {

		Shapes circle = new Circles();

		Shapes redCircle = new RedShapeDecorator(new Circles());

		Shapes redRectangle = new RedShapeDecorator(new Rectangle());

		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("Circle with Red border");
		redCircle.draw();

		System.out.println("Rectangle with Red border");
		redRectangle.draw();

	}

}
