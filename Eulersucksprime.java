import java.util.*;

public class Eulersucksprime {
	//checks if n is prime
	public static boolean isPrime(int n) {
		for (int i = 2; 2 * i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int number = 0;
		//list of prime numbers
		ArrayList<Integer> primes = new ArrayList<Integer>();

		//makes the list
		for (int x = 2; x < 1000000; x++) {
			if(Eulersucksprime.isPrime(x)){
				primes.add(primes.size(), x);
			}
		}
		while(true){
			//reset variable each time so it doesn't go out of bounds
			number = 0;
			//adds all the prime numbers
			for(int i = 0; i < primes.size(); i++){
				number += primes.get(i);
			}
			//checks if it meats the parameters
			if(number < 1000000 && Eulersucksprime.isPrime(number) && number > 0){
				System.out.println(number);
				break;
			}
			//removes last item from the list, repeats
			primes.remove(primes.size() - 1);
		}

	}
}

