package helloWorld;

public class Twinoid {

	int isTwinoid(int[] a){
		int adjEvenCnt = 0;
		for(int i = 0; i < a.length; i++){
			adjEvenCnt = 0;
			System.out.print(a[i]+", ");
			if(a[i]%2==0){
				System.out.print("****");
				for(int j = i; j < a.length; j++){
					System.out.print(a[j]+", ");
					if(a[j]%2==0){
						adjEvenCnt++;
					}
				}//end of for j
				System.out.println("");
				System.out.println("adjEvenCnt : " + adjEvenCnt);
			}//end of if
			if(adjEvenCnt == 2){
				return 1;
			}
		}
		System.out.println("");
		return 0;
	}
	public static void main(String[] args) {
		Twinoid t = new Twinoid();
		
		int[] a = {3,3,2,6,7};
		System.out.println("Is A a twinoid array? : " + t.isTwinoid(a));
		
		int[] b = {3,3,2,6,6,7};
		System.out.println("Is B a twinoid array? : " + t.isTwinoid(b));
		
		int[] c = {3,3,2,7,6,7};
		System.out.println("Is C a twinoid array? : " + t.isTwinoid(c));
		
		int[] d = {3,8,5,7,3};
		System.out.println("Is D a twinoid array? : " + t.isTwinoid(d));

	}

}
