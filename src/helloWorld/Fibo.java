package helloWorld;

public class Fibo {
	int getNthFiboRecur(int n){
		if(n ==1 || n==2){
			return 1;
		}
		return getNthFiboRecur(n-1) + getNthFiboRecur(n-2);
	}
	
	int getNthFibo(int n){
		if(n==1 || n==2){
			return 1;
		}
		int fibo1=1, fibo2=1, fibo = 1;
		for(int i = 3; i <= n; i++){
			fibo = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibo;
		}
		return fibo;
	}
	
	int isFibo(int n){
		for(int i = 0; i < n; i++){
			if(getNthFibo(i) == n){
				return 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Fibo f = new Fibo();
		
		for(int i = 1; i < 11; i++){
			System.out.print(f.getNthFiboRecur(i) + ", ");
		}
		System.out.println();
		for(int i = 1; i < 11; i++){
			System.out.print(f.getNthFibo(i) +", ");
		}
		
		for(int i = 1; i < 50; i++){
			System.out.println("Is " + i +" a fibo number? : "+ f.isFibo(i));
		}

	}

}
