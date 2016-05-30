package helloWorld;

public class GoodSpread {

	int isGoodSpread(int[] a){
		int countVal = 0;
		for(int i = 0; i < a.length; i++){
			countVal = 0;
			for(int j = 0; j < a.length; j++){
				if(a[i] == a[j]){
					countVal++;
				}
			}//end of for j
			if(countVal > 3){
				return 0;
			}
		}//end of for i
		return 1;
	}
	public static void main(String[] args) {
		
		GoodSpread gs = new GoodSpread();
		
		int[] a = {2,1,2,5,2,1,5,9};
		System.out.println("Is A good spred? :" +gs.isGoodSpread(a));
		

		int[] b = {3,1,3,1,3,5,5,3};
		System.out.println("Is B good spred? :" +gs.isGoodSpread(b));
	}

}
