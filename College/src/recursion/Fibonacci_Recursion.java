package recursion;

public class Fibonacci_Recursion {

	public static void main(String[] args) {
		int n=5,c=0;int a=0,b=1,s=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=7;i++)
		{
			c=a+b;
			s=s+c;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
         System.out.println("\nSum of the Fibonacci Series = "+s);
	}

}

	

