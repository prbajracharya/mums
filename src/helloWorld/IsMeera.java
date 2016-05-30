package helloWorld;

public class IsMeera {

	int isMeera(int[] a){
		int StartEvenCnt = 0;
		int EndEvenCnt = 0;
		boolean hasOdd = false;
		/*
		if(a[0]%2 != 0 || a[a.length-1]%2 != 0){
			return 0;
		}
		*/
		for(int i = 0; i < a.length; i++){
			if(a[i]%2 == 0){
				StartEvenCnt++;
			}else{
				hasOdd = true;
				break;
			}
		}//end of for i
		
		for(int j = a.length-1; j >= 0; j--){
			if(a[j]%2 == 0){
				EndEvenCnt++;
			}else{
				hasOdd = true;
				break;
			}
		}
		
		System.out.println("StartEvenCnt :"+ StartEvenCnt);
		System.out.println("EndEvenCnt :"+ EndEvenCnt);
		System.out.println("hasOdd :"+ hasOdd);
		
		if(StartEvenCnt == EndEvenCnt && hasOdd){
			return 1;
		}
		return 0;
		
	}
	public static void main(String[] args) {
		
		IsMeera im = new IsMeera();
		
		int[] a = {4,8,6,3,2,9,8,11,8,13,12,12,6};
		System.out.println("Is A an Meera array? :"+ im.isMeera(a));
		

		int[] b = {2,4,6,8,6};
		System.out.println("Is A an Meera array? :"+ im.isMeera(b));
		

		int[] c = {2,8,7,10,-4,6};
		System.out.println("Is A an Meera array? :"+ im.isMeera(c));

	}

}
