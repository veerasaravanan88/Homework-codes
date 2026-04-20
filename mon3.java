import java.util.Scanner;
class mon3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Array Size :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		boolean result=true;
		do
		{
		System.out.println("1.INSERT");
		System.out.println("2.DISPLAY");
		System.out.println("3.Count Even numbers");
		System.out.println("4.Count Odd numbers");
		System.out.println("exit");
		int choice=sc.nextInt();
		if(choice==1)
		{
		 for(int i=0;i<ar.length;i++)
			{
				System.out.println("ENTER THE "+i+" th VALUE");
				ar[i]=sc.nextInt();
			}
		
		}
		else if(choice==2)
		{
			for(int i=0;i<ar.length;i++)
		 {
			 System.out.println(ar[i]);
		 }
		}
		else if(choice==3)
		{
			for(int i=0;i<ar.length;i++)
			{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]+"even numbers");
			}
			}
		}
		else if(choice==4)
		{
			for(int i=0;i<ar.length;i++)
			{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]+"odd numbers");
				
			}
			}
		}
		else
		{
				System.out.println("exitedd");
                result=false;			
		}
	  }while(result);

	}
}
