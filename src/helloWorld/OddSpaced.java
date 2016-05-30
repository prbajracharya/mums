package helloWorld;

public class OddSpaced {
	int isOddSpaced(int[] a){
		if(a.length < 2){
			return 0;
		}
		int max = 0, min = 1000;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
			if(a[i]<min){
				min = a[i];
			}
		}
		if((max-min)%2 != 0){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		OddSpaced os = new OddSpaced();
		int[] a = {100, 19, 131, 140};
		System.out.println("Is A OddSpaced? :"+os.isOddSpaced(a));
		
		int[] b = {200, 1, 151, 160};
		System.out.println("Is B OddSpaced? :"+os.isOddSpaced(b));
		
		int[] c = {200,10,151,160};
		System.out.println("Is C OddSpaced? :"+os.isOddSpaced(c));
		
		int[] d = {100,19,-131,-140};
		System.out.println("Is D OddSpaced? :"+os.isOddSpaced(d));
		
		int[] e = {80,-56,11,-81};
		System.out.println("Is E OddSpaced? :"+os.isOddSpaced(e));

	}

}
