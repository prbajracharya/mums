package helloWorld;

public class Oct03_1 {

	int isFibonacci(int n){
		if(n ==1){
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibo3 = 1;
		
		for(int k = 0; k < n; k++){
			fibo3 = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo3;
			
			if(fibo3 == n){
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Oct03_1 fibo = new Oct03_1();
		
		System.out.println("Is 5 a fibonacci number? : "+ fibo.isFibonacci(5));
		
		System.out.println("Is 13 a fibonacci number? : "+ fibo.isFibonacci(13));
		
		System.out.println("Is 15 a fibonacci number? : "+ fibo.isFibonacci(15));
		
		System.out.println("Is 1 a fibonacci number? : "+ fibo.isFibonacci(1));
		
		System.out.println("Is -15 a fibonacci number? : "+ fibo.isFibonacci(-15));

	}

}
