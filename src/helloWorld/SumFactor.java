package helloWorld;

public class SumFactor {

	int findSumFactor(int[] a){
		int sum = 0;
		int sumFactor = 0;
		
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		System.out.println("Sum is : " + sum);
		for(int j = 0; j < a.length; j++){
			if(a[j] == sum){
				sumFactor++;
			}
		}
		return sumFactor;
	}
	public static void main(String[] args) {

		SumFactor sf = new SumFactor();
		int[] a = {3,0,2,-5,0};
		System.out.println(sf.findSumFactor(a));
		
		int[] b = {9,-3,-3,-1,-1};
		System.out.println(sf.findSumFactor(b));
		
		int[] c = {1};
		System.out.println(sf.findSumFactor(c));
		
		int[] d = {0,0,0};
		System.out.println(sf.findSumFactor(d));

	}

}
