
//pg3
import java.util.Scanner;
class matrixmul
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter n");
int n=s.nextInt();
int i,j,k;
int a[][]=new int[n][n];
int b[][]=new int[n][n];
int c[][]=new int [n][n];
System.out.println("enter a matrix");
for(i=0;i<n;++i)
for(j=0;j<n;++j)
a[i][j]=s.nextInt();
System.out.println("enter b matrix");
for(i=0;i<n;i++)
for(j=0;j<n;++j)
b[i][j]=s.nextInt();
System.out.println("result is");
for(i=0;i<n;++i)
for(j=0;j<n;++j)
{
c[i][j]=0;
for(k=0;k<n;++k)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.println(" "+c[i][j]);
}
}
}