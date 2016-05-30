package helloWorld;
// pg 103 Aug 8th 2015 Question no 1
public class Meera {
	int isMeera(int n){
		int numOfNonTrivialFactors = 0;
		for(int i = 2; i<n; i++){
			if(n%i == 0){
				numOfNonTrivialFactors++;
			}
		}
		if(n%numOfNonTrivialFactors == 0){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Meera m = new Meera();
		System.out.println("Is 6 a Meera number? :" + m.isMeera(6));
		
		System.out.println("Is 30 a Meera number? :" + m.isMeera(30));
		
		System.out.println("Is 21 a Meera number? :" + m.isMeera(21));

	}

}
