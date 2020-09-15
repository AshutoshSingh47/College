package array_work;
import java.util.Scanner;
public class Insert_Element {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int size,x,pos,i,j;
		i=0;
		System.out.println("Enter the length of array");
		size=sc.nextInt();
		int a[]=new int[size];
     	int b[]=new int[size+1];
     	System.out.println("Enter the elements in the array");
     	for(int k=0;k<size;k++)
     	{
     		a[k]=sc.nextInt();
     	}
     	System.out.println("Enter the element to be inserted");
		x=sc.nextInt();
		System.out.println("Enter the position to be inserted");
		pos=sc.nextInt();
		for(j=0;j<size+1;j++,i++)
     	{  if(i==pos)
     	   {
     		b[j]=x;
     		j=j+1;
     	   }
     		b[j]=a[i];
     	}
		System.out.print("New Array: ");
		for(int e:b)
		{
			System.out.print(e+" ");
		}	
		
		
	}

}
