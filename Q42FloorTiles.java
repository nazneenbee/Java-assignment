class Tile
{
	private double edgeTiles;
	private double tilea;
	Tile()
	{
		
	}
	Tile(double edgeTiles)
	{
		this.edgeTiles=edgeTiles;
	}
	double getTileArea()
	{
		tilea=edgeTiles*edgeTiles;
		//System.out.println(tilea);
		return tilea;
	}
}
class Floor extends Tile
{
	private double lengthFloor;
	private double widthFloor;
    private double area;
	Floor()
	{
		
	}
	Floor(double edgeTiles,double lengthFloor,double widthFloor)
	{
		super(edgeTiles);
		this.lengthFloor=lengthFloor;
		this.widthFloor=widthFloor;
	}
	double getFloorArea()
	{
		area=lengthFloor*widthFloor;
		return area;
	}
}

class Q42FloorTiles
{
	public static void main(String args[])
	{
		Floor f=new Floor(3,20,20);
		double fa=f.getFloorArea();
	    double ta=f.getTileArea();
		System.out.println("floor area = "+fa);
		System.out.println("tiles area = "+ta);
		double wholeTile=fa/ta;
		System.out.println("tiles needed = "+wholeTile);
	}
}