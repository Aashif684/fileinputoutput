package fileio;

import java.io.File;

public class createfile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		File f1=new File("File IO");
		f1.mkdir();
		File f=new File("File IO","abc.txt");
		f.createNewFile();
		System.out.println(f.exists());
		String[] s=f.list();
		System.out.println(s);
		
	}

}
