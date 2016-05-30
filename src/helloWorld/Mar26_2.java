package helloWorld;

public class Mar26_2 {

	int is121Array(int[] a){
		int startOne = 0; 
		int endOne = 0;
		boolean has2 = true;
		
		if(a[0] != 1 || a[a.length-1] != 1){
			return 0;
		}
		for(int k = 0; k < a.length-2; k++){
			if(a[k] ==2 && a[k+1] == 1 && a[k+2] == 2){
				return 0;
			}
		}
		for(int i = 0; i < a.length; i++){
			if(a[i]!=1){
				if(a[i] != 2){
					return 0;
				}
			}
			if(a[i] != 2){
				startOne++;
			}
			if(a[i] == 2){
				has2 = true;
				break;
			}
		}
		
		for(int j = a.length-1; j > 0; j--){
			if(a[j]!=2){
				endOne++;
			}else{break;}
		}
		//System.out.println(startOne + " : " + endOne);
		if(startOne == endOne && has2){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Mar26_2 is121 = new Mar26_2();
		
		int[] a = {1,2,1};
		System.out.println("Is a 121 Array? :" + is121.is121Array(a));
		
		int[] b = {1,1,2,2,2,1,1};
		System.out.println("Is b 121 Array? :" + is121.is121Array(b));
		
		int[] c = {1,1,2,2,2,1,1,1};
		System.out.println("Is c 121 Array? :" + is121.is121Array(c));
		
		int[] d = {1,1,2,1,2,1,1};
		System.out.println("Is d 121 Array? :" + is121.is121Array(d));
		
		int[] e = {1,1,1,2,2,2,1,1,1,3};
		System.out.println("Is e 121 Array? :" + is121.is121Array(e));
		
		int[] f = {1,1,1,1,1,1};
		System.out.println("Is f 121 Array? :" + is121.is121Array(f));
		
		int[] g = {2,2,2,1,1,1,2,2,2,1,1};
		System.out.println("Is g 121 Array? :" + is121.is121Array(g));
		
		int[] h = {1,1,1,2,2,2,1,1,2,2};
		System.out.println("Is h 121 Array? :" + is121.is121Array(h));
		
		int[] i = {2,2,2};
		System.out.println("Is i 121 Array? :" + is121.is121Array(i));

	}

}
