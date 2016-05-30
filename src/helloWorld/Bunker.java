package helloWorld;
//pg 104 Aug 8th 2015 Question no 2
public class Bunker {
	int isBunker(int[] a){
		boolean containsOne = false;
		boolean containsPrime = false;
		for(int i = 0; i < a.length; i++){
			if(a[i] == 1){
				containsOne = true;
			}
			if(isPrime(a[i])){
				containsPrime = true;
			}
			//System.out.println(a[i]);
			//System.out.println(containsOne);
			//System.out.println(containsPrime);
		}
		if(containsOne == true && containsPrime == true){
			return 1;
		}
		return 0;
	}
	private boolean isPrime(int n) {
		if(n<2){ return false;}
		for(int i = 2; i < n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Bunker b = new Bunker();
		int[] a = {7,6,10,1};
		System.out.println("Is A a bunker array? :" + b.isBunker(a));
		
		int[] c = {7,6,10};
		System.out.println("Is C a bunker array? :" + b.isBunker(c));
		
		int[] d = {3,7,1,8,1};
		System.out.println("Is D a bunker array? :" + b.isBunker(d));
		
		int[] e = {6,10,1};
		System.out.println("Is E a bunker array? :" + b.isBunker(e));

	}

}
