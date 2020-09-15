//Program to swap elements of array without using any 2nd array.
package array_work;
import java.util.Scanner;
public class Swap_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,i,j,c;
		System.out.println("Enter the size");
		size=sc.nextInt();
		j=size-1;
        int a[]=new int[size];
        for(int k=0;k<size;k++)
        {
        	a[k]=sc.nextInt();
        }
        System.out.print("Before Swap : ");
        for(int f:a)
        {
        	System.out.print(f+" ");
        }
        for(i=0;i<size/2;i++,j--)
        {
        	c=a[i];
        	a[i]=a[j];
        	a[j]=c;
        }
       
        System.out.print("\n"+"After Swap : ");
        for(int e:a){
        	System.out.print(e+" ");
        }

	}

}
