package helloWorld;

public class Feb27_3 {

	int isSym(int[] a){
		
		for(int i = 0; i < a.length; i++){
			if(a[i]%2 != a[(a.length) - (i+1)]%2){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		
		Feb27_3 sym = new Feb27_3();
		
		int[] a = {2,7,9,10,11,5,8};
		System.out.println("Is a Sym array?: "+ sym.isSym(a));
		
		int[] b = {9,8,7,13,14,17};
		System.out.println("Is b Sym array?: "+ sym.isSym(b));
		
		int[] c = {2,7,8,9,11,13,10};
		System.out.println("Is c Sym array?: "+ sym.isSym(c));
	}

}
