package helloWorld;

public class Apr23_3 {

	int isHollow(int[] a){
		int startNZ = 0, endNZ = 0, midZeros = 0;
		
		for(int i = 0; a[i] != 0; i++){
				startNZ++;
		}
		
		for(int j = startNZ; a[j] == 0; j++){
			midZeros++;
		}
		
		for(int k = a.length-1; a[k] != 0; k--){
			endNZ++;
		}
		
		if(midZeros < 3){
			return 0;
		}
		//System.out.println("startNZ : "+startNZ);
		//System.out.println("endNZ : "+endNZ);
		if(startNZ == endNZ){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Apr23_3 hollow = new Apr23_3();
		
		int[] a = {1,2,4,0,0,0,3,4,5};
		System.out.println("Is A hollow array?:"+ hollow.isHollow(a));
		
		int[] b = {1,2,0,0,0,3,4,5};
		System.out.println("Is B hollow array?:"+ hollow.isHollow(b));
		
		int[] c = {1,2,4,9,0,0,0,3,4,5};
		System.out.println("Is C hollow array?:"+ hollow.isHollow(c));

	}

}
