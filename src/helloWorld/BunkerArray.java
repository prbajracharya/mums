package helloWorld;

public class BunkerArray {
	int isBunker(int n){
		int[] a = new int[100];
		a[0] = 1;
		for(int i = 1 ; i < 100; i++){
			a[i] = a[i-1] + (i-1);
		}
		for(int j = 1; j < a.length; j++){
			if(a[j] == n){
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		BunkerArray ba = new BunkerArray();
		
		System.out.println("Is Bunker Array? : "+ ba.isBunker(16));
		System.out.println("Is Bunker Array? : "+ ba.isBunker(11));
		System.out.println("Is Bunker Array? : "+ ba.isBunker(22));
		System.out.println("Is Bunker Array? : "+ ba.isBunker(8));

	}

}
