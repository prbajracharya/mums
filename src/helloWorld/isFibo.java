package helloWorld;

public class isFibo {

	int isFibonacci(int n){
		if( n==1){
			return 1;
		}
		int fibo1 =1, fibo2= 1,fibo =1;
		for(int i = 0; i<n; i++){
			fibo1 = fibo2;
			fibo2 = fibo;
			fibo = fibo1 + fibo2;
			//System.out.print(fibo);
			if(n==fibo){
				return 1;
			}
			
		}
		//System.out.println("");
		return 0;
	}
	/* does not work
	
	int isFibonacci(int n){
		if(n==0 || n==1){
			return 1;
		}
		System.out.println((isFibonacci(n-1)+isFibonacci(n-2)));
		if(n == (isFibonacci(n-1)+isFibonacci(n-2))){
			return 1;
		}
		return 0;
	}
	*/

	public static void main(String[] args) {
		isFibo fibo = new isFibo();
		System.out.println("Is 5 a fibonacci number? :"+ fibo.isFibonacci(5));

		System.out.println("Is 13 a fibonacci number? :"+ fibo.isFibonacci(13));

		System.out.println("Is 25 a fibonacci number? :"+ fibo.isFibonacci(25));
		
		System.out.println("Is 3 a fibonacci number? :"+ fibo.isFibonacci(3));
		
		System.out.println("Is 1 a fibonacci number? :"+ fibo.isFibonacci(1));
	}

}
