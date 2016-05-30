package helloWorld;

public class Feb27_1{
	int isEvenSpaced(int[] a){
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
			
			if(a[i] < min){
				min = a[i];
			}
		}
		
		if((max-min)%2 == 0){
			return 1;
		}
			
		return 0;
	}

	public static void main(String[] args) {
		Feb27_1 es = new Feb27_1();
		
		int[] a = {100, 19, 131, 140};
		System.out.println("Is A even spaced? : "+ es.isEvenSpaced(a));
		
		int[] b = {200, 1, 151, 160};
		System.out.println("Is b even spaced? : "+ es.isEvenSpaced(b));
		
		int[] c = {200, 10, 151, 160};
		System.out.println("Is c even spaced? : "+ es.isEvenSpaced(c));
		
		int[] d = {100, 19, -131, -140};
		System.out.println("Is d even spaced? : "+ es.isEvenSpaced(d));
		
		int[] e = {80, -56, 11, -81};
		System.out.println("Is e even spaced? : "+ es.isEvenSpaced(e));
	}
}
