package Q58;

import java.util.Scanner;

class IndexOutSideRangeException extends Exception
{
	IndexOutSideRangeException()
	{
		super("index out side the range");
	}
}
public class EnumExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a day num");
     int dayno=sc.nextInt();
     if(dayno>=0 && dayno<=6)
     { 
    	 	 if(dayno==0)
    	 	 {
    	 		 System.out.println("SUN");
    	 	 }
    	 	 else if(dayno==1)
    	 	 {
    	 		 System.out.println("MON");
    	 	 }
    	 	else if(dayno==2)
	   	 	 {
	   	 		 System.out.println("TUE");
	   	 	 }
	    	 	else if(dayno==3)
	   	 	 {
	   	 		 System.out.println("WED");
	   	 	 }
	    	 	else if(dayno==4)
	   	 	 {
	   	 		 System.out.println("THU");
	   	 	 }
	    	 	else if(dayno==5)
	   	 	 {
	   	 		 System.out.println("FRI");
	   	 	 }
	    	 	else if(dayno==6)
	   	 	 {
	   	 		 System.out.println("SAT");
	   	 	 }
	     }
     else
     {
    	 try {
			throw new IndexOutSideRangeException();
		} catch (IndexOutSideRangeException e) {
			e.printStackTrace();
		}
     }
	}
}
