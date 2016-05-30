package helloWorld;

public class Apr23_1 {

	int [] fill(int[] a, int k, int n){
		int[] op_a = new int[n];
		int l = 0;
		
		if(k<=0 || n<=0){return op_a;}//should have returned null
		
		for(int i = 0; i < n; i++){
			if(i<k){
				op_a[i] = a[i];
			}
			
			if(i >= k){
				op_a[i] = op_a[l++];
				if(l>=k){
					l=0;
				}
			}
		}
		return op_a;
	}
	public static void main(String[] args) {
		
		Apr23_1 f = new Apr23_1();
		int k, n;
		
		int[] a = {1,2,3,5,9,12,-2,-1};
		k = 3; n = 10;
		int[] op_a = new int[n];
		op_a = f.fill(a, k, n);
		System.out.println("Filled Array A : " );		
		for(int i = 0; i < op_a.length; i++){
			System.out.print(op_a[i]+ ", ");
		}
		System.out.println();
		
		int[] b = {4,2,-3,12};
		k = 1; n = 5;
		int[] op_b = new int[n];
		op_b = f.fill(b, k, n);
		System.out.println("Filled Array B : " );		
		for(int i = 0; i < op_b.length; i++){
			System.out.print(op_b[i]+ ", ");
		}
		System.out.println();
		
		int[] c = {2,6,9,0,-3};
		k = 0; n = 4;
		int[] op_c = new int[n];
		op_c = f.fill(c, k, n);
		System.out.println("Filled Array c : " );		
		for(int i = 0; i < op_c.length; i++){
			System.out.print(op_c[i]+ ", ");
		}
	}

}
