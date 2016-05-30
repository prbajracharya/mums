package helloWorld;

public class Jan09_1 {

	int minDistance(int n){

		int prevNTF = 0;
		int NTF = 0;
		
		int countNTF = 0;
		int minDistance = Integer.MAX_VALUE;

		for(int i = 2; i < n; i++){
			if(n%i == 0){
				countNTF++;
				
				prevNTF = NTF;
				NTF = i;

				if((NTF - prevNTF) < minDistance){
					minDistance = (NTF - prevNTF);
				}
			}//end of outer if
		}//end of for i
		
		if(countNTF == 1){
			return 0;
		}
		if(countNTF == 0){
			return -1;
		}
		return minDistance;
		
	}
	public static void main(String[] args) {
		
		Jan09_1 md = new Jan09_1();
		
		System.out.println("Min Distance among non trivial factors of 63 : " + md.minDistance(63));
		
		System.out.println("Min Distance among non trivial factors of 25 : " + md.minDistance(25));
		
		System.out.println("Min Distance among non trivial factors of 11 : " + md.minDistance(11));
	}

}
