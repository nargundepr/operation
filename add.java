class A
{
	int add(int a,int b)
	{
		return a+b;
	}
	
	
	int sub(int x,int y)
	{
		return x-y;
	}
	int mult (int p,int s)
	{
		return p*s;
	}
	int div(int r,int s)
	{
		return r%s;
	}
	public static void main(String[]args)
	{
		A a=new A()
		a.add(8,9);
		a.sub(9,7);
		a.mult(4,5);
		a.div(6,3);
	}
}
