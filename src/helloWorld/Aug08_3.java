package helloWorld;

public class Aug08_3 {

	int isNice(int[] a){
		boolean isNice = false;
		
		for(int i = 0; i < a.length; i++){
			isNice = false;
			
			for(int j = 0; j < a.length; j++){
				
				if(a[j] == a[i]+1 || a[j] ==  a[i]-1){
					isNice = true;
					break;
				}
			}
			if(isNice == false){
				return 0;
			}
		}
		if(isNice){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Aug08_3 nice = new Aug08_3();
		
		int[] a = {2,10,9,3};
		System.out.println("Is A nice array? : " + nice.isNice(a));
		

		int[] b = {2,2,3,3,3};
		System.out.println("Is B nice array? : " + nice.isNice(b));
		

		int[] c = {1,1,1,2,1,1};
		System.out.println("Is A nice array? : " + nice.isNice(c));
		

		int[] d = {0,-1,1};
		System.out.println("Is A nice array? : " + nice.isNice(d));
		

		int[] e = {3,4,5,7};
		System.out.println("Is A nice array? : " + nice.isNice(e));

	}

}
