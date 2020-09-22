class OneBHK
{
	private double roomArea;
	private double hallArea;
	private double price;
	private static double totalPrice=0;
	
	OneBHK()
	{
		roomArea=1000;
		hallArea=2000;
		price=2500000;
	}
	OneBHK(double roomArea,double hallArea,double price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
		totalPrice=totalPrice+price;
	}
	void show()
	{
		System.out.println("roomArea = "+roomArea);
		System.out.println("hallArea = "+hallArea);
		System.out.println("price = "+price);
	}
	static void showTotalPrice()
	{
		System.out.println("total price = "+totalPrice);
	}
}
class TwoBHK extends OneBHK
{
	private double room2Area;
	TwoBHK()
	{
		room2Area=1500;
	}
	TwoBHK(double roomArea,double hallArea,double price,double room2Area)
	{
		super(roomArea,hallArea,price);
		this.room2Area=room2Area;
	}
	void show()
	{
		super.show();
		System.out.println("room2Area = "+room2Area);
	}
}
class Q43DemoRoom
{
	public static void main(String args[])
	{
		/*TwoBHK twobhk=new TwoBHK();
		twobhk.show();
		twobhk.showTotalPrice();*/
		TwoBHK twobhk1=new TwoBHK(1500,3000,500000,2000);
		twobhk1.show();
		TwoBHK twobhk2=new TwoBHK(2000,3000,520000,2000);
		twobhk2.show();
		TwoBHK twobhk3=new TwoBHK(1500,3000,480000,1500);
		twobhk3.show();
		TwoBHK twobhk4=new TwoBHK(1200,3000,460000,2200);
		twobhk4.show();
		OneBHK.showTotalPrice();
	}
}