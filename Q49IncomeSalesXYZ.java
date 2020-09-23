import java.util.Scanner;
interface Taxable
{
	double salesTax=7/100;
	double incomeTax=10.5/100;
	
	void calcTax();
}
class Employee implements Taxable
{
	private int empId;
	private String name;
	private double salary;
	Employee()
	{}
	Employee(int empId,String name,double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	double incomeTaxOnSal;
	public void calcTax()
	{
		incomeTaxOnSal=salary*incomeTax;
	}
	void showIncomeTaxOnSal()
	{
		System.out.println("Income tax on yearly sal = "+incomeTaxOnSal);
	}
}
class Product implements Taxable
{
	private int productId;
	private double price;
	private int quantity;
	
	Product()
	{}
	Product(int productId,double price,int quantity)
	{
		this.productId=productId;
		this.price=price;
		this.quantity=quantity;
	}
	double salesTaxProduct;
	public void calcTax()
	{
		salesTaxProduct=price*quantity*salesTax;
	}
	void showSalesTaxProduct()
	{
		System.out.println("sales tax on product = "+salesTaxProduct);
	}
}
class Q49IncomeSalesXYZ
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter emp id");
		int empId=sc.nextInt();
		System.out.println("enter emp name");
		String empName=sc.next();
		System.out.println("enter yearly salary");
		double empSal=sc.nextDouble();
		
		Employee e=new Employee(empId,empName,empSal);
		e.calcTax();
		e.showIncomeTaxOnSal();
		
		
		System.out.println("enter product id");
		int productId=sc.nextInt();
		System.out.println("enter product price");
		double productPrice=sc.nextDouble();
		System.out.println("enter product quantity");
		int productQuantity =sc.nextInt();
		
		Product p=new Product(productId,productPrice,productQuantity);
		p.calcTax();
		p.showSalesTaxProduct();
	}
}