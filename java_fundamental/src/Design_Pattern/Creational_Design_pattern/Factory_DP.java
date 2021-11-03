package Design_Pattern.Creational_Design_pattern;

// one factory method for all shape
interface Shape
{
	void draw();
}

class Rectangle implements Shape
{
	@Override
	public void draw() {
		System.out.println("Rectangle");	
	}	
}

class Circle implements Shape
{
	@Override
	public void draw() {
		System.out.println("Circle");	
	}	
}

class Square implements Shape
{
	@Override
	public void draw() {
		System.out.println("Square");	
	}	
}

// if this getShape method is abstract then class also abstract
// then this is called abstract factory design pattern
/*
 * abstract class ShapeFactory { abstract Shape getShape(); }
 * 
 * class ShapeFactoryImpl extends ShapeFactory {
 * 
 * @Override Shape getShape() { // mention shape here return null; }
 * 
 * }
 */
class ShapeFactory
{
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
		{
			return null;
		}
		if(shapeType.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("rectangle"))
		{
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("square"))
		{
			return new Square();
		}
		return null;
	}
}

public class Factory_DP 
{

	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		Shape s = sf.getShape("circle");
		s.draw();	
		
		ShapeFactory sf1 = new ShapeFactory();
		Shape s1 = sf1.getShape("rectangle");
		s1.draw();		
		
	}

}
