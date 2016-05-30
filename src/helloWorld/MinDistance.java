package helloWorld;

public class MinDistance {

	int minDistance(int num){
		int minDist = Integer.MAX_VALUE;
		int preFactor = 0, factor = 1;
		int dist = 0;
		
		for(int i = 2; i <= num; i++){
			if(num%i == 0){
				preFactor = factor;
				factor = i;
				//System.out.println(factor);
				dist = factor - preFactor;
				//System.out.println("DIST : " +dist);
				if(dist < minDist){
					minDist = dist;
				}
			}
		}
		return minDist;
	}
	public static void main(String[] args) {
		MinDistance d = new MinDistance();
		
		System.out.println("MinDistance of Factors of 13013 : " + d.minDistance(13013));
		
		System.out.println("MinDistance of Factors of 8 : " + d.minDistance(8));

	}

}
