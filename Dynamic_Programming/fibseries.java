/*
Dynamic programming use to solve optimization problem.
Dynamic programming will find solution if solution is exist.
There are following steps to solve a problem using dynamic programming
1. Breaks down the problem into sub problem
2. Find optimal solution of these sub problem.
3. Store the result of sub problems (Memoization).
4. Reuse these result that same sub problem.
5. Finaly calculate the result of complex problem.
*/
import java.util.*;
class Dynamic
{
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no");
		int fib[]=new int[sc.nextInt()+1];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<fib.length;i++)
			fib[i]=fib[i-1]+fib[i-2];
		System.out.println(fib[fib.length-1]);
	}
}