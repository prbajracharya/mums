package helloWorld;

public class MinMaxEqual {

	int isMinMaxEqual(int[] a){
		int countDiff = 1; 
		int max = -1000;
		int min = 1000;
		
		int countMax = 0, countMin = 0;
		
		//System.out.println("Array Length : " + a.length);
		if(a.length < 2){
			return 0 ;
		}
		
		for(int i = 0; i < a.length-1; i++){
			//for(int j = 0; j < a.length; j++){
				if(a[i] != a[i+1]){
					countDiff++;
				}
			//}
			
			if(a[i] < min){
				min = a[i];
			}
			if(a[i] > max){
				max = a[i];
			}
			
		}//end of for i
		
		//System.out.println("Max : " + max);
		//System.out.println("Min : " + min);
		
		if(countDiff < 2){
			System.out.println("countDiff : " + countDiff);
			return 0;
		}
		
		
		for(int j = 0; j < a.length; j++){
			if(a[j] == max){
				countMax++;
			}
			if(a[j] == min){
				countMin++;
			}
		}
		//System.out.println("MaxCount : " + countMax);
		//System.out.println("MinCount : " + countMin);
		if(countMax == countMin){
			return 1;
		}
		return 1;
	}
	public static void main(String[] args) {
		MinMaxEqual mme = new MinMaxEqual();
		
		int[] a = {};
		System.out.println("Is Min Max Equal for A ? : " + mme.isMinMaxEqual(a));
		
		int[] b = {2};
		System.out.println("Is Min Max Equal for B ? : " + mme.isMinMaxEqual(b));
		
		int[] c = {1,1,1,1,1,1};
		System.out.println("Is Min Max Equal for C ? : " + mme.isMinMaxEqual(c));
		
		int[] d = {2,4,6,8,11};
		System.out.println("Is Min Max Equal for D ? : " + mme.isMinMaxEqual(d));
		
		int[] e = {-2,-4,-6,-8,-11};
		System.out.println("Is Min Max Equal for E ? : " + mme.isMinMaxEqual(e));

	}

}
