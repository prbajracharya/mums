package helloWorld;

public class Apr9_1 {

	int countDigit(int n, int digit){
		
		if(n<0 || digit < 0){
			return -1;
		}
		
		int countDigit = 0;
		
		for(; n%10 != 0; n/=10){
			if(n%10 == digit){
				countDigit++;
			}
		}

		return countDigit;
	}
	public static void main(String[] args) {
		
		Apr9_1 cd = new Apr9_1();
		
		System.out.println(cd.countDigit(3333, 3));
		
		System.out.println(cd.countDigit(3333, 6));
		
		System.out.println(cd.countDigit(3, 3));
		
		System.out.println(cd.countDigit(-543, 3));
	}

}
