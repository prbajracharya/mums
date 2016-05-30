package helloWorld;

public class largestPrimeFactor {
	boolean isPrime(int num){
		for(int i = 2; i < num; i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
	}
	int largestPrimeFactor(int n){
		int largestPrimeFactor = 0;
		
		for(int i = 2; i < n; i++){
			if(n%i == 0 && isPrime(i)){
				if(i > largestPrimeFactor){
					largestPrimeFactor = i;
				}
			}
		}
		
		return largestPrimeFactor;
	}
	public static void main(String[] args) {
		largestPrimeFactor lpf = new largestPrimeFactor();
		System.out.println("Largest Prime Factor of 10 is :"+ lpf.largestPrimeFactor(10));
		
		System.out.println("Largest Prime Factor of 6936 is :"+ lpf.largestPrimeFactor(6936));
		
		System.out.println("Largest Prime Factor of 1 is :"+ lpf.largestPrimeFactor(1));

	}

}
