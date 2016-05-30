package helloWorld;

public class CompleteArray {
	int isComplete(int[] a){
		int max = 0;
		boolean isComplete = false;
		for(int i = 0; i<a.length; i++){
			if(a[i]<1){
				return 0;
			}
			if(a[i] > max){
				max = a[i];
			}
		}
		for(int j = 2; j < max; j+=2){
			isComplete = false;
			for(int k = 0; k < a.length; k++){
				if(a[k] == j){
					isComplete = true;
				}
			}
			if(!isComplete){
				return 0;
			}
		}
		if(isComplete){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		CompleteArray ca = new CompleteArray();
		int[] a = {2,3,2,4,11,6,10,9,8};
		System.out.println("Is Array complete? : "+ ca.isComplete(a));
		
		int[] b = {2,3,3,6};
		System.out.println("Is Array complete? : "+ ca.isComplete(b));
		
		int[] c = {2,-3,4,3,6};
		System.out.println("Is Array complete? : "+ ca.isComplete(c));
		
		int[] d = {2,3,3,6,8};
		System.out.println("Is Array complete? : "+ ca.isComplete(d));
	}

}
