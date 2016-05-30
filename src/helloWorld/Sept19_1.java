package helloWorld;

public class Sept19_1 {

	int isEvenSpaced(int a[]){
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
		
		if((max-min)%2 ==0){
			return 1;
		}
		/*
		if(max%2 == min%2){
			return 1;
		}
		*/
		return 0;
	}
	public static void main(String[] args) {
		Sept19_1 evenSpaced = new Sept19_1();
		
		int[] a ={100,19,131,140};
		System.out.println("Is A even spaced ?: "+ evenSpaced.isEvenSpaced(a));
		
		int[] b ={200,1,151,160};
		System.out.println("Is B even spaced ?: "+ evenSpaced.isEvenSpaced(b));
		
		int[] c ={200,10,151,160};
		System.out.println("Is C even spaced ?: "+ evenSpaced.isEvenSpaced(c));
		
		int[] d ={100,19,-131,-140};
		System.out.println("Is D even spaced ?: "+ evenSpaced.isEvenSpaced(d));
		
		int[] e ={80,-56,11,-81};
		System.out.println("Is E even spaced ?: "+ evenSpaced.isEvenSpaced(e));
	}

}
