import java.util.Scanner;
public class Array7
{

	public static void main(String[] args)
	{
		int i,j,k,tem;
System.out.println("enter the size");
Scanner in=new Scanner(System.in);
k=in.nextInt();
int []a=new int[k];
for(i=0;i<k;i++)
{
	System.out.print(a[i]+",");
}
for(i=0;i<k;i++)
{
	for(j=0;j<k;j++)
	{
		if(a[i]>a[j])
		{
	     	tem=a[i];
		    a[i]=a[j];
		     a[j]=tem;
	    }
    }
}
	System.out.println("the desending order");
	for(i=0;i<k;i++)
	{
		System.out.println(a[i]);
	}

	}
}
