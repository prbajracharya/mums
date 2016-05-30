package helloWorld;

public class IsMeeraArray {

	int isMeera(int[] a){
	boolean hasPrime = false, hasZero = false;
		for(int i=0; i<a.length; i++){

			if(isPrime(a[i])){
				hasPrime = true;
		}
			if(a[i]==0){
				hasZero = true;
			}
		}
		if(hasPrime == hasZero){
			return 1;
		}
		return 0;
	}
	boolean isPrime(int n){
		if(n==1){return false;}
		for(int i = 2; i < n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		IsMeeraArray ima = new IsMeeraArray();
		int[] a = {7,6,0,10,1};
		System.out.println("Is A a Meera Array?:" + ima.isMeera(a));
		
		int[] b = {7,6,10,1};
		System.out.println("Is B a Meera Array?:" + ima.isMeera(b));
		
		int[] c = {6,10,1};
		System.out.println("Is C a Meera Array?:" + ima.isMeera(c));
		
		int[] d = {3,7,0,8,0,5};
		System.out.println("Is D a Meera Array?:" + ima.isMeera(d));

	}

}
