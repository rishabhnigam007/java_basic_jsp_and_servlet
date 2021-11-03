package Design_Pattern.Behavioural_Design_Pattern;

// one specific class for visitor in this

interface ComputerPartVisitor {
	public void visit(Computers computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}

interface ComputerPart
{
	   public void accept(ComputerPartVisitor computerPartVisitor);
}

class Keyboard implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}

class Monitor implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}

class Mouse implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}


// this is for keeping records
class Computers implements ComputerPart {
	
	   ComputerPart[] parts;

	   public Computers(){
	      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};		
	   } 


	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(computerPartVisitor);
	      }
	      computerPartVisitor.visit(this);
	   }
	}

// This class is for display result
class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	   @Override
	   public void visit(Computers computer) {
	      System.out.println("Displaying Computer.");
	   }

	   @Override
	   public void visit(Mouse mouse) {
	      System.out.println("Displaying Mouse.");
	   }

	   @Override
	   public void visit(Keyboard keyboard) {
	      System.out.println("Displaying Keyboard.");
	   }

	   @Override
	   public void visit(Monitor monitor) {
	      System.out.println("Displaying Monitor.");
	   }
	}

public class Visitor_DP 
{

	public static void main(String[] args) {
		
		ComputerPart computer = new Computers();
		computer.accept(new ComputerPartDisplayVisitor());
		
	}

}
