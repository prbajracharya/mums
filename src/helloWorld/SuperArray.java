package helloWorld;

public class SuperArray {

	int isSuper(int[] a){
		int sum = 0;
		boolean isSuperArray = false;
		for(int i = 0; i < a.length; i++){
			sum = 0;
			isSuperArray = false;
			for(int j = 0; j < i; j++){
				sum+=a[j];
			}
			System.out.println("Element : "+ a[i]);
			System.out.println("Sum : "+ sum);
			if(sum < a[i]){
				isSuperArray = true;
			}
			if(isSuperArray == false){
				return 0;
			}
		}//end of for i
		return 1;
	}
	public static void main(String[] args) {
		
		SuperArray sa = new SuperArray();
		int[] a = {2,3,6,13};
		System.out.println("Is A a super array? : "+ sa.isSuper(a));
		
		int[] b = {2,3,5,11};
		System.out.println("Is B a super array? : "+ sa.isSuper(b));
		
		//int[] c = {0,3,5,10};
		//System.out.println("Is C a super array? : "+ sa.isSuper(c));
	}

}
