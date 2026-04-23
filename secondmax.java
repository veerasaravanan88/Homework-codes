import java.util.Scanner;
class secondmax
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		boolean result=true;
		do
		{
		System.out.println("1.insert:");
		System.out.println("2.second max number:");
		System.out.println("3.exit ");
		
		int choice=sc.nextInt();
		int max=0;
		if(choice==1)
		{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the"+ i +"age");
			arr[i]=sc.nextInt();
			max=arr[i];
		}
	    }
		else if(choice==2)
		{
	    int second = arr[0];
        for(int i = 0; i < size; i++) 
		{
            if(arr[i] != max && arr[i] > second) 
			{
                second = arr[i];
            }
        }
					System.out.println("Second Max = " + second);
		}
		else
		{
			System.out.println("exited....");
			
		}
		}while(result);
	}
}