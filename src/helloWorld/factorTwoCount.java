package helloWorld;

public class factorTwoCount {

	int factor2Count(int num){
		int count = 0;
		while(num%2 ==0){
			num/=2;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		factorTwoCount f2c= new factorTwoCount();
		
		System.out.println("Facor Two Count of 48 is: " + f2c.factor2Count(48));
		
		System.out.println("Facor Two Count of 27 is: " + f2c.factor2Count(27));
	}

}
