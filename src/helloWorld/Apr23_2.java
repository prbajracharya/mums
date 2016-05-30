package helloWorld;

public class Apr23_2 {

	boolean sumIsPower(int[] arr){
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum+=arr[i];
		}
		
		for(int j = 0; Math.pow(2,j) <= sum; j++){
			if(Math.pow(2, j) == sum){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Apr23_2 sip = new Apr23_2();
		
		int[] a = {8,8,8,8};
		System.out.println("Is A sumIsPower? : " + sip.sumIsPower(a));

		int[] b = {8,8,8};
		System.out.println("Is B sumIsPower? : " + sip.sumIsPower(b));
	}

}
