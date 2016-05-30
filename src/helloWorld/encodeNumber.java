package helloWorld;

public class encodeNumber {
	boolean isPrime(int n){
		if(n <= 1){ return false; }
		for(int i = 2; i < n; i++){
			if(n%i ==0){
				return false;
			}
		}
		return true;
	}
	
	int[] getEncodedNumber(int n){
		int primeCount = 0;

		for(int i = 2; i < n; i++){
			if(n%i == 0 && isPrime(i)){
				primeCount++;
			}
		}
		
		int[] primes = new int[primeCount];
		
		int k = 0;
		for(int j = 2; j < n; j++){
			if(n%j == 0 && isPrime(j)){
				primes[k] = j;
				k++;
			}
		}
		int num = 1;
		for(int p = 0; p < primes.length; p++){
			num *= primes[p];
		}
		if(n == num){
			System.out.println("RESULT OK");
		}
		
		return primes;
	}
	public static void main(String[] args) {
		encodeNumber en = new encodeNumber();
		int[] result = new int[100];
		result = en.getEncodedNumber(6);
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]);
			
		}

	}

}
