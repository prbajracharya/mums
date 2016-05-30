package helloWorld;

public class Exponent {

	int getExponent(int n, int p){
		if(p <= 1){
			return -1;
		}
		int expo = 0;
		for(int i = 1; n%p == 0; i++){
			expo = i;
			n/=p;
		}
		return expo;
	}
	public static void main(String[] args) {
		Exponent e = new Exponent();
		System.out.println("n = 27, p = 3 : " + e.getExponent(27, 3));
		System.out.println("n = 28, p = 3 : " + e.getExponent(28, 3));
		System.out.println("n = 280, p = 7 : " + e.getExponent(280, 7));
		System.out.println("n = -250, p = 5 : " + e.getExponent(-250, 5));
		System.out.println("n = 18, p = 1 : " + e.getExponent(18, 1));
		System.out.println("n = 128, p = 4 : " + e.getExponent(128, 4));

	}

}
