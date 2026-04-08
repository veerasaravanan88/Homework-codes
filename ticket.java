class ticket
{
	public static void main(String[]args)
	{
		int age=22;
		if(age<12)
		{
			System.out.println("Ticket price:80");
		}
		else if(age<= 59)
		{
			System.out.println("Ticket price:150");
		}
	    else
		{
			System.out.println("Ticket price:100");
		}
	}
}