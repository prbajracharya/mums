package helloWorld;

public class Nov21_3 {

	int isHollow(int[] a){
		boolean start = true;
		int countStart=0, countEnd=0, countMid=0;
		
		for(int i = 0; i < a.length; i++){
			if(a[i]!=0 && start == true){
				countStart++;
			}
			if(a[i]==0){
				countMid++;
				start = false;
			}
			if(a[i]!=0 && start == false){
				countEnd++;
			}
		}
		if(countMid >= 3 && countStart == countEnd){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Nov21_3 hollow = new Nov21_3();
		
		int[] a = {1,2,4,0,0,0,3,4,5};
		System.out.println("Is a hollow array? : " + hollow.isHollow(a));
		
		int[] b = {1,2,0,0,0,3,4,5};
		System.out.println("Is b hollow array? : " + hollow.isHollow(b));
		
		int[] c = {1,2,4,9,0,0,0,3,4,5};
		System.out.println("Is c hollow array? : " + hollow.isHollow(c));
		
		int[] d = {1,2,0,0,3,4};
		System.out.println("Is d hollow array? : " + hollow.isHollow(d));

	}

}
