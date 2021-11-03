package Design_Pattern.Behavioural_Design_Pattern;

import java.util.Scanner;
import java.util.Stack;

abstract class Expression
{
	public abstract int interpret();
}

// Terminal expression
class Number extends Expression
{
	protected int value=0;
	public Number(int value)
	{
		this.value=value;
	}
	@Override
	public int interpret() {
		return value;
	}
}

// Non terminal expression
class Add extends Expression
{
	protected Expression lhs=null;
	protected Expression rhs=null;
	
	public Add(Expression lhs,Expression rhs)
	{
		this.lhs=lhs;
		this.rhs=rhs;
	}
	
	@Override
	public int interpret() {
		return lhs.interpret()+rhs.interpret();
	}
	
}

class Subtract extends Expression
{
	protected Expression lhs=null;
	protected Expression rhs=null;
	
	public Subtract(Expression lhs,Expression rhs)
	{
		this.lhs=lhs;
		this.rhs=rhs;
	}
	
	@Override
	public int interpret() {
		return lhs.interpret()-rhs.interpret();
	}
}

class Multiply extends Expression
{
	protected Expression lhs=null;
	protected Expression rhs=null;
	
	public Multiply(Expression lhs,Expression rhs)
	{
		this.lhs=lhs;
		this.rhs=rhs;
	}
	
	@Override
	public int interpret() {
		return lhs.interpret()*rhs.interpret();
	}
}

class Division extends Expression
{
	protected Expression lhs=null;
	protected Expression rhs=null;
	
	public Division(Expression lhs,Expression rhs)
	{
		this.lhs=lhs;
		this.rhs=rhs;
	}
	
	@Override
	public int interpret() {
		return lhs.interpret()/rhs.interpret();
	}
}

class Evaluator
{
	public Expression parse(String text)
	{
		//setting us expression stack
		Stack<Expression> stack = new Stack<Expression>();
		
		//parsing the text
		String words[]=text.split(" ");
		
		for(String word : words)
		{
			Expression lhs = null;
			Expression rhs = null;
			
			switch(word)
			{
				case "+":
					rhs=stack.pop();
					lhs=stack.pop();
					stack.push(new Add(lhs,rhs));
					break;
				case "-":
					rhs=stack.pop();
					lhs=stack.pop();
					stack.push(new Subtract(lhs,rhs));
					break;
				case "*":
					rhs=stack.pop();
					lhs=stack.pop();
					stack.push(new Multiply(lhs,rhs));
					break;
				case "/":
					rhs=stack.pop();
					lhs=stack.pop();
					stack.push(new Division(lhs,rhs));
					break;
				default:
					int number=Integer.parseInt(word);
					stack.push(new Number(number));
					break;
			}

		}
		
		return stack.pop();
	}
}

public class Interpreter_DP {

	public static void main(String[] args) {

		Evaluator e = new Evaluator();
		System.out.println("Enter the expression in postfix notation : ");
		Scanner sc= new Scanner(System.in);
		String expression=sc.nextLine();
		sc.close();
		System.out.println(e.parse(expression).interpret());
	}

}

/*
 * output : Enter the expression in postfix notation : 25 5 4 * - 
 * 5
 */
