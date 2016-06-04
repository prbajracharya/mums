package helloWorld;

public class FancyNum {

	int isFancy(int n){
		//if(n<=1){
			//return 1;
		//}

		int f1 = 1, f2 = 1; 
		System.out.print(f1 + ", " + f2 + ", ");
		
		for(int f3 = 2; f3 <= n; ){
			f3 = 3*f2 + 2* f1;
			f1 = f2;
			f2 = f3;
			
			System.out.print(f3 + ", ");
			if(n == f3){
				return 1;
			} 
			
		}//end of for i

		return 0;
	}
	
	int isFancyRecur(int n){
		if(n<=1){
			return 1;
		}
		if ( n == (3*isFancyRecur(n-1) + 2*isFancyRecur(n-2)) ){
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		FancyNum fn = new FancyNum();
		
		System.out.println("Is 17 a fancy number? : " + fn.isFancy(17));
		
		//System.out.println("Is 17 a fancy number? : " + fn.isFancyRecur(17));
		
		System.out.println("Is 61 a fancy number? : " + fn.isFancy(61));
		
		System.out.println("Is 16 a fancy number? : " + fn.isFancy(16));
	}

}
