package array_work;
import java.util.Scanner;
public class Merge_Array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x,j,k;
	x=0;
	int a[]={1,2,3,4,5};
	int n1=a.length;
    int b[]={1,2,6,7,8};
    int n2=b.length;
    for(j=0;j<a.length;j++){
    for(int i=0;i<b.length;i++)
    {
    	if(a[j]==b[i])
    		x++;
    }
    }
    n1=n1-x;
    n2=n2-x;
    int n3=n1+n2+x;
    int c[]=new int[n3];
    System.out.println("x = "+x);
    System.out.println("n3 = "+n3);
//    for(j=0;j<n1;j++){
//        for(int i=0;i<n2;i++)
//        {
//        	if(a[j]==b[i])
//        		x++;
//        }
//        }
    
	}

}
