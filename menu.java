import java.util.Scanner;
class menu
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		boolean result=true;
		do
		{
		System.out.println("1.Insert Elements");
		System.out.println("2.Display Elements");
		System.out.println("3.Linear Search");
		System.out.println("4.Binary Search");
		System.out.println("5.Exit");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("enter the number");
				arr[i]=sc.nextInt();
			}
		}
		else if(choice==2)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		else if(choice==3)
		{
			System.out.print("enter the traget: ");
			int traget=sc.nextInt();
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==traget)
				{
					System.out.println(i);
				}
			}
			System.out.print("-1");
			
		}
		else if(choice==4)
		{
			System.out.print("enter the traget: ");
			int traget=sc.nextInt();
			for(int i=0;i<arr.length;i++)
			{
				int left=0;
				int right=arr.length-1; 
				while(left<=right)
				{
					int mid=(left+right)/2;
					if(arr[mid]==traget)
					{
			        System.out.print(mid);	
					}
				else if(arr[mid]<traget)
					{
						left=mid+1;
					}
					else
					{
						right=mid+1;
					}
				}
			}
			System.out.print("-1");
		}
		else 
		{
			System.out.print("exited.....");
			
		}
		
		}
		while(true);
		
	}
}