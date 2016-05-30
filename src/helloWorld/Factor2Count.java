package helloWorld;

public class Factor2Count {

	int factor2count(int n){
		int numFactor2count = 0;
		for(int temp = n; temp%2==0; temp/=2){
			numFactor2count++;
		}
		return numFactor2count;
	}
	public static void main(String[] args) {
		Factor2Count f2c = new Factor2Count();
		
		System.out.println("Number of factor 2 count in 48 is :" + f2c.factor2count(48));
		
		System.out.println("Number of factor 2 count in 27 is :" + f2c.factor2count(27));

	}

}
