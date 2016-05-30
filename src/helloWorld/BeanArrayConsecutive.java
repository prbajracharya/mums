package helloWorld;

public class BeanArrayConsecutive {

	int isBeanArray(int[] a){
		int isBeanArray = 0;
		for(int i = 0; i < a.length; i++){
			isBeanArray = 0;
			//System.out.println(a[i]);
			for(int j=0; j<a.length; j++){
				//System.out.print(a[j]+",");
				if(a[j]==a[i]-1 || a[j]==a[i]+1){
					isBeanArray = 1;
					//System.out.println(isBeanArray);
				}
			}
			if(isBeanArray != 1){
				return isBeanArray;
			}
			//System.out.println();
		}
		return isBeanArray;
	}
	public static void main(String[] args) {
		BeanArrayConsecutive bac = new BeanArrayConsecutive();
		
		int[] a = {2,10,9,3};
		System.out.println("Is A a Bean Consecutive Array? :"+bac.isBeanArray(a));
		
		int[] b = {2,2,3,3,3};
		System.out.println("Is B a Bean Consecutive Array? :"+bac.isBeanArray(b));
		
		int[] c = {1,1,1,2,1,1};
		System.out.println("Is C a Bean Consecutive Array? :"+bac.isBeanArray(c));
		
		int[] d = {0,-1,1};
		System.out.println("Is D a Bean Consecutive Array? :"+bac.isBeanArray(d));
		
		int[] e = {3,4,5,7};
		System.out.println("Is E a Bean Consecutive Array? :"+bac.isBeanArray(e));

	}

}
