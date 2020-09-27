package Q50;
import java.util.Scanner;
class Employee
{
	int empId;
	String name;
	double salary;
	Employee(int empId,String name,double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "empId = "+empId+" , name = "+name+", salary = "+salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
		{return false;}
		if(obj instanceof Employee)
		{
		Employee emp=(Employee)obj;
		return  empId==emp.empId;
	    }
		return false;
		}
	
	}
public class Q50EqualToString {
  public static void main(String[] args) {
	 
	  Scanner sc=new Scanner(System.in);
	 
	  Employee employee[]=new Employee[5];
	  for(int i=0; i<employee.length; i++)
	  {
		  System.out.println("enter id");
		  int empId=sc.nextInt();
		  System.out.println("enter name");
		  String name=sc.next();
		  System.out.println("enter salary");
		  double salary=sc.nextDouble();
		  Employee e=new Employee(empId,name,salary);
		  employee[i]=e;
	  }
	  int count;
	  for(int i=0; i<employee.length; i++)
	  {
		  count=0;
		for(int j=i+1; j<employee.length; j++)
		{
			if(employee[i].equals(employee[j]) && i!=j)
			{
			    count++;
			    break;
			}
		}
		if(count>0)
		{
			System.out.println("this id is already present : "+employee[i]);
		}
		else
		{
			System.out.println("this is uniq Id : "+employee[i]);
		}
	}
	
}
}
