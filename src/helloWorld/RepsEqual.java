package helloWorld;

public class RepsEqual {
	int findRepsEqual(int[] a, int n){
		int repsEqual = 0;
		int digitPlace = a.length;
		for(int i = 0; i < a.length; i++){
			repsEqual += a[i]*pow(10, digitPlace);
			digitPlace--;
			//System.out.println(a[i]+"*10^"+ digitPlace + " = " + repsEqual);
		}
		System.out.println(repsEqual);
		if(repsEqual == n){
			return 1;
		}
		return 0;
	}
	int pow(int base, int power){
		int num = 1;
		for(int i = 1; i < power; i++){
			num *= base;
		}
		return num;
	}
	public static void main(String[] args) {
		RepsEqual re = new RepsEqual();
		int n = 32053;
		int a[] = {3,2,0,5,3};
		System.out.println("Is Array equal to Number : " + re.findRepsEqual(a,n));
		
		int b[] = {3,2,0,5};
		System.out.println("Is Array equal to Number : " + re.findRepsEqual(b,n));
		
		int c[] = {3,2,0,5,3,4};
		System.out.println("Is Array equal to Number : " + re.findRepsEqual(c,n));
		
		int d[] = {2,3,0,5,3};
		System.out.println("Is Array equal to Number : " + re.findRepsEqual(d,n));
		
		int f[] = {9,3,1,1,2};
		System.out.println("Is Array equal to Number : " + re.findRepsEqual(f,n));
		
		int g[] = {0,3,2,0,5,3};
		System.out.println("Is Array equal to Number : " + re.findRepsEqual(g,n));
		
		int h[] = {1,2,3,4};
		System.out.println("Is Array equal to Number : " + re.findRepsEqual(h,1234));
	}

}
