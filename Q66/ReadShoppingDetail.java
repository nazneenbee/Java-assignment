package Q66;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Q66.ItemDetail;

public class ReadShoppingDetail {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream f=new FileInputStream("F:\\CDAC20\\dir1\\shopping.dat");
	ObjectInputStream oi=new ObjectInputStream(f);
	ArrayList<ItemDetail> arrlist=new ArrayList<>();
	boolean flag=true;
	double totalmoney=0;
	while(flag)
	{
		ItemDetail item=null;
		
		item=(ItemDetail) oi.readObject();
		
		if(f.available() != 0)
		{
			arrlist.add(item);
		}
		else
		{
			arrlist.add(item);
			flag=false;
		}
	}
	oi.close();
	f.close();
	for(ItemDetail i:arrlist)
	{
		System.out.println(i);
		totalmoney=totalmoney+i.price*i.quantity;
	}
	System.out.println("total money spend all items = "+totalmoney);
	System.out.println("success");
}
}

