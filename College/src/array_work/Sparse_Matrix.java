//Sparse Matrix 
package array_work;
//import java.util.Scanner;
public class Sparse_Matrix {
public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
int row,col,count,k,l;
count=0;l=0;
int a[][]={{9,0,1},{0,8,0},{1,3,0}};
row=a.length;
col=a[0].length;
//Counting the no. of Non-Zero Elements.
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		if(a[i][j]!=0)
			count++;
	}
}
if(count==0)
{
	System.out.println("Didn't Found any Non-Zero Elements in the array");
}
else{
System.out.println("No of Non-Zero Elements = "+count);
int b[][]=new int[3][count];
//Extracting out Non-Zero Elements in a new Array.
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		if(a[i][j]!=0){
			b[0][l]=i;
			b[1][l]=j;
			b[2][l]=a[i][j];
			l++;}
	}
}
System.out.println("Sparse Matrix\n");
for(int i=0;i<3;i++)
{
	for(int j=0;j<l;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
}
	}

}
