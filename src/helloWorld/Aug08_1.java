package helloWorld;

public class Aug08_1 {

	int isMeera(int n){
		int countFactors =0;
		for(int i = 2; i < n; i++){
			if(n%i ==0){
				countFactors++;
			}
		}
		if(n%countFactors == 0){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Aug08_1 meera = new Aug08_1();
		
		System.out.println("Is 6 an Meera array? : " + meera.isMeera(6));
		
		System.out.println("Is 30 an Meera array? : " + meera.isMeera(30));
		
		System.out.println("Is 21 an Meera array? : " + meera.isMeera(21));

	}

}
