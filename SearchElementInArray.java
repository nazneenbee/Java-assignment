import java.util.Scanner;
class SearchElementInArray
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		System.out.println("enter element you want search");
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==ele)
			{
				System.out.println(arr[i]+" present in "+i+" index");
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("search element is not present");
		}
	}
}