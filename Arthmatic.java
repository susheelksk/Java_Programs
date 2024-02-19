class Arthmatic 
{
	public static void main(String[] args) 
	{
		add(10,20);
		sub(20,10);
		mul(30,10);
		div(10,4);
		mod(10,5);
	}
		public static void add(int a,int b)
	{
		System.out.println("Addition of "+(a+b));
	}
	public static void sub(int a,int b)
	{
		System.out.println("substraction of"+(a-b));
	}
	public static void mul(int a,int b)
	{
		System.out.println("multiplication of"+(a*b));
	}
	public static void div(int a,int b)
	{
		System.out.println("division of"+(a/b));
	}
	public static void mod(int a,int b)
	{
		System.out.println("modulus of"+(a%b));
	}
}
