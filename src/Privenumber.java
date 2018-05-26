//display the prime number from 10 to 50
public class Privenumber
{

	public static void main(String[] args)
	{
		//declare variable
		int low=10;
		int up=50;
		int count=0;
		for (int i=low;i<=50;i++,count=0)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0) {
					count++;
					break;
					}
			}
			if(count==0)
				System.out.print(i+" ");
		}

	}

}
