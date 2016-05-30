package helloWorld;

public class Guthrie {
	int isGuthrie(int n){
		int[] a = new int[100];
		a[0] = 1;
		for(int k = 1; k<100; k++){
			a[k] = a[k-1] + (k-1);
			//System.out.println(a[k]);
		}
		for(int i = 1; i < 100; i++){
			if(a[i] == n){
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Guthrie g = new Guthrie();
		int a = 11;
		
		if(g.isGuthrie(a) == 1){
			System.out.println("The array is a Guthrie Array.");
		}else{
			System.out.println("The array is not Guthrie Array.");
		}
		System.out.println("22:"+g.isGuthrie(22));
		System.out.println("22:"+g.isGuthrie(8));

	}

}
