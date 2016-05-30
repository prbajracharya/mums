package helloWorld;

public class isSym {

	int isSym(int[] a){
		int j = a.length-1;
		int check1 = 0, check2 = 0;

		for(int i = 0; i < a.length/2; i++){
			
			if(a[i]%2 ==0){
				check1 = 1;
			}else{
				check1 = 0;
			}
			if(a[j]%2==0){
				check2 = 1;
			}else{
				check2 = 0;
			}

			//System.out.println(a[i] + " " + a[j]);
			//System.out.println(check1 + " " + check2);
			
			j--;
		if(check1 != check2){
			return 0;
		}
		}//end of for loop

		return 1;
	}
	public static void main(String[] args) {
		isSym is = new isSym();
		
		int[] a = {2,7,9,10,11,5,8};
		System.out.println("Is A symmetric? : "+ is.isSym(a));
		
		int[] b = {9,8,7,13,14,17};
		System.out.println("Is B symmetric? : "+ is.isSym(b));
		
		int[] c = {2,7,8,9,11,13,10};
		System.out.println("Is C symmetric? : "+ is.isSym(c));

	}

}
