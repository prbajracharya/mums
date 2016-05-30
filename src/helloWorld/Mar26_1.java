package helloWorld;

public class Mar26_1 {

	int getExponent(int n, int p){
		if(p<=1){
			return -1;
		}
		int x = 0;
		
		for(int i = 1 ; n%p == 0; i++){
			n /= p;
			x = i;
		}
		return x;
	}
	public static void main(String[] args){
		Mar26_1 ge = new Mar26_1();
		
		System.out.println("n= 27, p = 3 : " + ge.getExponent(27, 3));
		
		System.out.println("n= 28, p = 3 : " + ge.getExponent(28, 3));
		
		System.out.println("n= 280, p = 7 : " + ge.getExponent(280, 7));
		
		System.out.println("n= -250, p = 5 : " + ge.getExponent(-250, 5));
		
		System.out.println("n= 18, p = 1 : " + ge.getExponent(18, 1));
		
		System.out.println("n= 128, p = 4 : " + ge.getExponent(128, 4));
	}
}
