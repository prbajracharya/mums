package helloWorld;

public class Dec05_1 {

	int isEvenSubset(int m, int n){
		for(int i = 2; i < m; i+=2){
			if(m%i == 0){
				if(n%i != 0){
					return 0;
				}
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Dec05_1 es = new Dec05_1();
		System.out.println("Is 18 an even subset of 12 ? : " + es.isEvenSubset(18, 12));
		
		System.out.println("Is 18 an even subset of 32 ? : " + es.isEvenSubset(18, 32));

	}

}
