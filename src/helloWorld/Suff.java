package helloWorld;

public class Suff {

	int isSuff(int[] a){
		
		boolean isSuff = false;
		for(int i = 0; i < a.length; i++){
			isSuff = false;
			for(int j = 0; j < a.length; j++){
				if(a[j] == a[i]+1 || a[j] == a[i]-1){
					isSuff = true;
				}
			}
			if(!isSuff){
				return 0;
			}

		}//end of for i

		return 1;
	}
	public static void main(String[] args) {
		
		Suff s = new Suff();
		
		int[] a = {2,10,9,3};
		System.out.println("Is a Suff array?:"+ s.isSuff(a));
		
		int[] b = {2,2,3,3,3};
		System.out.println("Is b Suff array?:"+ s.isSuff(b));
		
		int[] c = {1,1,1,2,1,1};
		System.out.println("Is c Suff array?:"+ s.isSuff(c));
		
		int[] d = {0,-1,1};
		System.out.println("Is d Suff array?:"+ s.isSuff(d));
		
		int[] e = {3,4,5,7};
		System.out.println("Is e Suff array?:"+ s.isSuff(e));
	}

}
