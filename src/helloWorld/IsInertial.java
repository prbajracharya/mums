package helloWorld;

public class IsInertial {

	
	int IsArrayInertial(int[] a){
		boolean isInertial1 = false;
		boolean isInertial2 = false;
		boolean isInertial3 = false;

		int max = -100;
		
		int oddMin = 100;
		
		int evenMax = -100;
		
		int secondHighEven = -100;
		
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i]+",");
		}
		System.out.println("");
		
		//Check Condition 1
		for(int i = 0; i<a.length; i++){
			if(a[i]%2 != 0){
				System.out.println("CONDITION 1: SATISFIED. \n Input array have atleast one odd value : "+a[i]);
				isInertial1 = true;
				break;				
			}else{				
				isInertial1 = false; 
				}
		}
		
		//Check Condition 2
		for(int i=0; i<a.length; i++){
			if(a[i] >= max){
				max = a[i];
			}
		}
		
		if(max%2 == 0) {
			isInertial2 = true;
			System.out.println("CONDITION 2: SATISFIED.");
			System.out.println(" Max value : " + max+ " is even");
		}else{	
			
			isInertial2 = false;
			}
		
		//Check Condition 3
		
		for(int i = 0; i<a.length; i++){
			if(a[i]%2 !=0 && a[i] < oddMin){
				oddMin = a[i];
			}
			if(a[i]%2 ==0 && a[i] > evenMax){
				secondHighEven = evenMax;
				evenMax = a[i];
			}else if(a[i]%2 ==0 && a[i] > secondHighEven && a[i] != evenMax){
				secondHighEven = a[i];
			}
		}
		
		if(oddMin > secondHighEven){
			isInertial3 = true;
			System.out.println("CONDITION 3: SATISFIED. EVERY ODD VALUE IS GREATER THAN EVERY EVEN VALUE THAT IS NOT THE MAXIMUM VALUE");
			System.out.println("oddMin = " + oddMin+ " is greater than secondHighEven = " + secondHighEven);
		}else{ 
			
			isInertial3 = false; 
			}

	if(isInertial1 && isInertial2 && isInertial3){	
		System.out.println("Yes!! Input Array is Inertial");
		return 1;
	}else {
		if(!isInertial1) System.out.println("CONDITION 1: NOT SATISFIED.");
		if(!isInertial2) System.out.println("CONDITION 2: NOT SATISFIED.");
		if(!isInertial3) System.out.println("CONDITION 3: NOT SATISFIED.");
		System.out.println("Input Array is NOT Inertial");
		return 0;
	}
	}
	public static void main(String[] args) {
		IsInertial x = new IsInertial();
		
		int[] a = {1,2,3,4};
		System.out.println(x.IsArrayInertial(a));
		System.out.println("a***************************");
		
		int[] b = {1,1,1,1,1,1,2};
		System.out.println(x.IsArrayInertial(b));
		System.out.println("b***************************");
		
		int[] c = {2,12,4,6,8,11};
		System.out.println(x.IsArrayInertial(c));
		System.out.println("c***************************");
		
		int[] d = {2,12,12,4,6,8,11};
		System.out.println(x.IsArrayInertial(d));
		System.out.println("d***************************");
		
		int[] e = {-2,-4,-6,-8,-11};
		System.out.println(x.IsArrayInertial(e));
		System.out.println("e***************************");
		
		int[] f = {2,3,5,7};
		System.out.println(x.IsArrayInertial(f));
		System.out.println("f***************************");
		
		int[] g = {2,4,6,8,10};
		System.out.println(x.IsArrayInertial(g));
		System.out.println("g***************************");
		
	}

}
