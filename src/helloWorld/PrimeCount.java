package helloWorld;

public class PrimeCount {

	public static void main(String[] args) {
		PrimeCount p = new PrimeCount();
		System.out.println("Num Of Primes between 10 and 30 are: " + p.countPrime(10,30));
		System.out.println("Num Of Primes between 11 and 29 are: " + p.countPrime(11,29));
		System.out.println("Num Of Primes between 20 and 22 are: " + p.countPrime(20,22));
		System.out.println("Num Of Primes between 1 and 1 are: " + p.countPrime(1,1));
		System.out.println("Num Of Primes between 5 and 5 are: " + p.countPrime(5,5));
		System.out.println("Num Of Primes between 6 and 2 are: " + p.countPrime(6,2));
		System.out.println("Num Of Primes between -10 and 6 are: " + p.countPrime(-10,6));

	}
	public int countPrime(int start, int end){
		int numOfPrimes = 0;
		if(start <2) {start = 2;}
		
		for(int i = start; i <= end; i++){
			
			boolean primeFlag = true;
			
			for(int j = 2; j < i; j++){
				if(i%j == 0){
					primeFlag = false;
					break;
				}
			}
			
			if(primeFlag == true){
				numOfPrimes++;
			}
			
		}
		return numOfPrimes;
		
	}

}
