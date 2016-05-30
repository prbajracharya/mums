package helloWorld;

public class Sept05_1 {

	int isBunker(int n){
		if(n==1){return 1;}
		int bun1 = 1, bun2;
		for(int k = 1; k < n ; k++){
			bun2 = bun1 + k;
			bun1 = bun2;
			
			if(n == bun2){
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Sept05_1 bunker = new Sept05_1();
		System.out.println("Is 11 an Bunker array ? : " + bunker.isBunker(11));
		
		System.out.println("Is 22 an Bunker array ? : " + bunker.isBunker(22));
		
		System.out.println("Is 8 an Bunker array ? : " + bunker.isBunker(8));
		
		System.out.println("Is 1 an Bunker array ? : " + bunker.isBunker(1));
		
		System.out.println("Is 2 an Bunker array ? : " + bunker.isBunker(2));

	}

}
