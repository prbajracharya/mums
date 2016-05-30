package helloWorld;

public class Hollow {
	
	int isHollow(int[] a){
		
		int countStartNonZero = 0, countEndNonZero = 0;
		int countMidZeros = 0;
		
		for(int i = 0; a[i] != 0; i++){
			countStartNonZero++;
		}
		
		for(int j = a.length-1; a[j]!=0; j--){
			countEndNonZero++;
		}
		
		if(a[0]==0 || a[a.length-1]==0){
			return 0;
		}
		
		for(int k = 0; k<a.length; k++){
			if(a[k]!=0 && a[k+1] ==0 && a[k+2]!=0){
				return 0;
			}
			if(a[k]==0){
				countMidZeros++;
			}
			
		}
		
		if(countMidZeros<3){
			return 0;
		}
		
		if(countStartNonZero == countEndNonZero){
			return 1;
		}
		return 0;

	}
	public static void main(String[] args) {
		
		Hollow h = new Hollow();
		
		int[] a = {1,2,4,0,0,0,3,4,5};
		System.out.println("Is A an hollow array : " + h.isHollow(a));
		
		int[] b = {1,2,0,0,0,3,4,5};
		System.out.println("Is B an hollow array : " + h.isHollow(b));
		
		int[] c = {1,2,4,9,0,0,0,3,4,5};
		System.out.println("Is C an hollow array : " + h.isHollow(c));
		
		int[] d = {1,2,0,0,3,4};
		System.out.println("Is D an hollow array : " + h.isHollow(d));
		
		int[] e = {0,1,2,0,0,0,3,4};
		System.out.println("Is E an hollow array : " + h.isHollow(e));
		
		int[] f = {1,2,1,0,0,0,3,0,4};
		System.out.println("Is F an hollow array : " + h.isHollow(f));
		
		int[] g = {1,2,1,0,0,3,6,4};
		System.out.println("Is F an hollow array : " + h.isHollow(g));
	}

}
