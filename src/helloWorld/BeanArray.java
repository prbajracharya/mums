package helloWorld;

public class BeanArray {
	int isBeanArray(int[] a){
		int sumPrime = 0;
		for(int i = 0; i < a.length; i++){
			if(isPrime(a[i]) == 1){
				//System.out.println(a[i]);
				sumPrime += a[i];
			}
		}
		//System.out.println(sumPrime);
	if(sumPrime == a[0]){
		//System.out.println("The array is a Bean Array");
		return 1;
	}
	return 0;
	}
	
	int isPrime(int n){
		if(n<2){
			return 0;
		}
		for(int i = 2; i<n; i++){
			if(n%i == 0){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		BeanArray ba = new BeanArray();
		int[] a = {21,3,7,9,11,4,6};
		System.out.println("Is A a Bean Array ? "+ba.isBeanArray(a));
		
		int[] b = {13,4,4,4,4};
		System.out.println("Is B a Bean Array ? "+ba.isBeanArray(b));
		
		int[] c = {10,5,5};
		System.out.println("Is C a Bean Array ? "+ba.isBeanArray(c));
		
		int[] d = {0,6,8,20};
		System.out.println("Is D a Bean Array ? "+ba.isBeanArray(d));
		
		int[] e = {3};
		System.out.println("Is E a Bean Array ? "+ba.isBeanArray(e));
		
		int[] f = {8,5,-5,5,3};
		System.out.println("Is F a Bean Array ? "+ba.isBeanArray(f));

	}

}
