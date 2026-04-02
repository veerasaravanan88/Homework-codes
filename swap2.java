class swap
{
 public static void main(String[]args)
 {
	int a=5;
    int b=15;
    int c=25;
    System.out.println("Before A="+a);
    System.out.println("Before B="+b);
    System.out.println("Before C="+c);	
	a=a+b+c;
	b=a-(b+c);
	c=a-(c+b);
	a=a-(b+c);
	System.out.println("After A="+a);
	System.out.println("After b="+b);
	System.out.println("After c="+c);
	 
	 
 }



}