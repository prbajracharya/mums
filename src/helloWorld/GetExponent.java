package helloWorld;

public class GetExponent {
	int getExponent(int n, int p){
		if(p <= 1){
			return -1;
		}
		int expo = 0;
		for(; n%p==0; n=n/p){
			expo++;
		}
		return expo;
	}
	public static void main(String[] args) {
		GetExponent gp = new GetExponent();
		System.out.println("n = 27, p = 3 :" + gp.getExponent(27, 3));
		
		System.out.println("n = 28, p = 3 :" + gp.getExponent(28, 3));
		
		System.out.println("n = 280, p = 7 :" + gp.getExponent(270, 7));
		
		System.out.println("n = -250, p = 5 :" + gp.getExponent(-250, 5));
		
		System.out.println("n = 18, p = 1 :" + gp.getExponent(18, 1));
		
		System.out.println("n = 128, p = 4 :" + gp.getExponent(128, 4));

	}

}
