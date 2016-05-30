package helloWorld;

public class Nov07_1 {
	int factorTwoCount(int n){
		int count = 0;
		
		if(n%2 != 0){
			return 0;
		}
		
		while(n%2 == 0){
			n /= 2;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args){
		Nov07_1 fact2cnt = new Nov07_1();
		
		System.out.println("Factor 2 count of 48 is: "+ fact2cnt.factorTwoCount(48));
		
		System.out.println("Factor 2 count of 27 is: "+ fact2cnt.factorTwoCount(27));
	}
}
