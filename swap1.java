class swap1
{
 public static void main(String[]args)
  {
    int a=10;
    int b=20;
    int c=30;
    System.out.println("Before A="+a);
    System.out.println("Before B="+b);	
    System.out.println("Before C="+c);
    int temp=a;
    a=b;
    b=c;
    c=temp;
    System.out.println("After A="+a);
    System.out.println("After B="+b);
    System.out.println("After C="+c);	
  
  }

}