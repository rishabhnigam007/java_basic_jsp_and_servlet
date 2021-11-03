package Design_Pattern.Structural_Design_Pattern;

// facade design pattern promote loose coupling
// facade design pattern is used to make a complex subsystem easier to use
// a simple interface should be provided for a set of interfaces in the subsystem
// facade provide abstraction also

interface Shapee
{
	void draw();
}

class Polygon implements Shapee
{
	@Override
	public void draw() {
		System.out.println("Polygon :: Draw");
	}
}

class Pentagon implements Shapee
{
	@Override
	public void draw() {
		System.out.println("Pentagon :: Draw");
	}
}

class FillShapee
{
	private Shapee polygon;
	private Shapee pentagon;
	
	public FillShapee() {
		polygon=new Polygon();
		pentagon=new Pentagon();
	}
	
	public void drawPolygon()
	{
		polygon.draw();
	}
	
	public void drawPentagon()
	{
		pentagon.draw();
	}
}

public class Facade_DP {

	public static void main(String[] args) {
		FillShapee fs = new FillShapee();
		fs.drawPentagon();
		fs.drawPolygon();
	}

}
