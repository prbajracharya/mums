package helloWorld;

public class Sept19_3 {

	int isSym(int[] a){
		for(int i = 0; i < a.length; i++){
			if(a[i]%2 != a[a.length-1 - i]%2){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Sept19_3 sym = new Sept19_3();
		
		int[] a = {2,7,9,10,11,5,8};
		System.out.println("Is a symmetric array? : "+ sym.isSym(a));
		
		int[] b = {9,8,7,13,14,17};
		System.out.println("Is b symmetric array? : "+ sym.isSym(b));
		
		int[] c = {2,7,8,9,11,13,10};
		System.out.println("Is c symmetric array? : "+ sym.isSym(c));
		
		

	}

}
