package helloWorld;

public class PatternMatch {
	static int matchPattern(int[] a, int len, int[] pattern, int patternLen){
		int i = 0;
		int k = 0;
		int matches = 0;
		for(i=0; i<len; i++){
			if(a[i]==pattern[k])
				matches++;
			else if(matches ==0 || k == patternLen -1)
				return 0;
			else{
				k++;
				if(a[i]==pattern[k]){
					matches++;
				}
				else{
					return 0;
				}
			}//end of else
		}//end of for
		
		if(i==len && k == patternLen-1) return 1; else return 0;
	}
	public static void main(String[] args) {
		PatternMatch pm  = new PatternMatch();
		int[] a = {1, 1, 1, 1};
		int[] pattern = {1};
		System.out.println("A = " +pm.matchPattern(a, 4, pattern, 1));
		
		int[] b = {1};
		int[] pattern_b = {1};
		System.out.println("B = "+ pm.matchPattern(b, 1, pattern_b, 1));
				
		int[] c = {1,1,2,2,2,2};
		int[] pattern_c = {1,2};
		System.out.println("C = "+ pm.matchPattern(c, 5, pattern_c, 2));
		
		int[] d = {1,2,3};
		int[] pattern_d = {1,2};
		System.out.println("D = "+ pm.matchPattern(d, 3, pattern_d, 2));
		
		int[] e = {1,2};
		int[] pattern_e = {1,2,3};
		System.out.println("E = "+ pm.matchPattern(e, 2, pattern_e, 3));
		
		int[] f = {1,1,2,2,2,2,3};
		int[] pattern_f = {1,3};
		System.out.println("F = "+ pm.matchPattern(f, 7, pattern_f, 2));

	}

}
