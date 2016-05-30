package helloWorld;

public class ProcupineNumber {
	int findProcupineNumber(int num){
		boolean isPrime = false;
		boolean ends9 = false;
		boolean nextPrime9 = false;
		int n = num;
		while(!(isPrime && ends9 && nextPrime9)){
	
		
		if(isPrime(n)){ isPrime = true; }
		
		if(n%10 ==9){
			ends9 = true;
		}
		
		int i = n+1;
		while(!isPrime(i)){
			i++;
		}
		if(i%10==9){
			nextPrime9 = true;
		}
		n++;
	}
		return n;
	}
	
	boolean isPrime(int n){
		boolean isNumberPrime = true;
		if(n==1){
			System.out.println("1 is neither prime nor composite");
			return false;
		}
		for(int i = 2; i < n; i++){
			if(n/i == 0){
				isNumberPrime = false;
			}
		}
		return isNumberPrime;
	}
	public static void main(String[] args) {
		ProcupineNumber pn = new ProcupineNumber();
		System.out.println("Procupine number : "+pn.findProcupineNumber(138));

	}

}
