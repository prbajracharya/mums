package helloWorld;

public class SumIsPower {

	boolean isSumPower(int[] arr){
		int sum = 0; 
		if(arr.length == 0){
			return false;
		}
		for(int i = 0; i < arr.length; i++){
			sum+= arr[i];
		}
		
		for(int j = 0 ; Math.pow(2, j) <= sum; j++){
			if(Math.pow(2, j) == sum){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		SumIsPower isp = new SumIsPower();
		
		int[] a = {8,8,8,8};
		System.out.println("IsSumPower A : " + isp.isSumPower(a));
		
		int[] b = {8,8,8};
		System.out.println("IsSumPower B : " + isp.isSumPower(b));
	}

}
