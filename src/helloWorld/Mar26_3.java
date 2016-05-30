package helloWorld;

public class Mar26_3 {

	int isMaxMinEqual(int[] a){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int countMax = 0; 
		int countMin = 0;
		
		int diffElements = 0;
		
		if(a.length < 2){
			return 0;
		}
		for(int i = 0; i < a.length-1; i++){
			
			if(a[i] != a[i+1]){
				diffElements++;
			}
		}
		if(diffElements < 2){
			return 0;
		}
		
		for(int i = 0; i < a.length; i++){
			
			if(a[i] > max){
				max = a[i];
			}
			
			if(a[i] < min){
				min = a[i];
			}
		}//end of for i

		
		for(int j = 0; j < a.length; j++){
			if(a[j] == max){
				countMax++;
			}
			if(a[j] == min){
				countMin++;
			}
		}//end of for j
		
		if(countMax == countMin){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		Mar26_3 maxmin = new Mar26_3();
		
		int[] a = {};
		System.out.println("Is a maxmin equal array? : "+ maxmin.isMaxMinEqual(a));
		
		int[] b = {2};
		System.out.println("Is b maxmin equal array? : "+ maxmin.isMaxMinEqual(b));
		
		int[] c = {1,1,1,1,1,1};
		System.out.println("Is c maxmin equal array? : "+ maxmin.isMaxMinEqual(c));
		
		int[] d = {2,4,6,8,11};
		System.out.println("Is d maxmin equal array? : "+ maxmin.isMaxMinEqual(d));
		
		int[] e = {-2,-4,-6,-8,-11};
		System.out.println("Is e maxmin equal array? : "+ maxmin.isMaxMinEqual(e));
	}

}
