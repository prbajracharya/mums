package helloWorld;

public class Dec05_2 {

	int isTwinoid(int[] a){
		int evenCnt = 0;
		
		for(int i = 0; i < a.length; i++){
			if(a[i]%2 == 0 && a[i+1]%2 == 0) {
				evenCnt++;
			}
		}
		if(evenCnt == 1){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Dec05_2 twin = new Dec05_2();
		int[] a = {3,3,2,6,7};
		System.out.println("Is A twinoid array? : " + twin.isTwinoid(a));
		
		int[] b = {3,3,2,6,6,7};
		System.out.println("Is b twinoid array? : " + twin.isTwinoid(b));
		
		int[] c = {3,3,2,7,6,7};
		System.out.println("Is c twinoid array? : " + twin.isTwinoid(c));
		
		int[] d = {3,8,5,7,3};
		System.out.println("Is d twinoid array? : " + twin.isTwinoid(d));

	}

}
