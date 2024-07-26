public class star1
{
	public static void main(String a[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j>=5;j--)
			{
				if(j<=i)
				{
					System.out.println("*");
				}
				else
				{
					System.out.println(" ");
				}
			}
			//System.out.println();
		}
		System.out.println();
	}
}