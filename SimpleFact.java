import java.util.Scanner;
class SimpleFact
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int fact=1;
		for (int i=1;i<=num ;i++ )
		{
			fact*=i;
		}
		System.out.println(fact);
	}
}
