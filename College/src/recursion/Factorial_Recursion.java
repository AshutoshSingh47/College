package recursion;

public class Factorial_Recursion {

	static int iterator(int b){

	if(b<=1)
		return b;
		System.out.print(b+" ");
		return b*iterator(b-1);
	}
	public static void main(String[] args) {
		int a;
//		a=iterator(5);
		System.out.println("\n"+iterator(5));
		
		
     }
	
	
}