import java.util.*;
class Dynamic 
{
	public static void main(String []a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of coins");
		int coins[]=new int[sc.nextInt()];
		System.out.println("Enter coins details");
		for(int i=0;i<coins.length;i++)
			coins[i]=sc.nextInt();
		System.out.println("Enter total amount to change");
		Arrays.sort(coins);
		int w[]=new int[sc.nextInt()+1];
		w[0]=1;
		try{
		for(int i=1;i<w.length;i++)
			w[i]=0;
		for(int i=0;i<coins.length;i++)
		{
			for(int j=1;j<w.length;j++)
			{
				if(j>=coins[i])
				  w[j]=w[j]+w[j-coins[i]];
			}
		}
		}
		catch(Exception e)
		{
			
		}
			for(int i: w)
			System.out.print(i+" ");
			System.out.println("Total ways is "+w[w.length-1]);
	}
}