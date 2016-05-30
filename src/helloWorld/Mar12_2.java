package helloWorld;

public class Mar12_2 {

	int isMeera(int[] a){
		
		boolean has1 = false, hasPrime = false;
		for(int i = 0 ; i < a.length; i++){

			if(a[i] == 1){
				has1 = true;
			}
			if(isPrime(a[i])){
				hasPrime = true;
				//System.out.println("Prime:"+ a[i]);
			}
		}
		//System.out.println("has1 : "+ has1);
		//System.out.println("hasPrime : "+ hasPrime);
		if(has1 == hasPrime){
			return 1;
		}
		return 0;
	}
	
	boolean isPrime(int n){
		if(n < 2){
			return false;
		}
		for(int i = 2; i < n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Mar12_2 m = new Mar12_2();
		
		int[] a = {7,6,10,1};
		System.out.println("Is a Meera array?:"+ m.isMeera(a));
		
		int[] b = {7,6,10};
		System.out.println("Is b Meera array?:"+ m.isMeera(b));
		
		int[] c = {6,10,1};
		System.out.println("Is c Meera array?:"+ m.isMeera(c));
		
		int[] d = {3,7,6,1,8,1};
		System.out.println("Is d Meera array?:"+ m.isMeera(d));
		
		int[] e = {7,6,10,1,1};
		System.out.println("Is e Meera array?:"+ m.isMeera(e));

	}

}
