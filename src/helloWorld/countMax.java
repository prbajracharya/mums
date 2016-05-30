package helloWorld;

public class countMax {

	int countMax(int[] a){
		int max=0;
		int count = 0;
		
		for(int i = 0; i < a.length; i++){
			if(a[i]>=max){
				max = a[i];
			}
		}
		for(int j = 0; j < a.length; j++){
			if(a[j] == max){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		countMax cm = new countMax();
		
		int[] a = {6,3,1,3,4,3,6,5};
		System.out.println("Max count of A is :" + cm.countMax(a));
		
		int[] b = {3,3,1,3,4,3,3,5,3,3};
		System.out.println("Max count of B is :" + cm.countMax(b));
		
		int[] c = {3,3,3,3};
		System.out.println("Max count of C is :" + cm.countMax(c));

	}

}
