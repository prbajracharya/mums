package helloWorld;

public class Pascal {

	int isPascal(int n){
		
		int sum = 0; 
		for(int i = 1; sum < n; i++){
			sum += i;
		}
		if(sum == n){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		Pascal p = new Pascal();
		
		System.out.println("Is 6 a Pascal number?:"+ p.isPascal(6));
		
		System.out.println("Is 15 a Pascal number?:"+ p.isPascal(15));
		
		System.out.println("Is 7 a Pascal number?:"+ p.isPascal(7));
	}

}
