package array_work;
import java.util.Scanner;
public class Delete_Element {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i,j,pos;
    j=0;
    System.out.println("Enter the position to be deleted");
    pos=sc.nextInt();
    int a[]={1,2,3,4,5};
    int size=a.length;
    int b[]=new int[size-1];
    for(i=0;i<size;i++)
    {
    	if(i==pos)
    	{
    		continue;
    	}
    	b[j++]=a[i];
    }
    for(int e:b)
    {
    	System.out.print(e+" ");
    }
	}

}
