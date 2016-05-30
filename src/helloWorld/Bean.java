package helloWorld;

public class Bean {

	int isBeanArray(int[] a){
		
		boolean has9 = false, has13 = false, has7 = false, has16 = false;
		
		for(int i = 0; i < a.length; i++){
			
			if(a[i]==9){ has9 = true; } 
			if(a[i]==13){ has13 = true; } 
			if(a[i]==7){ has7 = true; } 
			if(a[i]==16){ has16 = true; } 
		}
		System.out.println(
				  "has9 : " + has9 + 
				" has13 : " + has13 + 
				" has7 : " + has7 +
				" has16 : " + has16
				);
		if(has9 && !has13) {return 0;}
		if(has7 && has16) { return 0; }

		return 1;
	}
	public static void main(String[] args) {
		Bean ib = new Bean();
		
		int[] a = {1,2,3,9,6,13};
		System.out.println("Is a Bean Array? : "+  ib.isBeanArray(a));
		
		int[] b = {3,4,6,7,13,15};
		System.out.println("Is b Bean Array? : "+  ib.isBeanArray(b));
		
		int[] c = {1,2,3,4,10,11,12};
		System.out.println("Is c Bean Array? : "+  ib.isBeanArray(c));
		
		int[] d = {3,6,9,5,7,13,6,17};
		System.out.println("Is d Bean Array? : "+  ib.isBeanArray(d));
		
		int[] e = {9,6,18};
		System.out.println("Is e Bean Array? : "+  ib.isBeanArray(e));
		
		int[] f = {4,7,16};
		System.out.println("Is f Bean Array? : "+  ib.isBeanArray(f));

	}

}
