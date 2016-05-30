package helloWorld;

public class IsBeanArray {

	int isBean(int[] a){
		boolean isBeanArray = false;
		for(int i = 0; i < a.length; i++){
			isBeanArray = false;
			for(int j = 0; j < a.length; j++){
				if(a[j] == a[i]+1 || a[j] == a[i]-1){
					isBeanArray = true;
					break;
				}
			}//end of for j
			if(isBeanArray == false){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		IsBeanArray iba = new IsBeanArray();
		int[] a = {2,2,3,3,3};
		System.out.println("Is A a Bean Array?:"+ iba.isBean(a));
		
		int[] b = {1,1,1,2,1,1};
		System.out.println("Is B a Bean Array?:"+ iba.isBean(b));
		
		int[] c = {0,-1,1};
		System.out.println("Is C a Bean Array?:"+ iba.isBean(c));
		
		int[] d = {3,4,5,7};
		System.out.println("Is D a Bean Array?:"+ iba.isBean(d));

	}

}
