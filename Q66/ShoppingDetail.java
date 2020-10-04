package Q66;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ItemDetail implements Serializable
{
	String itemName;
	double price;
	int quantity;
	
	public ItemDetail() {
		
	}
	ItemDetail(String itemName,double price,int quantity)
	{
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return itemName+" "+price+" "+quantity;
	}
}
public class ShoppingDetail {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("F:\\CDAC20\\dir1\\shopping.dat");
		ObjectOutputStream o=new ObjectOutputStream(fos);
		o.writeObject(new ItemDetail("watch",1800,1));
		o.writeObject(new ItemDetail("cloth1",2000,2));
		o.writeObject(new ItemDetail("shoes",4000,1));
		o.writeObject(new ItemDetail("jwelleray",10000,1));
		o.writeObject(new ItemDetail("cloth2",5000,5));
		o.writeObject(new ItemDetail("easf",5000,5));
        fos.close();
        System.out.println("success");
	}

}
