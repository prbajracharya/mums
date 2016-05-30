package helloWorld;

public class Nov07_3 {

	int goodSpread(int[] a){
		
		for(int i = 0 ; i < a.length; i++){
			int count = 0;
			for(int j = 0 ; j < a.length; j++){
				if(a[i] == a[j]){
					count++;
				}
			}//end of inner for j 
			if(count > 3){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		
		Nov07_3 gs = new Nov07_3();
		
		int[] a = {2,1,2,5,2,1,5,9};
		System.out.println("Is a good spread ? :"+ gs.goodSpread(a));
		
		int[] b = {3,1,3,1,3,5,5,3};
		System.out.println("Is b good spread ? :"+ gs.goodSpread(b));
	}

}
