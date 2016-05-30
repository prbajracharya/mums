package helloWorld;

public class Aug08_2 {

	int isBunker(int [] a){
		boolean hasOne = false, hasPrime = false;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == 1){
				hasOne = true;
			}
			if(isPrime(a[i])){
				hasPrime = true;
			}
		}
		//System.out.println("hasOne : " + hasOne);
		//System.out.println("hasPrime : " + hasPrime);
		if(hasPrime == hasOne){
			return 1;
		}
		return 0;
	}
	boolean isPrime(int n){
		if(n<2){
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
		Aug08_2 bunker = new Aug08_2();
		
		int[] a = {7,6,10,1};
		System.out.println("Is A bunker array? : "+ bunker.isBunker(a));
		
		int[] b = {7,6,10};
		System.out.println("Is B bunker array? : "+ bunker.isBunker(b));
		
		int[] c = {6,10,1};
		System.out.println("Is C bunker array? : "+ bunker.isBunker(c));
		
		int[] d = {6,10};
		System.out.println("Is D bunker array? : "+ bunker.isBunker(d));
		
		int[] e = {3,7,1,8,1};
		System.out.println("Is E bunker array? : "+ bunker.isBunker(e));

	}

}
