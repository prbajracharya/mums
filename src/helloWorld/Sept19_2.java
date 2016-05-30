package helloWorld;

public class Sept19_2 {

	int isSub(int[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			//System.out.println(a[i]);
			sum = 0;
			for(int j = i+1; j < a.length; j++){
				sum+=a[j];
			}
			//System.out.println("SUM : " + sum);
			if(a[i]<=sum){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Sept19_2 sub = new Sept19_2();
		
		int[] a = {13,6,3,2};
		System.out.println("Is A Sub array ? : "+ sub.isSub(a));
		
		int[] b = {11,5,3,2};
		System.out.println("Is B Sub array ? : "+ sub.isSub(b));

	}

}
