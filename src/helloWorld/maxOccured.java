package helloWorld;

public class maxOccured {

	int maxOccured(int[] a){
		int maxOccured = 0;
		int count = 0;
		int maxCount = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++){
			count = 0;
			for(int j = 0; j < a.length; j++){
				if(a[i] == a[j]){
					count++;
				}
			}
			if(count > maxCount){
				maxCount = count;
				maxOccured = a[i];
			}
			//System.out.println("MaxCount : "+maxCount);
			//System.out.println("MaxOccured : "+maxOccured);
		}
		return maxOccured;
	}
	public static void main(String[] args) {
		
		maxOccured mo = new maxOccured();
		
		int[] a = {1,2,1,1,4,23,2};
		System.out.println("Max occured number in A is : " + mo.maxOccured(a));
		
		int[] b = {1,1,1};
		System.out.println("Max occured number in B is : " + mo.maxOccured(b));
		
		int[] c = {1,1,-2,10,10,10,4,23,2};
		System.out.println("Max occured number in C is : " + mo.maxOccured(c));
		
		int[] d = {2,10,10,2};
		System.out.println("Max occured number in D is : " + mo.maxOccured(d));
	}

}
