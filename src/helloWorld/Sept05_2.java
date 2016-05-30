package helloWorld;

public class Sept05_2 {

	int isDual(int[] a){
		int count = 0;
		for(int i = 0; i < a.length; i++){
			//System.out.println(a[i] + ", ");
			count = 0;
			for(int j = 0; j < a.length; j++){
				//System.out.print(a[j]+ ", ");
				if(a[i] == a[j]){

					count++;
					
					//if(i > j){
					//	count = 2;
					//	break;
					//}
				}
			}
			//System.out.println("Count : " + count);
			if(count != 2){
				return 0;
			}
		}//end of for i 
		return 1;
	}
	public static void main(String[] args) {
		
		Sept05_2 dual = new Sept05_2();
		
		int[] a = {1,2,1,3,3,2};
		System.out.println("Is A dual array? :"+dual.isDual(a));
		
		int[] b = {2,5,2,5,5};
		System.out.println("Is b dual array? :"+dual.isDual(b));
		
		int[] c = {3,1,1,2,2};
		System.out.println("Is c dual array? :"+dual.isDual(c));

	}

}
