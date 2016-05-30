package helloWorld;

public class Apr9_2 {
 int isBunkerArray(int[] a){
	 for(int i = 0; i < a.length-1; i++){
		 if(a[i]%2 != 0){
			 if(isPrime(a[i+1])){
				 return 1;
			 }
			 //return 0; //atleast one odd so every odd may not be followed by prime
		 }
	 }//end of for i
	return 0; 
 }
 boolean isPrime(int n){
	 if(n < 2){
		 return false;
	 }
	 for(int j = 2; j < n; j++){
		 if(n%j ==0){
			 return false;
		 }
	 }
	 return true;
 }
 
 public static void main(String[] args){
	 Apr9_2 ba = new Apr9_2();
	 
	 int[] a = {4,9,6,7,3};
	 System.out.println("Is a Bunker array? :"+ ba.isBunkerArray(a));
	 
	 int[] b = {4,9,6,15,21};
	 System.out.println("Is b Bunker array? :"+ ba.isBunkerArray(b));
	 
	 int[] c = {4,6,8};
	 System.out.println("Is c Bunker array? :"+ ba.isBunkerArray(c));
 }
}
