package helloWorld;

public class GuthrieIndex {
	int findGuthrieIndex(int n){
		int guthrieIndex = 0;
		while(n!=1){
			if(n%2 ==0){
				n = n/2;
			}else{
				n=n*3+1;
			}
			guthrieIndex++;
		}
		return guthrieIndex;
	}
	public static void main(String[] args) {
		GuthrieIndex gi = new GuthrieIndex();
		
		System.out.println("Guthrie Index of 7 is: "+ gi.findGuthrieIndex(7));
		System.out.println("Guthrie Index of 1 is: "+ gi.findGuthrieIndex(1));
		System.out.println("Guthrie Index of 2 is: "+ gi.findGuthrieIndex(2));
		System.out.println("Guthrie Index of 3 is: "+ gi.findGuthrieIndex(3));
		System.out.println("Guthrie Index of 4 is: "+ gi.findGuthrieIndex(4));
		System.out.println("Guthrie Index of 42 is: "+ gi.findGuthrieIndex(42));

	}

}
