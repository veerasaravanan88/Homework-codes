class battery
{
	public static void main(String[]args)
	{
		int battery=28;
		if(battery>=80)
		{
			System.out.println("Battery full");
		}
		else if(battery>=30)
		{
			System.out.println("Battery normal");
		}
		else
		{
			System.out.println("Low battery-charge now");
		}
	}
}