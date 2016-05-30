package helloWorld;

public class Balanced {

	int isBalanced(int[] a){
		boolean isBalanced = false;
		for(int i = 0; i < a.length; i++){
			isBalanced = false;
			for(int j = 0; j < a.length; j++){
				if(a[i] == -a[j]){
					isBalanced = true;
					break;
				}
			}
			if(isBalanced == false){
				return 0;
			}
		}
		if(isBalanced == true){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Balanced bal = new Balanced();
		
		int[] a = {-2,3,2,-3};
		System.out.println("Is A a balanced array? : " + bal.isBalanced(a));
		
		int[] b = {-2,2,2,2};
		System.out.println("Is B a balanced array? : " + bal.isBalanced(b));
		
		int[] c = {-5,2,-2};
		System.out.println("Is C a balanced array? : " + bal.isBalanced(c));

	}

}
