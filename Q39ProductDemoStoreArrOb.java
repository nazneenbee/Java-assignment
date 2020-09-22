import java.util.Scanner;

class Product
{
	private int pid;
	private double price;
	private int quantity;
	Product()
	{
		
	}
	Product(int pid,double price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	void show()
	{
		System.out.println("pid = "+pid);
		System.out.println("price = "+price);
		System.out.println("quantity = "+quantity);
	}
	int getPId()
	{
		return pid;
	}
	double getPrice()
	{
		return price;
	}
	int getQuantity()
	{
		return quantity;
	}
	double max=0;
	void printHighest(Product p[])
	{
		int count=0;
		for(int i=0; i<p.length; i++)
		{
			if(p[i].getPrice() > max)
			{
				count=i;
				max=p[i].getPrice();
			}
		}
		System.out.println("maximum price is = "+max+" present index = "+count);
		System.out.println("Product id of highest price product:");
		System.out.println(p[count].getPId());
		
	}
	static double totalA=0;
	static double totalAmount(Product p[])
	{
		for(int i=0; i<p.length; i++)
		{
			double newPrice=p[i].getPrice()*p[i].getQuantity();
			totalA=totalA+newPrice;
		}
		return totalA;
	}
}
class Q39ProductDemoStoreArrOb
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Product pr[]=new Product[5];
		for(int i=0; i<pr.length; i++)
		{
			System.out.println("Enter pid");
			int pid=sc.nextInt();
			System.out.println("Enter price");
			double price=sc.nextDouble();
			System.out.println("Enter quantity");
			int quantity=sc.nextInt();
			Product p=new Product(pid,price,quantity);
			pr[i]=p;	
		}
		double max=0;
		System.out.println("show All product detail");
		for(Product pdetail : pr)
		{
			pdetail.show();
			System.out.println(" ");
		}
		Product p1=new Product();
		p1.printHighest(pr);
		System.out.println("total amount of all product = "+Product.totalAmount(pr));
	}
}