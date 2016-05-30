package helloWorld;

public class Solve10 {
	int[] findSolve10(){
		int[] a = new int[2];
		for(int x = 0; x <= 10; x++){
			for(int y = 0; y <= 10; y++){
				//System.out.println(fact(x)+" "+fact(y)+" = "+(fact(x)+fact(y))+" ? "+fact(10));
				if(fact(x) + fact(y) == fact(10)){
					a[0] = x;
					a[1] = y;
					System.out.println("x="+ x +" "+ "y="+y);
					//System.out.println(fact(x)+" "+fact(y)+" = "+(fact(x)+fact(y))+" = "+fact(10));
					break;
				}
			}
		}
		return a;
	}
	float fact(int x){
		float fact = 1;
		for(int i = 1; i <= x; i++){
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Solve10 s10 = new Solve10();
		
		int[] x = new int[2];
		
		x = s10.findSolve10();
		System.out.println("x["+ x[0] + "," + x[1] + "]");

	}

}
