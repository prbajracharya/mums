package helloWorld;

public class Oct10_2 {

	int isOddheavy(int[] a){
		int maxEven=Integer.MIN_VALUE, minOdd = Integer.MAX_VALUE;
		
		
		if(a.length == 1){
			if(a[0]%2 == 0){
				return 0;
			}
			return 1;
		}
		for(int i =0; i < a.length; i++){
			if(a[i]%2 ==0){
				
				if(a[i] > maxEven){
					maxEven = a[i];
				}
			}else{
				
				if(a[i] < minOdd){
					minOdd = a[i];
				}
			}
		}
		
		if(minOdd > maxEven){
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		Oct10_2 oddHeavy = new Oct10_2();
		int[] a = {1};
		System.out.println("Is A odd heavy? :"+ oddHeavy.isOddheavy(a));
		
		int[] b = {2};
		System.out.println("Is b odd heavy? :"+ oddHeavy.isOddheavy(b));
		
		int[] c = {1,1,1,1};
		System.out.println("Is c odd heavy? :"+ oddHeavy.isOddheavy(c));
		
		int[] d = {2,4,6,8,11};
		System.out.println("Is d odd heavy? :"+ oddHeavy.isOddheavy(d));
		
		int[] e = {-2,-4,-6,-8,-11};
		System.out.println("Is e odd heavy? :"+ oddHeavy.isOddheavy(e));
		
		//int[] f = {2,2,2,2};
		//System.out.println("Is f odd heavy? :"+ oddHeavy.isOddheavy(f));
	}

}
