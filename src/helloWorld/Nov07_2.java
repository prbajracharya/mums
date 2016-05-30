package helloWorld;

public class Nov07_2 {

	int isMeera(int[] a){
		
		boolean hasOdd = false;
		int countStart = 0;
		int countEnd = 0;
		
		if(a[0]%2 != 0 || a[a.length-1]%2 != 0){
			return 0;
		}
		for(int i = 1; i < a.length-1; i++){
			if(a[i]%2 != 0){			
				countStart = i;
			//}else{
				hasOdd = true;
				break;
			}
		}
		for(int j = a.length-1; j > 0; j--){
			if(a[j]%2 == 0){
				countEnd++;
			}else{
				break;
			}
		}
		if(hasOdd && countStart == countEnd){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Nov07_2 meera = new Nov07_2();
		
		int[] a = {4,8,6,3,2,9,8,11,8,13,12,12,6};
		System.out.println("Is A meera array? :" + meera.isMeera(a));
		
		int[] b = {2,4,6,8,6};
		System.out.println("Is b meera array? :" + meera.isMeera(b));
		
		int[] c = {2,8,7,10,-4,6};
		System.out.println("Is c meera array? :" + meera.isMeera(c));

	}

}
