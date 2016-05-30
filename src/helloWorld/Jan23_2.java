package helloWorld;

public class Jan23_2 {

	int isMeera(int[] a){
		boolean has1  = false, has9 = false;
		for(int i = 0; i < a.length; i++){
			if(a[i] == 1){
				has1 = true;
			}
			
			if(a[i] == 9){
				has9 = true;
			}
			
		}
		if(has1 == has9){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		Jan23_2 m = new Jan23_2();
		
		int[] a = {7,6,1};
		System.out.println("Is A Meera array? : "+ m.isMeera(a));
		
		int[] b = {9,10,0};
		System.out.println("Is B Meera array? : "+ m.isMeera(b));
		
		int[] c = {1,1,0,8,0,9,9,1};
		System.out.println("Is C Meera array? : "+ m.isMeera(c));
		
		int[] d = {6,10,8};
		System.out.println("Is D Meera array? : "+ m.isMeera(d));
		
		int[] e = {7,9,0,10,1};
		System.out.println("Is E Meera array? : "+ m.isMeera(e));

	}

}
