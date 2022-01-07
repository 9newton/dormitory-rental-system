import java.util.*;
import java.util.Scanner;
class noUSE
{
	public static int num[]={101,105,112,409,410,412};

    public static void isFound()
	{
		System.out.println("\t\t\t\t\t******************wow*******************");
	}
	public static void notFound()
	{
		System.out.println("\t\t\t\t\t******************ERROR*******************");
	}
	public static void main(String[] args) 
	{
		//int[] num = {1,2,3,4,5,6};
		//int toFind = 105;
		Scanner inp=new Scanner(System.in);
		System.out.println("{101},{105},{112},{409},{410},{412}");
		System.out.print("\t\t\t\t    ID_ROOM : ");int toFind = inp.nextInt();
		boolean found=false;
		for(int n : num )
		{	
			System.out.println(n);
			if(n == toFind)
			{
				found = true;	
			    break;
			}
		}
		if(found)
			isFound();
		else
			notFound();


	}
}
