package Q64;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfWordInTextFile {
 public static void main(String[] args) throws IOException {
	 /*FileInputStream f=new FileInputStream("F:\\CDAC20\\dir1\\a.txt");
	 int ch=-1;
	 int space=0;
	 int count=0;
	 while((ch=f.read())!=-1)
	 {
		 if((char)ch==' ' || (char)ch=='\t' || (char)ch=='`' || (char)ch==',' || (char)ch=='~' || (char)ch=='.')
		 {
			 count++;
		 }
	 }
	 System.out.println("number of word = "+(count+1));*/
	 String line;  
     int count = 0;  
       
     //Opens a file in read mode  
     FileReader file = new FileReader("F:\\CDAC20\\dir1\\a.txt");  
     BufferedReader br = new BufferedReader(file);  
           
     //Gets each line till end of file is reached  
     while((line = br.readLine()) != null) {  
         //Splits each line into words  
         String words[] = line.split(" ");  
         //Counts each word  
         count = count + words.length;  
     }  
       
     System.out.println("Number of words present in given file: " + count);  
     br.close();  
}
}
