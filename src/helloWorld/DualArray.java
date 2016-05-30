package helloWorld;

public class DualArray {
	int isDualArray(int[] a){
		int[] countArray = new int[100];

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < countArray.length; j++){
				if(a[i] == j){
					countArray[j]++;
				}
			}
		}
		for(int k = 0; k < countArray.length; k++){
			if(countArray[k] != 0){
			System.out.println(k + " : " + countArray[k]);
			}
			if(countArray[k] != 2 && countArray[k] !=0){
				
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		DualArray da = new DualArray();
		
		int[] a = {1,2,1,3,3,2};
		System.out.println("Is Dual Array? :" + da.isDualArray(a));
		
		int[] b = {2,5,2,5,5};
		System.out.println("Is Dual Array? :" + da.isDualArray(b));
		
		int[] c = {3,1,1,2};
		System.out.println("Is Dual Array? :" + da.isDualArray(c));

	}

}
