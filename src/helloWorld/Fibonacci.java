package helloWorld;

public class Fibonacci {

	static int getNthFibonacci(int n){
		if(n==1 || n==2){
			return 1;
		}
		int fibo1 = 1, fibo2=1, fibonacci=1;
		for(int i=3; i<=n; i++){
			fibonacci=fibo1+fibo2;
			fibo1=fibo2;
			fibo2=fibonacci;
		}
		return fibonacci;
	}
	
	static int getNthFibonacciRecursive(int n){
		if(n==1 || n==2){
			return 1;
		}
		return getNthFibonacciRecursive(n-1) + getNthFibonacciRecursive(n-2);
	}
	
	int isFibonacci(int n){
		for(int i=1; getNthFibonacciRecursive(i) <= n; i++){
			if(getNthFibonacciRecursive(i) == n){
				return 1;
			}
		}
		return 0;
	}
	
	int isFibonacciTest(int n){
		if(n==1 || n==2){
			return 1;
		}
		int fibo1=1, fibo2=1, fibonacci=1;
		for(int i=3; fibonacci<=n; i++){
			fibonacci = fibo1 + fibo2;
			fibo1=fibo2;
			fibo2=fibonacci;
			
			if(fibonacci == n){
				return 1;
			}
		}
		
	return 0;
	}
	
	
	public static void main(String[] args) {
		
		Fibonacci f = new Fibonacci();
		
		int n = 10;
		System.out.print("Fibonacci numbers using loop : ");
		for(int i = 1; i<=n; i++){
			System.out.print(getNthFibonacci(i) + ", ");
		}
		System.out.println();
		
		//Display n fibonacci numbers using recursive function
		System.out.print("Fibonacci numbers using recursive function : ");
		for(int i = 1; i<=n; i++){
			System.out.print(getNthFibonacciRecursive(i)+ ", ");
		}
		System.out.println();
		
		//test isFibonacci
		for(int i=1; i<10; i++){
			System.out.println("Is " + i + " Fibonacci number? : " + f.isFibonacci(i));
		}
		System.out.println();
		//test isFibonacciTest
		for(int i=1; i<10; i++){
			System.out.println("Is " + i + " Fibonacci number? : " + f.isFibonacciTest(i));
		}


	}

}
