package helloWorld;

public class Riley {

	int isRelay(int n){
		
		int digit = 0;
		boolean isRiley = true;
		
		while(n%10 != 0){
			isRiley = true;
			digit = n%10;
			System.out.println(digit);
			
			if(digit%2 != 0){
				isRiley = false;
				break;
			}
			n=n/10;
			
		}
		if(isRiley){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Riley r = new Riley();
		System.out.println("Is 2426 a Riley number? : "+r.isRelay(2426));
		
		System.out.println("Is 2432 a Riley number? : "+r.isRelay(2432));

	}

}
