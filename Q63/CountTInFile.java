package Q63;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountTInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("F:\\CDAC20\\dir1\\a.txt");
		int ch=-1;
		int count=0;
		while((ch=f.read())!=-1)
		{
			if((char)ch=='t')
			{
				count++;
			}
		}
		System.out.println("t occur in "+count+" times");
		

	}

}
