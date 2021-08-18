package fileio;
import java.io.*;
public class writeintofile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	File f=new File("abc.txt");
FileWriter fw=new FileWriter("abc.txt");
fw.write(100);
fw.write('A');
fw.write('s');
fw.write('S');
fw.flush();
fw.close();

	}

}
