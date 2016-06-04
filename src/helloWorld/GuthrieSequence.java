package helloWorld;

public class GuthrieSequence {
	int isGuthrieSequence(int[] a){
		int num = a[0];
		int i = 1;
		if(a[a.length-1] != 1){
			System.out.println("Guthrie Sequence must end with 1.");
			return 0;
		}
		while(num != 1){
			if(num%2 == 0){
				num /=2;				
			}else{
				num = num*3 + 1;
			}
			System.out.print(num);
			if(num != a[i]){
				return 0;
			}
			i++;
		}
		return 1;
	}
	public static void main(String[] args) {
		GuthrieSequence gs = new GuthrieSequence();
		int[] a = {8,4,2,1};
		System.out.println(gs.isGuthrieSequence(a));
		
		int[] b = {8,17,4,1};
		System.out.println(gs.isGuthrieSequence(b));
		
		int[] c = {8,4,1};
		System.out.println(gs.isGuthrieSequence(c));
		
		int[] d = {8,4,2};
		System.out.println(gs.isGuthrieSequence(d));

	}

}
