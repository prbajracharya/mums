package helloWorld;

public class IsGoodSpread {

	int goodSpread(int[] a){
		int count = 0;
		
		for(int i = 0; i < a.length; i++){
			count = 0;
			for(int j = 0; j < a.length; j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count > 3){
				return 0;
			}
		}//end of for i
		return 1;
	}
	public static void main(String[] args) {
		
		IsGoodSpread igs = new IsGoodSpread();
		
		int[] a = {2,1,2,5,2,1,5,9};
		System.out.println("Is A a good spread array?:"+igs.goodSpread(a));
		
		int[] b = {3,1,3,1,3,5,5,3};
		System.out.println("Is B a good spread array?:"+igs.goodSpread(b));
		
		int[] c = {};
		System.out.println("Is C a good spread array?:"+igs.goodSpread(c));
	}

}
