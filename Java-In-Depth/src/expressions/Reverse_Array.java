package expressions;

public class Reverse_Array {

	public static void main(String[] args) {

		int ar[] = {1,2,3,4,5,6};
		
		for(int i = 0, j = ar.length-1; i<ar.length/2; i++, j--)
		{
//			int temp = ar[i];
//			ar[i] = ar[j];
//			ar[j] = temp;
			// or in one line we can write this
			ar[i] = ar[i] + ar[j] - (ar[j] = ar[i]);
		}	
		
		for(int i = 0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		int num = 0;
		
		// Here we initialize label
		outermost: for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<10; j++)
			{
				if(i == 5 && j == 5)
				{
					break outermost;
				}
				num++;
			}
		}
		System.out.println();
		System.out.println("Num : "+num);
	}
}