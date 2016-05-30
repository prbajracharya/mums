package helloWorld;

public class Oct03_2 {

	boolean sumIsPower(int[] arr){
		int sum = 0;
		if(arr.length == 0 ){
			return false;
		}
		for(int i = 0; i < arr.length; i++){
			sum+= arr[i];
		}
		for(int n = 0;pow(2, n) <= sum; n++){
			if(pow(2, n) == sum){
				return true;
			}
		}
		return false;
	}
	int pow(int base, int power){
		int result = 1;
		
		for(int k = 0; k < power; k++){
			result *= base;
		}
		return result;
	}
	public static void main(String[] args) {
		Oct03_2 sumPower = new Oct03_2();
		
		int[] a = {8,8,8,8};
		System.out.println("Is A sum power? :"+ sumPower.sumIsPower(a));
		
		int[] b = {8,8,8};
		System.out.println("Is B sum power? :"+ sumPower.sumIsPower(b));

	}

}
