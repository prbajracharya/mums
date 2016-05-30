package helloWorld;

public class ConcatenatedSum {

	int checkConcatenatedSum(int n, int catlen){
		int num = 0;
		int n_origin = n;
		
		while(n!=0){
			int digit = n%10;
			for(int i = 0; i < catlen; i++){
			 num += digit*Math.pow(10, i);
			}
			n = n/10;
		}
		if(n_origin == num){
			System.out.println("YES! Num = " + n_origin + " Catlen = " + catlen +" is concatenated sum");
			return 1;
		}else{
			System.out.println("NO Num = " + n_origin + "Catlen = "+ catlen + " is not Concatenated Sum");
			return 0;
		}
	}
	public static void main(String[] args) {
		ConcatenatedSum cs = new ConcatenatedSum();
		cs.checkConcatenatedSum(198,2);
		
		cs.checkConcatenatedSum(198, 3);
		
		cs.checkConcatenatedSum(2997, 3);
		
		cs.checkConcatenatedSum(2997, 2);
		
		cs.checkConcatenatedSum(13332, 4);
		
		cs.checkConcatenatedSum(9, 1);
	}

}
