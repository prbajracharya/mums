package helloWorld;

public class NextPerfectSquare {

	public static void main(String[] args) {
		NextPerfectSquare nps = new NextPerfectSquare();
		System.out.println("Next perfect square after 6 :" + nps.nextPerfectSquare(6));
		System.out.println("Next perfect square after 36 :" + nps.nextPerfectSquare(36));
		System.out.println("Next perfect square after 0 :" + nps.nextPerfectSquare(0));
		System.out.println("Next perfect square after -5 :" + nps.nextPerfectSquare(-5));

	}
	public int nextPerfectSquare(int n){
		if(n<0){ return 0; }
		int i = n+1;
		while(true){
			for(int j = 0; j <= i; j++){
				if(j*j == i){
					return i;
				}
			}
			i++;
		}
		
	}

}
