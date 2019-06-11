class A
{
	int add(int a,int b)
	{
		return a+b;
	}
	
	
	int sub(int x,int y)
	{
		return x+y;
	}
	int div(int y,int c)
	{
		return y%c;
	}
	int mult(int p,int r)
	{
		return p*r;
	}
	public static void main(String[]args)
	{
		A a=new A()
		a.add(8,9);
		a.sub(9,7);
		a.div(6,3);
		a.mult(9,8);
	}
}
