package helloWorld;

public class MeeraOddEven {
	int isMeera(int[] a){
		boolean containsOdd = false;
		int num_startEven = 0, num_EndEven = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i]%2!=0){
				num_startEven = i;
				containsOdd = true;
				break;
			}
		
			//System.out.println(i);
		}//end for i
		System.out.println(num_startEven);
		
		for(int j = a.length-1; j >= 0; j--){
			if(a[j]%2 != 0){
				num_EndEven = a.length-1 - j;
				break;
			}
			
		}
		System.out.println(num_EndEven);
		if(a[0]%2 != 0 || a[a.length-1]%2 != 0 || containsOdd== false || num_startEven != num_EndEven){
			return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		MeeraOddEven moe = new MeeraOddEven();
		int[] a = {4,8,6,3,2,9,8,11,8,13,12,12,6};
		System.out.println("Is A a Meera Odd Even array? : " + moe.isMeera(a));
		
		int[] b = {2,4,6,8,6};
		System.out.println("Is B a Meera Odd Even array? : " + moe.isMeera(b));
		
		int[] c = {2,8,7,10,-4,6};
		System.out.println("Is C a Meera Odd Even array? : " + moe.isMeera(c));
		
		int[] d = {1,2,8,7,10,-4,6};
		System.out.println("Is D a Meera Odd Even array? : " + moe.isMeera(d));

	}

}
