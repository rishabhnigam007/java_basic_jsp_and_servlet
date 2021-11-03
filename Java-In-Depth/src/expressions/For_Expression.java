package expressions;

public class For_Expression {

	public static void main(String[] args) {

		int arrr[] = { 1, 2, 3, 4 };
		for (int i = 0; i < arrr.length; System.out.print(arrr[i]+" "), i++)
			;
		System.out.println();
		for (int i = 0; i < arrr.length; System.out.print(arrr[i++]+" "));

	}
}