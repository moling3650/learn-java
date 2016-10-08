import java.util.LinkedList;
import java.util.List;

public class printPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> primes = new LinkedList<>();
		primes.add(2);
		for (int number = 3; number < 100; number+=2) {
			boolean flag = true;
			for (Integer prime : primes) {
				if (number % prime == 0) {
					flag = false;
				}
			}
			if (flag) {
				primes.add(number);
			}			
		}
		System.out.println(primes);

	}

}
