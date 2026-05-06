import java.util.Scanner;
class company
{ 
    
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		System.out.println("enter the employee IDS:");
		     arr[i]=sc.nextInt();
		boolean result=true;
	  do
	 {
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("1.Add employee ID: ");
		System.out.print("2.Remove employee ID: ");
		System.out.print("3.Display employee IDs: ");
		System.out.print("4.exit...: ");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("welcome");
		     
		 }
		}
		else if(choice==2)
		{
			 System.out.println("enter the remove employee index:");
			 int index=sc.nextInt();
			 int pos=index;
			 int ar[]=new int[arr.length-1];
			 for(int i=0;i<pos-1;i++)
			 {
				 ar[i]=arr[i];
			 }
			 for(int i=pos-1;i<ar.length;i++)
			 {
				 ar[i]=arr[i+1];
			 }
			for(int i=0;i<ar.length;i++)
		    {
			System.out.println(ar[i]);
		    }
		}
		else if(choice==3)
		{
			 System.out.println("welcome to travase");
			 for(int i=0;i<arr.length;i++)
		     {
			System.out.println(arr[i]);
		     }
			
		}
		else
		{
			 System.out.println("exited....");
			 result=false;
		}
	    
	} while(result);
	}
}