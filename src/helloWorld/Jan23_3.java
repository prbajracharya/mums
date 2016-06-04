package helloWorld;

public class Jan23_3 {

	int isBean(int[] a){
		
		boolean isBean = false;
		for(int i = 0; i < a.length; i++){
			isBean = false;
			for(int j = 0; j < a.length; j++){
				if(a[j] == 2*a[i] || a[j] == 2*a[i]+1 || a[j] == a[i]/2){
					isBean = true;
					break;
				}
			}//end of inner for j
			if(!isBean){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		
		Jan23_3 bean = new Jan23_3();
		
		int[] a = {4,13,8};
		System.out.println("Is A Bean array? : "+ bean.isBean(a));
		
		int[] b = {2,2,5,11,23};
		System.out.println("Is b Bean array? : "+ bean.isBean(b));		
		
		int[] c = {7,7,3,6};
		System.out.println("Is c Bean array? : "+ bean.isBean(c));
		
		int[] d = {0};
		System.out.println("Is d Bean array? : "+ bean.isBean(d));
		
		int[] e = {3,8,4};
		System.out.println("Is e Bean array? : "+ bean.isBean(e));
	}

}
