package helloWorld;

public class Feb27_2 {

	int isSub(int[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum=0;
			for(int j=i+1; j< a.length; j++){
				sum += a[j];
			}
			if(a[i] <= sum){
				return 0;
			}
		}//end of for i
		return 1;
	}
	public static void main(String[] args){
		Feb27_2 sub = new Feb27_2();
		
		int[] a = {13,6,3,2};
		System.out.println("Is a sub array?:"+sub.isSub(a));
		
		int[] b = {11,5,3,2};
		System.out.println("Is b sub array?:"+sub.isSub(b));
	}
}
