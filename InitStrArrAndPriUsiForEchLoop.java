import java.util.Scanner;
class InitStrArrAndPriUsiForEchLoop
{
	public static void main(String args[])
	{
		String arr[]=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string name");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("print string name");
		for(String str:arr)
		{
			System.out.println(str);
		}
		
	}
}