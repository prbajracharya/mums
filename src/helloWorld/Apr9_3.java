package helloWorld;

public class Apr9_3 {
	int isMeeraArray(int[] a){
		for(int i = 0; i < a.length; i++){
			
			for(int j = 0; j < a.length; j++){
				if(a[j] == 2*a[i]){
					return 0;
				}
			}//end of inner for j
		}
		return 1;
	}

	public static void main(String[] args) {
		Apr9_3 isMeera = new Apr9_3();
		
		int[] a = {3,5,-2};
		System.out.println("Is a Meera array? : "+ isMeera.isMeeraArray(a));

		int[] b = {8,3,4};
		System.out.println("Is b Meera array? : "+ isMeera.isMeeraArray(b));

	}

}
