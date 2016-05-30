package helloWorld;

public class lastEven {

	int lastEven(int[] a){
		int lastEvenIndex = -1;
		for(int i = 0; i< a.length; i++){
			if(a[i]%2 == 0){
				lastEvenIndex = i;
			}
		}
		return lastEvenIndex;
	}
	public static void main(String[] args) {
		lastEven le = new lastEven();
		
		int[] a = {3,2,5,6,7};
		System.out.println("Last Even Index of A is:"+ le.lastEven(a));
		
		int[] b = {3,2,5,6,7,8, 10, 4, 3, 24};
		System.out.println("Last Even Index of B is:"+ le.lastEven(b));
		
		int[] c = {3,5,7};
		System.out.println("Last Even Index of C is:"+ le.lastEven(c));

	}

}
