package helloWorld;

public class CountSquarePairs {

	public static void main(String[] args) {
		CountSquarePairs csp = new CountSquarePairs();
		int[] a = {9,0,2,-5,7};
		
		System.out.println("Num of Square Pairs for {9,0,2,-5,7} is :" + csp.numOfSquarePairs(a));

	}
	
	int numOfSquarePairs(int[] a){
		int numOfSquarePairs = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				//System.out.println("<"+a[i] +", " + a[j] + ">");
				if(a[i] < a[j] && isPerfectSquare(a[i] + a[j]) && a[i] > 0 && a[j] > 0){
					System.out.println("<"+a[i] +", " + a[j] + ">");
					numOfSquarePairs++;
				}
			}
		}
		return numOfSquarePairs;
	}
	
	public boolean isPerfectSquare(int var){
		int v_sqrt = (int) Math.sqrt(var);
		if(v_sqrt*v_sqrt == var){
			//System.out.println(Math.sqrt(var)*Math.sqrt(var));
			//System.out.println(var);
		return true;
		}
		return false;
	}

}
