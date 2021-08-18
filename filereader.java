package fileio;
import java.io.*;
public class filereader {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//File f=new File("abc.txt");
		
FileReader fr=new FileReader("abc.txt");
int i=fr.read();
while(i!=-1) {
	System.out.println((char)i);
	i=fr.read();
}
	}

}
