class modify
{
	public static void main(String [] args)
	{
		int arr[]={10,15,30,60};
		System.out.println("before change: "+arr[0]);
		System.out.println("before change: "+arr[1]);
		System.out.println("before change: "+arr[2]);
		System.out.println("before change: "+arr[3]);
		modify m1=new modify();
		m1.change(arr);
	}
	void change(int arr[])
	{
		arr[1]=20;
		System.out.println("after change: "+arr[0]);
		System.out.println("after change: "+arr[1]);
		System.out.println("after change: "+arr[2]);
		System.out.println("after change: "+ arr[3]);
		
	}
}