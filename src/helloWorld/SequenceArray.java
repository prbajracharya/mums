package helloWorld;

public class SequenceArray {
	int isSequenceArray(int[] a, int m, int n){
		boolean isSeqArray = false;
		int prevArray = -1;
		for(int i = 0; i < a.length; i++){
			isSeqArray = false;
			if(prevArray == a[i]){
				m--;
			}
			if(a[i] == m){
				isSeqArray = true;
					m++;				
			}
			else{
				System.out.println("The given array is NOT a sequence array");
				return 0;
			}
			prevArray = a[i];
			System.out.println(a[i]+" isSeqArray: "+isSeqArray);
		}
		if(isSeqArray == true){
			System.out.println("The given array is a sequence array");
			return 1;
		}
		System.out.println("The given array is NOT a sequence array");
		return 0;
	}
	public static void main(String[] args) {
		SequenceArray sa = new SequenceArray();
		int[] a = {1,2,3,4,5};
		sa.isSequenceArray(a, 1, 5);
		
		int[] b = {1,3,4,2,5};
		sa.isSequenceArray(b, 1, 5);
		
		int[] c = {-5,-5,-4,-4,-4,-3,-3,-2,-2,-2};
		sa.isSequenceArray(c, -5, -2);
		
		int[] d = {0,1,2,3,4,5};
		sa.isSequenceArray(d, 1, 5);
		
		int[] e = {1,3,4,2,5};
		sa.isSequenceArray(e, 1, 5);
		
		int[] f = {1,2,5};
		sa.isSequenceArray(f, 1, 5);
		
		int[] g = {5,4,3,2,1};
		sa.isSequenceArray(g, 1, 5);
	}

}
