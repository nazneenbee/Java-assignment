import java.util.Scanner;
public class ByteAdd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		byte a= sc.nextByte();
		byte b= sc.nextByte();
		byte c= (byte)(a+b);
		System.out.println(c);
	}
}
