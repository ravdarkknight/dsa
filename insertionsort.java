class insertionsort
{
	public static void main(String as[])
	{
		int x;
		int a[]={38,11,2,44,66,1};
		insertsort(a);
		for(x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}

	}

	public static void insertsort(int a[])
	{
		int x,y,key;
		for(x=1;x<a.length;x++)
		{
			key=a[x];
			y=x-1;
			while(y>=0 && a[y]>key)
			{
				a[y+1]=a[y];
				y--;
			}
			a[y+1]=key;
		}
	}
}
