package countvowel;

public class Count {
	protected String str;
	protected int count=0;
	Count()
	{
		
	}
	Count(String str)
	{
		this.str=str;
	}
	protected int checkVowel()
	{
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' 
		        || str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}
		return count;
	}
}
