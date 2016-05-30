package helloWorld;

public class MeeraArray {

	int isMeeraArray(int[] a){
		for(int i = 0; i < a.length; i++){
			if(isPrime(a[i]) == 1){
				for(int j = 0; j < a.length; j++){
					if(a[j] == 0){
						return 1;
					}
					
				}//end of inner for loop for j
					
				return 0;
			}//end of if
		}//end of outer for loop for i
		
		for(int k = 0; k < a.length; k++){
			if(a[k] == 0){
				return 0;
			}
		}
		return 1;
	}
	
	int isMeera(int[] a){
		boolean hasPrime = false, hasZero = false;
		for(int i = 0; i < a.length; i++){
			if(isPrime(a[i]) == 1){
				hasPrime = true;
			}
			if(a[i]==0){
				hasZero = true;
			}
		}
		if((hasPrime == true && hasZero == true) || (hasPrime == false && hasZero == false)){
			return 1;
		}
		return 0;
	}
	
	private int isPrime(int n) {
		if(n<2){return 0;}
		for(int i=2; i<n; i++){
			if(n%i == 0){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		MeeraArray ma = new MeeraArray();
		
		int[] a = {7,6,0,10,1};
		System.out.println("Is A an Meera Array? : " + ma.isMeera(a));

		int[] b = {6,10,1};
		System.out.println("Is B an Meera Array? : " + ma.isMeera(b));
		
		int[] c = {3,7,0,8,0,5};
		System.out.println("Is C an Meera Array? : " + ma.isMeera(c));

		int[] d = {6,10,0};
		System.out.println("Is D an Meera Array? : " + ma.isMeera(d));
		
		int[] e = {2,6,10};
		System.out.println("Is E an Meera Array? : " + ma.isMeera(e));
	}

}
