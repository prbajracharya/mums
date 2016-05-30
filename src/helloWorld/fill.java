package helloWorld;

public class fill {

	int[] filled(int[] arr, int k, int n){
		int[] out_arr = new int[n];
		//System.out.println(out_arr.length);
		
		if(k<=0 || n<=0){
			return out_arr;
			//throw new illegal;
		}
		//System.out.println("Inside first for loop: ");
		for(int i = 0; i < k; i++){
			out_arr[i] = arr[i];
			//System.out.print(out_arr[i] + ", ");
		}
		
		//System.out.println("");
		//System.out.println("Inside second for loop: ");
		int p = 0;
		for(int j = k; j < n ; j++ ){
			out_arr[j] = arr[p];
			p++;
			if(p > k-1){ p = 0; }
			//System.out.print(out_arr[j]+ ", ");
		}
		//System.out.println("");
		return out_arr;
		
	}
	public static void main(String[] args) {
		fill f = new fill();
		int[] a = {1,2,3,5,9,12,-2,-1};
		int[] a_output = f.filled(a, 3, 10);
		for(int i = 0; i<a_output.length; i++){
			System.out.print(a_output[i]+ ", ");
		}
		System.out.println(" : " + "A");
		
		int[] b = {4,2,-3,12};
		int[] b_output = f.filled(b, 1, 5);
		for(int i = 0; i<b_output.length; i++){
			System.out.print( b_output[i]+ ", ");
		}
		System.out.println(" : " + "B");
		
		int[] c = {2,6,9,0,-3};
		int[] c_output = f.filled(c, 0, 4);
		for(int i = 0; i<c_output.length; i++){
			System.out.print( c_output[i]+ ", ");
		}
		System.out.println(" : " + "C");
		
		int[] d = {1,2,3,-1,8,6};
		int[] d_output = f.filled(d, 4, 10);
		for(int i = 0; i<d_output.length; i++){
			System.out.print( d_output[i]+ ", ");
		}
		System.out.println(" : " + "D");
		
	}

}
