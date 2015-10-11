
public class Eulersucksprime
{
	public static void main(String []args)
	{
		boolean prime = true;
		int number = 0;
		boolean numberPrime = true;
		
		//make prime numbers
		for(int x = 2; x < 1000000; x++)
		{
			for(int y = 2; y < x; y++)
			{

				if (x % y == 0)
				{
					prime = false;
				}
			}
			//if the generated number is prime
			if (prime == true)
			{	
				
				//add the prime numbers to each other
				number += x;			

				//System.out.println(number);
			}	
				
			//check if the sum is prime
			for (int z = 2; z < number; z++)
			{
				if (number % z == 0)
				{
					numberPrime = false;	
				}
				//if the sum is prime
				if (numberPrime = true)
				{
					//check if number is under 1000000 and over 900000
					if (number > 900000)
					{
					
						if (number < 1000000)
						{
							//print number 
							System.out.println(number);
						}
						else
						{
							System.exit(0);
						}
					
					}

				}
			}			
		
		prime = true;
		
		}
	
	}

}