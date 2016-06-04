package helloWorld;

public class nUpCount {
	int getnUpCount(int[] a, int n){
		int sum = 0;
		int partSum = 0;
		int nUpCount = 0;
		for(int i = 0; i< a.length; i++){
			partSum = sum;
			sum += a[i];
			
			if(sum > n && partSum <= n){
			
				nUpCount++;
			}
		}
		return nUpCount;
	}
	public static void main(String[] args) {
		nUpCount nuc = new nUpCount();
		int[] a = {2,3,1,-6,8,-3,-1,2};
		System.out.println("nUpCount : " + nuc.getnUpCount(a, 5));
		
		int[] b = {6,3,1};
		System.out.println("nUpCount : " + nuc.getnUpCount(b, 6));
		
		int[] c = {1,2,-1,5,3,2,-3};
		System.out.println("nUpCount : " + nuc.getnUpCount(c, 20));
	}

}
