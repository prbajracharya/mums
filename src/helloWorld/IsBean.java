package helloWorld;

public class IsBean {

	int isBeanArray(int[] a){
		boolean isBeanArray1 = true, isBeanArray2 = true;
		
		for(int i = 0; i < a.length; i++){
			if(a[i]==9){
			isBeanArray1 = false;
				for(int j = 0; j < a.length; j++){
					if(a[j]==13){
						isBeanArray1 = true;
					}
				}
			}
			
			if(a[i]==7){
				isBeanArray2 = true;
				for(int j = 0; j< a.length; j++){
					if(a[j]==16){
						isBeanArray2 = false;
					}
				}
			}
		}//end of for i
		
		System.out.print("isBeanArray1 : " + isBeanArray1 + " , isBeanArray2 : " + isBeanArray2);
		System.out.println();
		if(isBeanArray1 && isBeanArray2){
			return 1;
		}
		
		return 0;
	}
	public static void main(String[] args) {
	
		IsBean ib = new IsBean();
		
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
