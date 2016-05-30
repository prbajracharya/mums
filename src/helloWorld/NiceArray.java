package helloWorld;
//pg 105 Aug 8th 2015 Question no 3
public class NiceArray {
	int isNice(int[] a){
		boolean isNiceArray = false;
		for(int i = 0; i < a.length; i++){
			isNiceArray = false;
			for(int j = 0; j < a.length; j++){
				if(a[j]==a[i]-1 || a[j]==a[i]+1){
					isNiceArray = true;
				}
			}//end of inner for loop j
			if(isNiceArray == false){
				return 0;
			}
		}//end of for loop i
		/*
		if(isNiceArray == true){
			return 1;
		}else{
			return 0;
		}
		*/
		return 1;
	}
	public static void main(String[] args) {
		NiceArray na = new NiceArray();
		
		int[] a = {2,10,9,3};
		System.out.println("Is A a nice array? :"+na.isNice(a));
		
		int[] b = {2,2,3,3,3};
		System.out.println("Is B a nice array? :"+na.isNice(b));
		
		int[] c = {1,1,1,2,1,1};
		System.out.println("Is C a nice array? :"+na.isNice(c));
		
		int[] d = {0,-1,1};
		System.out.println("Is D a nice array? :"+na.isNice(d));
		
		int[] e = {3,4,5,7};
		System.out.println("Is E a nice array? :"+na.isNice(e));

	}

}
