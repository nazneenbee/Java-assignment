package Q53;

public class SumOfStringUsingParseInt {
	public static void main(String[] args) {
		String str="67, 89, 23, 67, 12, 55, 66";
		String strToken[]=str.split(", ");
		int sum=0;
		for(String s:strToken)
		{
			int data=Integer.parseInt(s);
			sum=sum+data;
			System.out.println(s);
		}
		System.out.println("total string sum : "+sum);
	}

}
