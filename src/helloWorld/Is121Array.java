package helloWorld;

public class Is121Array {
	
	int is121Array(int[] a){
		int countStartOne = 0;
		int countEndOne = 0;
		
		if(a[0]!=1){
			return 0;
		}
		
		for(int i = 0; i < a.length-2; i++){
			if(a[i]!=1 ){
				if(a[i]!=2){
					return 0;
				}
			}
			
			if(a[i]==2 && a[i+1]==1 && a[i+2]==2){
				return 0;
			}
		}//end of for i	
			for(int i = 0; i < a.length; i++){
				if(a[i]==1){
				countStartOne++;
				}else if (a[i]!=1){
					break;
				}
			}
			//System.out.println("CountStartOne : " + countStartOne);
			
			for(int j = a.length-1; j >  0 ; j--){
				if(a[j]==1){
					countEndOne++;
				}else if(a[j]!= 1){
					break;
				}
			}
			//System.out.println("CountEndOne : " + countEndOne);
			
			if(countStartOne != countEndOne){
				return 0;
			}
			
			return 1;

	}
	public static void main(String[] args) {
		Is121Array ia = new Is121Array();
		
		int[] a = {1,2,1};
		System.out.println("Is A an 121 Array? : "+ ia.is121Array(a));
		
		int[] b = {1,1,2,2,2,1,1};
		System.out.println("Is B an 121 Array? : "+ ia.is121Array(b));
		
		int[] c = {1,1,2,2,2,1,1,1};
		System.out.println("Is C an 121 Array? : "+ ia.is121Array(c));
		
		
		int[] f = {1,1,2,1,2,1,1};
		System.out.println("Is F an 121 Array? : "+ ia.is121Array(f));
		
		int[] g = {1,1,1,2,2,2,1,1,1,3};
		System.out.println("Is G an 121 Array? : "+ ia.is121Array(g));
		
		int[] h = {1,1,1,1,1,1};
		System.out.println("Is H an 121 Array? : "+ ia.is121Array(h));
		
		int[] d = {2,2,2,1,1,1,2,2,2,1,1};
		System.out.println("Is D an 121 Array? : "+ ia.is121Array(d));
		
		int[] e = {1,1,1,2,2,2,1,1,2,2};
		System.out.println("Is E an 121 Array? : "+ ia.is121Array(e));
		
		int[] i = {2,2,2};
		System.out.println("Is E an 121 Array? : "+ ia.is121Array(i));
	}

}
