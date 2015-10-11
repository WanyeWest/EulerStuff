public class Eulersucks
{
	
	public static void main(String []args)
	{
		
		int sumofsquares = 0;
		int squareofsums = 0;
		int sumofnumbers = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			int x = i * i;
			sumofsquares += x;
		}

		for(int i = 1; i <= 100; i++)
		{
			int y = i;
			sumofnumbers += i;
			squareofsums = sumofnumbers * sumofnumbers;
		}
		
		int number = squareofsums - sumofsquares;
		System.out.println(number);
	}
	
}