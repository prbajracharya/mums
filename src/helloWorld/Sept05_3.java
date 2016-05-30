package helloWorld;

public class Sept05_3 {

	int isFilter(int[] a){
		boolean has9 = false, has11 = false, has7 = false, has13 = false;
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == 9){
				has9 = true;
			}
			if(a[i] == 11){
				has11 = true;
			}
			if(a[i] == 7){
				has7 = true;
			}
			if(a[i] == 13){
				has13 = true;
			}
		}
		if(has9){
			if(!has11){
				return 0;
			}
		}
		if(has7){
			if(has13){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		Sept05_3 filter = new Sept05_3();
		
		int[] a = {1,2,3,9,6,11};
		System.out.println("Is a filter array : "+ filter.isFilter(a));
		
		int[] b = {3,4,6,7,14,16};
		System.out.println("Is b filter array : "+ filter.isFilter(b));
		
		int[] c = {1,2,3,4,10,11,13};
		System.out.println("Is c filter array : "+ filter.isFilter(c));
		
		int[] d = {3,6,5,5,13,6,13};
		System.out.println("Is d filter array : "+ filter.isFilter(d));
		
		int[] e = {9,6,18};
		System.out.println("Is e filter array : "+ filter.isFilter(e));
		
		int[] f = {4,7,13};
		System.out.println("Is f filter array : "+ filter.isFilter(f));

	}

}
