package helloWorld;

public class StantonMeasure {
	
	int findStantonMeasure(int[] a){
		int count1 = 0;
		int StantonMeasure = 0;
		for(int i = 0; i<a.length; i++){
				if(a[i] == 1){
					count1++;
				}
		}
		for(int i = 0; i< a.length; i++){
			if(a[i] == count1){
				StantonMeasure++;
			}
			
		}
		
		return StantonMeasure;
	}

	public static void main(String[] args) {
		StantonMeasure x = new StantonMeasure();
		int a[] = {1};
		System.out.println("Stanton Measure of array A is : " + x.findStantonMeasure(a));
		
		int b[] = {0};
		System.out.println("Stanton Measure of array B is : " + x.findStantonMeasure(b));
		
		int c[] = {3,1,1,4};
		System.out.println("Stanton Measure of array C is : " + x.findStantonMeasure(c));
		
		int d[] = {1,3,1,1,3,3,2,3,3,3,4};
		System.out.println("Stanton Measure of array D is : " + x.findStantonMeasure(d));

		int e[] = {};
		System.out.println("Stanton Measure of array B is : " + x.findStantonMeasure(e));
	}

}
