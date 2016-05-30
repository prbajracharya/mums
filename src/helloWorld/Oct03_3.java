package helloWorld;

public class Oct03_3 {

	int isWave(int[] a){
		for(int k = 0; k < a.length-1; k++){
			if(a[k]%2 == a[k+1]%2){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		
		Oct03_3 wave = new Oct03_3();
		int[] a = {7,2,9,10,5};
		System.out.println("Is a an wave array?" + wave.isWave(a));
		
		int[] b = {4,11,12,1,6};
		System.out.println("Is b an wave array?" + wave.isWave(b));
		
		int[] c = {1,0,5};
		System.out.println("Is c an wave array?" + wave.isWave(c));
		
		int[] d = {2};
		System.out.println("Is d an wave array?" + wave.isWave(d));
		
		int[] e = {2,6,3,4};
		System.out.println("Is e an wave array?" + wave.isWave(e));
	}

}
